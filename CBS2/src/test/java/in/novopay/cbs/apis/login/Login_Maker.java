package in.novopay.cbs.apis.login;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;

import in.novopay.cbs.apis.getEncryptionKey;
import in.novopay.cbs.apis.AccountingMicroservice.Login;
import in.novopay.cbs.utils.JavaUtils;

public class Login_Maker {
	String APINAME = "login", testType = "checker", vmName = "Login.vm",workbook="userAndRolesWorkbook",serviceName="ACTOR";
	JavaUtils javaUtils = new JavaUtils();
	Login login;
	HashMap<String, String> usrData;
	String publicKey;

	@BeforeSuite
	public void readConfig() {
		javaUtils.readConfigProperties();
		getEncryptionKey getencryptionKey_Positive = new getEncryptionKey();
		getencryptionKey_Positive.getEncryptionKeyTest(javaUtils.readExcelData(workbook, "getEncryptionKey", "GetEncryptionKey_01"));
		publicKey = getencryptionKey_Positive.encryptedPublicKey;
	}

	@Test(dataProvider = "getTestData")
	public void loginTest(HashMap<String, String> usrData) {
		this.usrData = usrData;
		login = new Login();
		HashMap<String, String> headers = login.getHeaders(usrData);
		//List<String> bodyHeaders = login.getBodyHeaders(usrData);
		String requestBody = login.getRequestBody(usrData,publicKey);
		//String request = login.insertDataToJSONRequest(vmName, bodyHeaders, requestBody);
		String response = login.postRequest(APINAME, requestBody, headers);
		JsonPath json = new JsonPath(response);
		login.assertAPIResponseStatus(APINAME, usrData, response);
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
