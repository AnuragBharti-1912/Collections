package in.novopay.cbs.ui_pages;

import java.util.HashMap;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import in.novopay.cbs.utils.BasePage;

public class NavigationMenuSidebar extends BasePage {
	// nav[@class='page-controls navbar navbar-dashboard']//a[@class='nav-link
	// hidden-md-down']
	@FindBy(xpath = "//layout[@class='app nav-collapsed']//a[@class='nav-link hidden-md-down']")
	WebElement navigationButton;

	@FindBy(xpath = "//nav[@class='sidebar']//a[@title='General Ledger']/span")
	WebElement glNav;
	
	@FindBy(xpath = "//nav[@class='sidebar']//a[@title='Office Management']")
	WebElement officeNav;
	
	@FindBy(xpath = "//nav[@class='sidebar']//a[@title='Role Management']")
	WebElement roleNav;

	public NavigationMenuSidebar(WebDriver wdriver) {
		super(wdriver);
		PageFactory.initElements(wdriver, this);
	}

	public void navigate(HashMap<String, String> usrData) {
		try {
			WebDriverWait wait = new WebDriverWait(wdriver, 5);
			waitUntilBlockUI();
			wait.until(ExpectedConditions.elementToBeClickable(navigationButton));
			navigationButton.click();
		} catch (NoSuchElementException | TimeoutException e) {
			Reporter.log("Side Nav bar already expanded.", true);
		}
		if (usrData.get("Action").equalsIgnoreCase("General Ledger")) {
			waitUntilElementClickable(glNav);
			glNav.click();
		} else if (usrData.get("Action").equalsIgnoreCase("Office")) {
			waitUntilElementClickable(officeNav);
			officeNav.click();
		} else if (usrData.get("Action").equalsIgnoreCase("Role")) {
			waitUntilElementClickable(roleNav);
			roleNav.click();
		} 

	}
}
