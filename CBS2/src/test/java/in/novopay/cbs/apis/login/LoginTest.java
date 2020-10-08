package in.novopay.cbs.apis.login;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;

import in.novopay.cbs.apis.getEncryptionKey;
import in.novopay.cbs.apis.AccountingMicroservice.Login;
import in.novopay.cbs.utils.JavaUtils;


public class LoginTest {
	public String APINAME = "login", testType = "Positive",sheetName="login", vmName = "Login.vm",workbook="userAndRolesWorkbook",serviceName="ACTOR";
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
		//System.out.println("Hello**************************************");
		this.usrData = usrData;
		login = new Login();
		HashMap<String, String> headers = login.getHeaders(usrData);

		String requestBody = login.getRequestBody(usrData,publicKey);

		String response = login.postRequest(APINAME, requestBody, headers);
		JsonPath json = new JsonPath(response);
		login.assertAPIResponseStatus(APINAME, usrData, response);
		String SessionToken=json.get("session_token");
		javaUtils.addTestDataIni("SessionToken",SessionToken);
		System.out.println(SessionToken);
		String UserId=json.getString("user_details.id");
		javaUtils.addTestDataIni("UserId",UserId);

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
