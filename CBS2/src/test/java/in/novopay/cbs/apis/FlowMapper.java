package in.novopay.cbs.apis;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import in.novopay.cbs.utils.JavaUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FlowMapper {
	
	public AndroidDriver<MobileElement> mdriver;
	public WebDriver wdriver;
	private String sheetName;
	private JavaUtils javaUtils = new JavaUtils();
	private Map<String, String> usrData;
	private Object obj;
	private String errMsg;
	private String testCaseID = "";
    private String packageName = "";
	private String stepNo = "";
	private String className = "";
	private String currentPackage = "";
	private String classNameWithPackage, workbook = "UITestData", pack;
	private Set<String> flows; 
	//private BasePage wBasePage = new BasePage(wdriver);
	private boolean previouseFailed = false;

	@BeforeSuite
	public void generateIniFile() throws Exception {
		javaUtils.readConfigProperties();
	//	javaUtils.deleteReportFile();
		//Configurations config = new Configurations();
		//config.loginTest();
		// new changes
		//File folder = new File("./Screenshots");
		/*
		 * for (File file : folder.listFiles()) { file.delete();
		 * //Log.info("previous screenshot deleted"); }
		 */
		
	}

	@Test(dataProvider = "getData")
	public void flowMapperTest(HashMap<String, String> usrData) throws Throwable {
		this.usrData = usrData;
		if(previouseFailed ){
			return;
		}
		System.out.println("Excuting flow: " + usrData.get("TCID"));
		for (String flowTestID : flows) {
			System.out.println(flowTestID);
			if ((!usrData.get(flowTestID).toLowerCase().contains("skip")) && (!usrData.get(flowTestID).isEmpty())) {
				testCaseID = usrData.get(flowTestID);
				System.out.println("this is"+ testCaseID);
				currentPackage = getClass().getPackage().getName();
				//System.out.println(currentPackage);
				className = testCaseID.split("_")[0];
			   // System.out.println(className);
			  String  packageName=className.toLowerCase();
			  this.packageName=packageName.substring(0,packageName.length()-4);
			 // System.out.println("package name is"+ this.packageName);
			    
				classNameWithPackage = currentPackage+ className;
				Class<?> flow = null;
				stepNo = flowTestID;
				try {
					flow = Class.forName(classNameWithPackage);
					pack = "api";
				} catch (ClassNotFoundException e) {
					classNameWithPackage = currentPackage + "." +this.packageName+"."+ className;
					flow = Class.forName(classNameWithPackage);
					System.out.println(flow);
					pack = "ui";
				
				}

				String pattern = Character.toLowerCase((className + "Test").charAt(0))
						+ (className + "Test").substring(1, (className).length());
				System.out.println(pattern);
				Pattern r = Pattern.compile(pattern);
				System.out.println(r);

				try {
					obj = flow.newInstance();
					Method[] method = obj.getClass().getDeclaredMethods();
					for (int i = 0; i < method.length; i++) {
						String message = method[i].toString();
						Matcher m = r.matcher(message);
						if (m.find()) {
							String sheetname = obj.getClass().getDeclaredField("sheetName").get(obj).toString();
							System.out.println("this is sheet name "+sheetname);
							String workbook = obj.getClass().getDeclaredField("workbook").get(obj).toString();
							// write if condition to switch if api class is
							
						//	System.out.println("this is workbook name"+workbook);
							System.out.println(usrData.get(flowTestID));
								HashMap<String, String> data = javaUtils.readExcelData(workbook, sheetname,
										usrData.get(flowTestID));
								method[i].invoke(obj, data);
							

						}
					}

				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
					throw e.getCause();

				}
			}
		}
	}

	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, InvalidFormatException, IOException {
		sheetName = JavaUtils.configProperties.get("fowmapperSheet");
		Object[][] data = javaUtils.returnAllUniqueValuesInMap(workbook, sheetName, "no-check");
		if (data.length != 0) {

			HashMap<String, String> datamap = (HashMap<String, String>) data[0][0];
			//System.out.println(data[0][0]);
			flows = new TreeSet<>(datamap.keySet());
		//	System.out.println(flows);
			flows = new TreeSet<>(datamap.keySet().stream().filter(s -> s.toLowerCase().startsWith("step"))
					.collect(Collectors.toSet()));
	//	System.out.println(flows);
		}
		return data;
	}


	@AfterMethod
	public void result(ITestResult result) throws InvalidFormatException, IOException {
		if(!previouseFailed){
		String failureReason = "";
		String flowName = "Platfrom Positive flows";
		String testStartTime = javaUtils.getTestExcutionTime(result.getStartMillis());
		String testEndTime = javaUtils.getTestExcutionTime(result.getEndMillis());
	//	wBasePage.captureScreenshotOnFailedTest(result, testCaseID);
		if (!result.isSuccess()) {
			failureReason = errMsg;
			failureReason = "Failed in: " + stepNo + ": " + testCaseID + ": " + result.getThrowable() + "";
		}
		String[] execeutionDtls = {
				  JavaUtils.configProperties.get("buildNumber"),"NA",usrData.get("TCID"),
				  usrData.get("DESCRIPTION"),
				  javaUtils.getExecutionResultStatus(result.getStatus()), failureReason };
				  javaUtils.writeExecutionStatusToExcel(execeutionDtls); 
			
				  
		}
		

		if (!result.isSuccess()){
			System.out.println("Failure Occured in Test");
			previouseFailed = true;
			//System.exit(0);
		}
			
	}
	}


