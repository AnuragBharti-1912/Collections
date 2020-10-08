package in.novopay.cbs.ui_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.novopay.cbs.utils.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class InternalAccountDefinitionListPage extends BasePage {
	//a[@title="Internal Account Management"]
	
	@FindBy(xpath = "//a[@title='Internal Account Management']")
	WebElement InternalAccountManagement ;
	@FindBy(xpath = "//a[@title='Definitions']")
	WebElement Definition ;
	
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	WebElement Create;
	
	@FindBy(xpath ="//input[@id='internal-account-definition-name']")
	WebElement Name ;
	
	@FindBy(xpath ="//textarea[@id='internal-account-definition-description']")
	WebElement Description ;
	
	
	@FindBy(xpath ="//span[@id='select2-rmwv-container']")
	WebElement GlSearchContainer;
	
	@FindBy(xpath ="//span[@id='select2-gvzm-container']")
	WebElement OffsetAccountTypeContainer;
	
	
	
	
	
	//span[@id="select2-gvzm-container"]
	

	public InternalAccountDefinitionListPage(WebDriver wdriver) {
		super(wdriver);
		
	}

}
