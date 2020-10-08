package in.novopay.cbs.apis.ActorMicroservice;

import java.io.IOException;
import java.util.HashMap;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.jayway.restassured.path.json.JsonPath;

import in.novopay.cbs.apis.AccountingMicroservice.createorupdateproductscheme.CreateOrUpdateProductScheme;
import in.novopay.cbs.utils.JavaUtils;

public class createOrUpdateProductSchemeTest {


	public String APINAME = "createOrUpdateProductScheme", testType = "Negative",packageName="createorupdateproductscheme",
			workbook = "accountingWorkbook", serviceName = "ACCOUNTING", sheetName="createOrUpdateProductScheme";
	JavaUtils javaUtils = new JavaUtils();
	CreateOrUpdateProductScheme createOrUpdateProductScheme;
	HashMap<String, String> usrData;

	@BeforeSuite
	public void readConfig() {
		javaUtils.readConfigProperties();
	}

	@Test(dataProvider = "getTestData")
	public void createOrUpdateProductSchemeTest(HashMap<String, String> usrData) {
		this.usrData = usrData;
		System.out.println("Executing test case : " + usrData.get("TCID"));
		createOrUpdateProductScheme = new CreateOrUpdateProductScheme();
		HashMap<String, String> headers = createOrUpdateProductScheme.getHeaders(usrData);

		String requestBody = createOrUpdateProductScheme.getRequestBody(serviceName,usrData);

		String response = createOrUpdateProductScheme.postRequest(APINAME, requestBody, headers);
		JsonPath jpath = new JsonPath(response);
		if(jpath.getString("response_status.status").equalsIgnoreCase("SUCCESS")) {
			String message=jpath.getString("response_status.message");
			String productSchemeCode=message.substring(message.indexOf('(')+1, message.indexOf(')'));
			javaUtils.addTestDataIni("productSchemeCode", productSchemeCode);
		}
		createOrUpdateProductScheme.assertAPIResponseStatus(APINAME, usrData, response);



	}

	@DataProvider
	public Object[][] getTestData() {
		Object[][] allValues = javaUtils.returnAllUniqueValuesInMap(workbook, APINAME, testType);

		return allValues;

	}

	@AfterMethod
	public void result(ITestResult result) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {

		String failureReason = "";

		if (!result.isSuccess()) {
			failureReason = javaUtils.getFailureReason().isEmpty() ? result.getThrowable() + ""
					: javaUtils.getFailureReason() + "";
		}
		String[] execeutionDtls = { JavaUtils.configProperties.get("buildNumber"), APINAME, usrData.get("TCID"),
				usrData.get("DESCRIPTION"), javaUtils.getExecutionResultStatus(result.getStatus()), failureReason };
		javaUtils.writeExecutionStatusToExcel(execeutionDtls);
	}
	@AfterSuite
	public void clearSessionToken(){
		JavaUtils.configProperties.remove(usrData.get("user_handle_value")+usrData.get("user_handle_value")+"session");
	}

}

