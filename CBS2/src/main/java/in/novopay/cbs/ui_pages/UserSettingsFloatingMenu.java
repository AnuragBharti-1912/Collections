package in.novopay.cbs.ui_pages;

import java.util.HashMap;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import in.novopay.cbs.utils.BasePage;

public class UserSettingsFloatingMenu extends BasePage {

	@FindBy(xpath = "//td[@class='profile-options']/i")
	WebElement userOptionDropDown;

	@FindBy(xpath = ".//a[contains(text(),'Log')]/..")
	WebElement logOut;

	public UserSettingsFloatingMenu(WebDriver wdriver) {
		super(wdriver);
		PageFactory.initElements(wdriver, this);
	}

	public void userSettings(HashMap<String, String> usrData) {
		boolean flag = true;

		waitUntilElementClickable(userOptionDropDown);
		click(userOptionDropDown);
		if (usrData.get("Action").equalsIgnoreCase("Logout")) {
			do {
				try {
					waitUntilElementClickable(logOut);
					logOut.click();
					flag = false;
				} catch (NoSuchElementException | WebDriverException e) {
					Reporter.log("Unable to perform user " + usrData.get("Action") + " action", true);
				}
			} while (flag);

		}

	}

}
