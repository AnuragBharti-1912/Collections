package in.novopay.cbs.ui;

import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
//import in.novopay.cbs.ui_pages.OfficeListPage;
import in.novopay.cbs.utils.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
/**
public class OfficePageTest {
	public AndroidDriver<MobileElement> mdriver;
	public WebDriver wdriver;
	private BasePage mBasePage = new BasePage(wdriver);
	private OfficeListPage officeListPage;
	public String sheetname = "OfficePage", workbook = "UITestData";

	public void officePageTest(HashMap<String, String> usrData) {
		String testOn = usrData.get("TESTON");
		if (testOn.toUpperCase().equals("MOBILE")) {
			System.out.println("LAUNCHING THE MOBILE APP FOR FLOW : " + usrData.get("TCID"));
			if (mdriver == null) {
				try {
					mdriver = mBasePage.launchApp(usrData.get("DEVICE"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else if (testOn.toUpperCase().equals("WEB")) {
			if (wdriver == null) {
				System.out.println("Launching the web browser for the test case : " + usrData.get("TCID"));
				wdriver = mBasePage.launchBrowser();
			} else if ((wdriver != null)) {
				System.out.println("Using the web browser for the test case : " + usrData.get("TCID"));
			}
			officeListPage = new OfficeListPage(wdriver);
			officeListPage.officeTest(usrData);
		}
	}
}
*/