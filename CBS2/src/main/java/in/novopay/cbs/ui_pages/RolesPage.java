package in.novopay.cbs.ui_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RolesPage {

	@FindBy(xpath = "//*[@class='page-title' and contains(text(),'Roles')]")
	WebElement rolesListPageTitle;

	@FindBy(xpath = "//button[contains(text(),'Create Role')]")
	WebElement createRole;
	
	@FindBy(xpath = "//*[@class='page-title' and contains(text(),'Create Role')]")
	WebElement createGeneralLedgerPageTitle;

	@FindBy(id = "role-rbac-code")
	WebElement roleCodeInput;

	@FindBy(id = "role-name")
	WebElement roleNameInput;
	
	@FindBy(id="role-description")
	WebElement roleDescriptionInput;

	@FindBy(xpath = "//label[contains(text(),'Parent Role')]/..//*[@class='select2-selection__arrow']")
	WebElement parentRoleDropDownArrow;

	@FindBy(className = "select2-search__field")
	WebElement categorySearch;

	@FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted']")
	WebElement dropDownSearchResult;
	
	@FindBy(xpath="//div[@id='Finance']")
	WebElement finance;
	
//	Internal Account Management
	String parentCategory ="//label[contains(.,'%s')]/parent::div/input[@type='checkbox']";
	
//	String 
	
}
