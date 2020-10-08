package in.novopay.cbs.apis;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;

import in.novopay.cbs.apis.AccountingMicroservice.GetEncryptionKey;
import in.novopay.cbs.utils.ApiUtils;
import in.novopay.cbs.utils.JavaUtils;

public class getEncryptionKey {
	
	String APINAME = "getEncryptionKey", testType = "Positive", vmName = "GetEncryptionKey.vm",workbook="userAndRolesWorkbook",serviceName="ACTOR";
	JavaUtils javaUtils = new JavaUtils();
	GetEncryptionKey getEncryptionKey;
	HashMap<String, String> usrData;
	public String encryptedPublicKey;

	@BeforeSuite
	public void readConfig() {
		javaUtils.readConfigProperties();
	}

	@Test(dataProvider = "getTestData")
	public void getEncryptionKeyTest(HashMap<String, String> usrData) {
		this.usrData = usrData;
		getEncryptionKey = new GetEncryptionKey();
		HashMap<String, String> headers = getEncryptionKey.getHeaders(usrData);
		//List<String> bodyHeaders = getEncryptionKey.getBodyHeaders(usrData);
	String requestBody = getEncryptionKey.getRequestBody(usrData);
		//String request = getEncryptionKey.insertDataToJSONRequest(vmName, bodyHeaders, requestBody);
		String response = getEncryptionKey.postRequest(APINAME, requestBody, headers);
		JsonPath jpath = new JsonPath(response);
		encryptedPublicKey = jpath.get("key_value").toString();
		getEncryptionKey.assertAPIResponseStatus(APINAME, usrData, response);
	}

	@DataProvider
	public Object[][] getTestData() {
		Object[][] allValues = javaUtils.returnAllUniqueValuesInMap(workbook,APINAME, testType);

		return allValues;

	}

	@AfterMethod
	public void result(ITestResult result) throws InvalidFormatException, IOException {

		String failureReason = "";

		if (!result.isSuccess()) {
			failureReason = javaUtils.getFailureReason().isEmpty() ? result.getThrowable() + "": javaUtils.getFailureReason() + "";
		}
		String[] execeutionDtls = { JavaUtils.configProperties.get("buildNumber"),APINAME, usrData.get("TCID"), usrData.get("DESCRIPTION"),
				javaUtils.getExecutionResultStatus(result.getStatus()), failureReason };
		javaUtils.writeExecutionStatusToExcel(execeutionDtls);
	}

}
