package in.novopay.cbs.ui_pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import in.novopay.cbs.utils.BasePage;
import in.novopay.cbs.utils.Log;

public class GeneralLedgerListPage extends BasePage {

	@FindBy(xpath = "//*[@class='page-title' and contains(text(),'General Ledger List')]")
	WebElement generalLedgerListPageTitle; 

	@FindBy(xpath = "//button[contains(text(),'Create General Ledger')]")
	WebElement createGLButton;

	@FindBy(xpath = "//*[@class='page-title' and contains(text(),'Create General Ledger')]")
	WebElement createGeneralLedgerPageTitle;

	@FindBy(id = "general-ledger-code")
	WebElement glCodeInput;

	@FindBy(id = "general-ledger-name")
	WebElement glNameInput;

	@FindBy(id = "general-ledger-external-reference-number")
	WebElement extRefNoInput;

	@FindBy(xpath = ".//label[contains(text(),'Category')]/..//*[@class='select2-selection__arrow']")
	WebElement categoryDropDownArrow;

	@FindBy(className = "select2-search__field")
	WebElement categorySearch;

	@FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted']")
	WebElement dropDownSearchResult;

	@FindBy(xpath = ".//label[contains(text(),'Currency')]/..//*[@class='select2-selection__arrow']")
	WebElement currencyDropDownArrow;

	@FindBy(xpath = ".//*[@id='balance-type-BAL_TYP_DR']/..")
	WebElement debitBalanceTypeRadio;

	@FindBy(xpath = ".//*[@id='balance-type-BAL_TYP_CR']/..")
	WebElement creditBalanceTypeRadio;

	@FindBy(xpath = ".//*[@id='allowed-transaction-type-ALD_TXN_TYP_DR']/..")
	WebElement debitTransactionTypeRadio;

	@FindBy(xpath = ".//*[@id='allowed-transaction-type-ALD_TXN_TYP_CR']/..")
	WebElement creditTransactionTypeRadio;

	@FindBy(xpath = ".//*[@id='allowed-transaction-type-ALD_TXN_TYP_BOT']/..")
	WebElement bothTransactionTypeRadio;

	@FindBy(xpath = ".//*[@id='general-ledger-description']")
	WebElement glDescriptionInput;

	@FindBy(xpath = ".//button[contains(text(),'Submit')]")
	WebElement glSubmitButton;

	@FindBy(xpath = ".//button[contains(text(),'Cancel')]")
	WebElement glCancelButton;

	@FindBy(xpath = ".//button[contains(text(),'Save as Draft')]")
	WebElement glSaveButton;

	String glCreationSuccessToast = ".//div[@class='toast toast-success']//div[contains(text(),'General Ledger (%s) - Creation sent for approval')]";

	String glCreationApprovalSuccessToast = ".//div[@class='toast toast-success']//div[contains(text(),'General Ledger (%s) - Creation has been approved')]";

	String glUpdateSuccessToast = ".//div[@class='toast toast-success']//div[contains(text(),'General Ledger (%s) - Update sent for approval')]";
	
	String glApprovalSuccessToast = ".//*[contains(.,'General Ledger (%s)') and 'has been approved'= substring(.,string-length(.)- string-length('has been approved')+1)]";

	@FindBy(xpath = ".//div[@class='toast toast-error']//div[contains(text(),'Task pending for approval')]")
	WebElement glPendingApprovalToast;

	@FindBy(xpath = "//div[@class='toast-close-button']")
	WebElement toasterCloseButton;

	// Approve gl

	@FindBy(xpath = "//div[@class='list-nav-bar']//span[contains(text(),'Pending Actions')]")
	WebElement pendingActionTab;

	String glRow = "//tr/td/span[contains(text(),'%s')]";

	@FindBy(xpath = "//div[@class='list-nav-bar']//span[contains(text(),'Approved')]")
	WebElement approvedActionTab;

	@FindBy(xpath = "//div[@class='page-size']//select")
	WebElement pageSizeDropDown;

	String pageSize = "100";

	@FindBy(xpath = "//a[@class='page-link' and text()='Next']")
	WebElement nextPage;

	@FindBy(xpath = "//h1[contains(text(),'Approval')]")
	WebElement approveCreateGLPageTitle;

	@FindBy(xpath = ".//button[contains(text(),'Approve')]")
	WebElement approveGLButton;

	@FindBy(xpath = ".//*[contains(text(),'Approval (Create General Ledger)')]/..//button[contains(text(),'Reject')]")
	WebElement rejectGLButton;

	@FindBy(xpath = ".//*[contains(text(),'Approval (Create General Ledger)')]/..//button[contains(text(),'Send for Clarification')]")
	WebElement sendForClarrificationGLButton;

	@FindBy(xpath = ".//*[contains(text(),'Approval (Create General Ledger)')]/..//button[contains(text(),'Go Back')]")
	WebElement goBackGLButton;

	// Update GL
	@FindBy(xpath = "//button[@title='Search Fields']")
	WebElement searchButton;

	@FindBy(xpath = "//table[contains(@class,'search-enabled')]")
	WebElement table;

	@FindBy(xpath = "//th[contains(text(),'Code')]")
	WebElement codeSearchLabel;

	@FindBy(xpath = "//th[contains(text(),'Name')]")
	WebElement nameSearchLabel;

	@FindBy(xpath = "//th[contains(text(),'Category')]")
	WebElement categorySearchLabel;

	@FindBy(xpath = "//th[contains(text(),'Currency')]")
	WebElement currencySearchLabel;

	// update gl from list
	@FindBy(xpath = ".//i[@title='Edit Record']")
	WebElement updateGLListButton;

	@FindBy(xpath = ".//*[contains(text(),'General Ledger Details')]/..//button[contains(text(),'Update General Ledger')]")
	WebElement updateGLButton;

	String updateGLPageTitle = "Update General Ledger (%s)";

	@FindBy(xpath = "//h1[contains(.,'Approval') and 'General Ledger)'=substring(.,string-length(.)- string-length('General Ledger)')+1)]")
	WebElement approveGLPageTitle;

	// delete gl from list
//	@FindBy(xpath = )
	String deleteGLListButton = "//i[@title='Delete Record']";

	@FindBy(xpath = ".//confirm-delete//button[contains(text(),'Confirm')]")
	WebElement confirmDeleteGLButton;

	String glDeletionCreateSuccessToast = ".//div[@class='toast toast-success']//div[contains(text(),'General Ledger (%s) - Deletion sent for approval')]";

	@FindBy(xpath = ".//*[contains(text(),'General Ledger Details')]/..//button[contains(text(),'Delete General Ledger')]")
	WebElement deleteGLButton;

	// clone gl
	@FindBy(xpath = ".//i[@title='Create a copy']")
	WebElement cloneGLListButton;

	@FindBy(xpath = ".//*[contains(text(),'General Ledger Details')]/..//button[contains(text(),'Clone General Ledger')]")
	WebElement cloneGLButton;

	WebDriverWait wait = new WebDriverWait(wdriver, 5);

	public GeneralLedgerListPage(WebDriver wdriver) {
		super(wdriver);
		PageFactory.initElements(wdriver, this);
	}

	public void generalLedgerTest(HashMap<String, String> usrData) {
		try {

			if (usrData.get("Action").equalsIgnoreCase("CreateGL")) {
				waitUntilElementAppears(generalLedgerListPageTitle);
				waitUntilBlockUI();
				createGLButton.click();
				createGL(usrData);
			} else if (usrData.get("Action").toLowerCase().contains("approve")) {
				waitUntilElementAppears(generalLedgerListPageTitle);
				waitUntilBlockUI();
				pendingActionTab.click();
				approveGL(usrData);
			} else if (usrData.get("Action").equalsIgnoreCase("EditGL")) {
				waitUntilElementAppears(generalLedgerListPageTitle);
				waitUntilBlockUI();
				approvedActionTab.click();
				updateGL(usrData);
			}  else if (usrData.get("Action").equalsIgnoreCase("DeleteGL")) {
				waitUntilElementAppears(generalLedgerListPageTitle);
				waitUntilBlockUI();
				waitUntilElementClickable(approvedActionTab);
				approvedActionTab.click();
				deleteGL(usrData);
			} else if (usrData.get("Action").equalsIgnoreCase("CloneGL")) {
				waitUntilElementAppears(generalLedgerListPageTitle);
				waitUntilBlockUI();
				waitUntilElementClickable(approvedActionTab);
				approvedActionTab.click();
				cloneGL(usrData);
			} else if (usrData.get("Action").equalsIgnoreCase("CloneGLData")) {
				waitUntilBlockUI();
				createGL(usrData);
			}
		} catch (NoSuchElementException | InterruptedException e) {
			Log.info("Not on GL List page", true);
		}
	}

	private void createGL(HashMap<String, String> usrData) {
		try {
			waitUntilElementAppears(createGeneralLedgerPageTitle);
			//String glCode = getValue(usrData.get("GLCode"));
			//sendKeys(glCodeInput, glCode);
			//sendKeys(glNameInput, getValue(usrData.get("GLName")));
		//	sendKeys(extRefNoInput, getValue(usrData.get("GLExternalRefNumber")));
			//    selecting category
			// updating keys to start with
			selectDropDown(categoryDropDownArrow, categorySearch, dropDownSearchResult, usrData.get("Category"));
			// selecting currency
			selectDropDown(currencyDropDownArrow, categorySearch, dropDownSearchResult, usrData.get("Currency"));
			if (usrData.get("BalanceType").equalsIgnoreCase("debit")) {
				debitBalanceTypeRadio.click();
			} else if (usrData.get("BalanceType").equalsIgnoreCase("credit")) {
				creditBalanceTypeRadio.click();
			}
			if (usrData.get("AllowedTransactionType").equalsIgnoreCase("debit")) {
				debitTransactionTypeRadio.click();
			} else if (usrData.get("AllowedTransactionType").equalsIgnoreCase("credit")) {
				creditTransactionTypeRadio.click();
			} else if (usrData.get("AllowedTransactionType").equalsIgnoreCase("both")) {
				bothTransactionTypeRadio.click();
			}
			sendKeys(glDescriptionInput, generateRandomStan());
			waitUntilElementClickable(glSubmitButton);
			glSubmitButton.click();
			boolean flag = true;
			try {
				wait.until(ExpectedConditions.visibilityOf(glPendingApprovalToast));
				waitUntillElementDisappears(glPendingApprovalToast);
				System.out.println("Task already pending for approval, skipping succes toast check");
				flag = false;
				toasterCloseButton.click();
			} catch (NoSuchElementException | TimeoutException e) {
			}
			if (usrData.get("TestType").equalsIgnoreCase("positive") && flag) {
				try {
				//	waitUntilElementAppears(formatXpath(glCreationSuccessToast, glCode));
				//waitUntillElementDisappears(String.format(glCreationSuccessToast, glCode));
					Log.info("Toaster message found and validated.");
				} catch (NoSuchElementException e) {
					Assert.fail("Success toaster message not found.");
				}
			}

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void updateGL(HashMap<String, String> usrData) {
		// search for the GL in List page
		searchGL(usrData);
		// add code to delete from list page
		if (usrData.get("SubAction").toLowerCase().contains("list")) {
			waitUntilElementClickable(updateGLListButton);
			updateGLListButton.click();
			Reporter.log("Updating using list action button.", true);
		} else {
			waitUntilElementClickable(updateGLButton);
			updateGLButton.click();
		}
		updateGLPage(usrData);
	}

	public void updateGLPage(HashMap<String, String> usrData) {
		try {
			waitUntilElementAppears(String.format(updateGLPageTitle, usrData.get("GLCode")));
			//sendKeys(glNameInput, getValue(usrData.get("UpdateGLName")));
			//sendKeys(extRefNoInput, getValue(usrData.get("UpdateGLExternalRefNumber")));
			if (usrData.get("UpdateAllowedTransactionType").equalsIgnoreCase("debit")) {
				debitTransactionTypeRadio.click();
			} else if (usrData.get("UpdateAllowedTransactionType").equalsIgnoreCase("credit")) {
				creditTransactionTypeRadio.click();
			} else if (usrData.get("UpdateAllowedTransactionType").equalsIgnoreCase("both")) {
				bothTransactionTypeRadio.click();
			}
			sendKeys(glDescriptionInput, generateRandomStan());
			waitUntilElementClickable(glSubmitButton);
			glSubmitButton.click();

			/*
			 * add here code for update notes and attachments
			 */

			boolean flag = true;
			try {
				wait.until(ExpectedConditions.visibilityOf(glPendingApprovalToast));
				waitUntillElementDisappears(glPendingApprovalToast);
				System.out.println("Task already pending for approval, skipping succes toast check");
				flag = false;
				toasterCloseButton.click();
			} catch (NoSuchElementException | TimeoutException e) {
			}
			if (usrData.get("TestType").equalsIgnoreCase("positive") && flag) {
				try {
					waitUntilElementAppears(formatXpath(glUpdateSuccessToast, usrData.get("GLCode")));
					waitUntillElementDisappears(String.format(glUpdateSuccessToast, usrData.get("GLCode")));
					Log.info("Toaster message found and validated.");
				} catch (NoSuchElementException e) {
					Assert.fail("Success toaster message not found.");
				}
			}

		} catch (NoSuchElementException e) {

		}
	}

	private void approveGL(HashMap<String, String> usrData) throws InterruptedException {
		String glCode = null;
		try {
		//	glCode = getValue(usrData.get("GLCode"));
			waitUntilBlockUI();
			findAndScrollToElement(String.format(glRow, glCode)).click();
		} catch (NoSuchElementException e) {
			selectDropdown(pageSizeDropDown, pageSize);
			do {
				try {
					WebElement glRecord = findAndScrollToElement(String.format(glRow, glCode));
					glRecord.click();
					break;
				} catch (NoSuchElementException f) {
					waitUntilBlockUI();
					scrollToElement(nextPage);
					waitUntilElementClickable(nextPage);
					try {
						nextPage.click();
					} catch (WebDriverException g) {
						Reporter.log("Missed to click on gl record row. Trying to click again on the row.");
						WebElement glRecord = findAndScrollToElement(String.format(glRow, glCode));
						findAndScrollToElement(String.format(glRow, glCode));
						glRecord.click();
						break;
					}
				}
			} while (nextPage.isEnabled());

		}
		 if (usrData.get("Action").toLowerCase().contains("approve")) {
			waitUntilElementAppears(approveGLPageTitle);
			Reporter.log("On Approve GL page.", true);
			waitUntilElementClickable(approveGLButton);
			approveGLButton.click();
			if (usrData.get("TestType").equalsIgnoreCase("positive")) {
				try {
				//	waitUntilElementAppears(formatXpath(glApprovalSuccessToast, getValue(usrData.get("GLCode"))));
					//waitUntillElementDisappears(
						//	String.format(glApprovalSuccessToast, getValue(usrData.get("GLCode"))));
					Log.info("Toaster message found and validated.");
				} catch (NoSuchElementException e) {
					// Assert.fail("Success toaster message not found.");
				}
			}
		} 
	}

	// delete gl
	public void deleteGL(HashMap<String, String> usrData) {
		searchGL(usrData);
		// deleteGLListButton
		if (usrData.get("SubAction").toLowerCase().contains("list")) {
			//String xpath = String.format(glRow, getValue(usrData.get("GLCode"))) + "/ancestor::tr" + deleteGLListButton;
			//System.out.println(xpath);
			//waitUntilElementClickable(xpath).click();

		} else {
			waitUntilElementClickable(deleteGLButton);
			deleteGLButton.click();
		}
		// common confirmation delete message
		waitUntilElementClickable(confirmDeleteGLButton);
		confirmDeleteGLButton.click();
		// validating toaster message
		boolean flag = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(glPendingApprovalToast));
			waitUntillElementDisappears(glPendingApprovalToast);
			System.out.println("Task already pending for approval, skipping succes toast check");
			flag = false;
			toasterCloseButton.click();
		} catch (NoSuchElementException | TimeoutException e) {
		}
		if (usrData.get("TestType").equalsIgnoreCase("positive") && flag) {
			try {
				waitUntilElementAppears(formatXpath(glDeletionCreateSuccessToast, usrData.get("GLCode")));
				waitUntillElementDisappears(String.format(glDeletionCreateSuccessToast, usrData.get("GLCode")));
				Log.info("Toaster message found and validated.");
			} catch (NoSuchElementException e) {
				Assert.fail("Success toaster message not found.");
			}
		}
		Reporter.log("GL deletion send for approval.", true);
	}

	public void cloneGL(HashMap<String, String> usrData) {
		searchGL(usrData);
		if (usrData.get("SubAction").toLowerCase().contains("list")) {
			waitUntilElementClickable(cloneGLListButton);
			cloneGLListButton.click();

		} else {
			waitUntilElementClickable(cloneGLButton);
			cloneGLButton.click();
		}
	}

	public WebElement searchGL(HashMap<String, String> usrData) {

		WebElement element = null;

		waitUntilBlockUI();
		waitUntilElementClickable(searchButton);
		searchButton.click();

		int index = getColumnNumberofElement(table, codeSearchLabel);
		wait.until(ExpectedConditions
				.elementToBeClickable(table.findElement(By.xpath("((//thead/tr)[2]/th)[" + (index + 1) + "]"))));
		WebElement searchInput = null;

		if (!usrData.get("GLCode").isEmpty()) {
			searchInput = table.findElement(By.xpath("((//thead/tr)[2]/th)[" + (index + 1) + "]/input"));
			waitUntilElementClickable(searchInput);
			//searchInput.sendKeys(getValue(usrData.get("GLCode")));
			searchInput.sendKeys(Keys.ENTER);
		}
		if (!usrData.get("GLName").isEmpty()) {
			index = getColumnNumberofElement(table, nameSearchLabel);
			searchInput = table.findElement(By.xpath("((//thead/tr)[2]/th)[" + (index + 1) + "]/input"));
			waitUntilElementClickable(searchInput);
			//searchInput.sendKeys(getValue(usrData.get("GLName")));
			searchInput.sendKeys(Keys.ENTER);
		}
		if (!usrData.get("Category").isEmpty()) {
			index = getColumnNumberofElement(table, categorySearchLabel);
			searchInput = table.findElement(
					By.xpath("((//thead/tr)[2]/th)[" + (index + 1) + "]//*[@class='select2-selection__arrow']"));
			waitUntilElementClickable(searchInput);
			selectDropDown(searchInput, categorySearch, dropDownSearchResult, usrData.get("Category"));
		}
		if (!usrData.get("Currency").isEmpty()) {
			index = getColumnNumberofElement(table, currencySearchLabel);
			searchInput = table.findElement(
					By.xpath("((//thead/tr)[2]/th)[" + (index + 1) + "]//*[@class='select2-selection__arrow']"));
			waitUntilElementClickable(searchInput);
			selectDropDown(searchInput, categorySearch, dropDownSearchResult, usrData.get("Currency"));
		}
		String glCode = null;
		try {
			//glCode = getValue(usrData.get("GLCode"));
			waitUntilBlockUI();
			WebElement glRecord = findAndScrollToElement(String.format(glRow, glCode));
			System.out.println(usrData.get("SubAction"));
			if (usrData.get("SubAction").isEmpty()) {
				glRecord.click();
			}
			element = glRecord;
		} catch (NoSuchElementException e) {
			selectDropdown(pageSizeDropDown, pageSize);
			do {
				try {
					WebElement glRecord = findAndScrollToElement(String.format(glRow, glCode));
					if (usrData.get("SubAction").isEmpty()) {
						glRecord.click();
					}
					element = glRecord;
					break;
				} catch (NoSuchElementException o) {
					waitUntilBlockUI();
					scrollToElement(nextPage);
					waitUntilElementClickable(nextPage);
					nextPage.click();
				}
			} while (nextPage.isEnabled());

		}
		return element;
	}

	public int getColumnNumberofElement(WebElement table, WebElement element) {

		// Logic to find row number but required here
		// WebElement rowOfElement =
		// table.findElement(By.xpath("//*[child::th[contains(text(),'Code')]]"));
		// list of rows in thead
		// List<WebElement> listofRows =
		// table.findElements(By.xpath("//table[contains(@class,'search-enabled')]/thead/tr"));
		// int rowNo = listofRows.indexOf(rowOfElement);

		// Total Number of Columns
		List<WebElement> listofHeaderElements = table.findElements(By.xpath("(//thead/tr)[1]/th"));
		int columnNo = listofHeaderElements.indexOf(element);
		return columnNo;
	}

}
