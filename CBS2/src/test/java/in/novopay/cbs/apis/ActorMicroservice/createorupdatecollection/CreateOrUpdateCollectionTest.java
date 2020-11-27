package in.novopay.cbs.apis.ActorMicroservice.createorupdatecollection;


import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.jayway.restassured.path.json.JsonPath;
import in.novopay.cbs.utils.JavaUtils;

public class CreateOrUpdateCollectionTest {

	public String APINAME = "createOrUpdateCollection", testType = "Negative", packageName="createorupdatecollection",
			workbook = "actorWorkbook", serviceName = "ACTOR", sheetName="createOrUpdateCollection";
	JavaUtils javaUtils = new JavaUtils();
	CreateOrUpdateCollection createOrUpdateCollection;
	HashMap<String, String> usrData;

	@BeforeSuite
	public void readConfig() {
		javaUtils.readConfigProperties();
	}

	@Test(dataProvider = "getTestData")
	public void createOrUpdateCollectionTest(HashMap<String, String> usrData) {
		this.usrData = usrData;
		System.out.println("Executing test case : " + usrData.get("TCID"));
		createOrUpdateCollection = new CreateOrUpdateCollection();
		HashMap<String, String> headers = createOrUpdateCollection.getHeaders(usrData);

		String requestBody = createOrUpdateCollection.getRequestBody(serviceName,usrData);

		String response = createOrUpdateCollection.postRequest(APINAME, requestBody, headers);
		JsonPath jpath = new JsonPath(response);
		if(jpath.getString("response_status.status").equalsIgnoreCase("SUCCESS")) {
			String message=jpath.getString("response_status.message");
			String productSchemeCode=message.substring(message.indexOf('(')+1, message.indexOf(')'));
			javaUtils.addTestDataIni("productSchemeCode", productSchemeCode);
		}
		createOrUpdateCollection.assertAPIResponseStatus(APINAME, usrData, response);
	}

	@DataProvider
	public Object[][] getTestData() {
		Object[][] allValues = javaUtils.returnAllUniqueValuesInMap(workbook, APINAME, testType);

		return allValues;

	}

	@AfterMethod
	public void result(ITestResult result) throws InvalidFormatException, IOException {

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
