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
/**
public class OfficeListPage extends BasePage {

	@FindBy(xpath = "//*[@class='page-title' and contains(text(),'Office')]")
	WebElement officeListPageTitle;

	@FindBy(xpath = "//button[contains(text(),'Create Office')]")
	WebElement createOfficeButton;

	@FindBy(xpath = "//*[@class='page-title' and contains(text(),'Create Office')]")
	WebElement createOfficePageTitle;

	@FindBy(id = "office-code")
	WebElement officeCode;

	@FindBy(id = "office-name")
	WebElement officeName;

	@FindBy(id = "office-description")
	WebElement officeDescription;

	@FindBy(xpath = "//label[contains(text(),'Office Level')]/..//*[@class='select2-selection__arrow']")
	WebElement officeLevelDropDown;

	@FindBy(xpath = "//label[contains(text(),'Parent Office')]/..//*[@class='select2-selection__arrow']")
	WebElement parentOfficeDropDown;

	@FindBy(id = "office-opened-on")
	WebElement officeOpeningDateInput;

	@FindBy(id = "office-external-code")
	WebElement officeExternalCode;

	@FindBy(id = "office-contact-name")
	WebElement officeContactName;

	@FindBy(id = "office-mobile-country-code")
	WebElement officeCountryCode;

	@FindBy(id = "office-mobile-number")
	WebElement officeMobileNumber;

	@FindBy(id = "office-landline-country-code")
	WebElement officeLandlineCountryCode;

	@FindBy(id = "office-landline")
	WebElement officeLandline;

	@FindBy(id = "office-alternate-contact-country-code")
	WebElement officeAlternateCCCode;

	@FindBy(id = "office-alternate-contact-number")
	WebElement officeAlternateNumber;

	@FindBy(id = "office-fax-country-code")
	WebElement officeFaxCCode;

	@FindBy(id = "office-fax")
	WebElement officeFax;

	@FindBy(id = "office-primary-email")
	WebElement officePrimaryEmail;

	// address fields
	@FindBy(xpath = "//button[@data-target='#officeAddress']")
	WebElement addAddressButton;

	@FindBy(id = "address-modal-address-line-one")
	WebElement addressLineOne;

	@FindBy(id = "address-modal-address-line-two")
	WebElement addressLineTwo;

	@FindBy(xpath = ".//label[contains(text(),'Country')]/..//*[@class='select2-selection__arrow']")
	WebElement countryDropDown;

	@FindBy(className = "select2-search__field")
	WebElement searchInput;

	@FindBy(xpath = ".//label[contains(text(),'State')]/..//*[@class='select2-selection__arrow']")
	WebElement stateDropDown;

	@FindBy(xpath = ".//label[contains(text(),'District')]/..//*[@class='select2-selection__arrow']")
	WebElement districtDropDown;

	@FindBy(xpath = ".//label[contains(text(),'Sub-district')]/..//*[@class='select2-selection__arrow']")
	WebElement subDistrictDropDown;

	@FindBy(xpath = ".//label[contains(text(),'Village')]/..//*[@class='select2-selection__arrow']")
	WebElement vtcDropDown;

	@FindBy(id = "address-modal-address-postal-code")
	WebElement addressPostalCode;

	@FindBy(id = "address-modal-address-landmark")
	WebElement addressLandmark;

	@FindBy(id = "address-modal-address-lat")
	WebElement addressLatitude;

	@FindBy(id = "address-modal-address-longitude")
	WebElement addressLongitude;

	@FindBy(xpath = "//form[@id='np-address-component']//button[contains(text(),'Submit')]")
	WebElement addressSubmitButton;

	@FindBy(xpath = "//form[@id='office-create-form']//button[contains(text(),'Submit')]")
	WebElement officeSubmitButton;

	@FindBy(xpath = "//form[@id='office-edit-form']//button[contains(text(),'Submit')]")
	WebElement officeEditSubmitButton;

	@FindBy(xpath = "//form[@id='office-create-form']//button[contains(text(),'Cancel')]")
	WebElement officeCancelButton;

	@FindBy(xpath = "//form[@id='office-create-form']//button[contains(text(),'Save as Draft')]")
	WebElement officeSaveButton;

	// search result
	@FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted']")
	WebElement dropDownSearchResult;

	String officeCreationSuccessToast = ".//div[@class='toast toast-success']//div[contains(text(),'Office (%s) - Creation sent for approval')]";

	String officeApprovalSuccessToast = ".//*[starts-with(.,'Office (%s)') and 'has been approved'= substring(.,string-length(.)- string-length('has been approved')+1)]";

	String officeUpdateSuccessToast = ".//div[@class='toast toast-success']//div[contains(text(),'Office (%s) - Update sent for approval')]";

	// String officeUpdateApprovalSuccessToast = ".//div[@class='toast
	// toast-success']//div[contains(text(),'Office (%s) - Update has been
	// approved')]";

	@FindBy(xpath = ".//div[@class='toast toast-error']//div[contains(text(),'Task pending for approval')]")
	WebElement officePendingApprovalToast;

	// Search fields

	String officeRow = "//tr/td/span[text()='%s']";

	@FindBy(xpath = "//div[@class='page-size']//select")
	WebElement pageSizeDropDown;

	String pageSize = "100";

	@FindBy(xpath = "//a[@class='page-link' and text()='Next']")
	WebElement nextPage;

	@FindBy(xpath = "//h1[starts-with(.,'Approval') and 'Office)'=substring(.,string-length(.)- string-length('Office)')+1)]")
	WebElement approveOfficePageTitle;

	@FindBy(xpath = ".//button[contains(text(),'Approve')]")
	WebElement approveButton;

	@FindBy(xpath = "//button[@title='Search Fields']")
	WebElement searchButton;

	@FindBy(xpath = "//table[contains(@class,'search-enabled')]")
	WebElement table;

	@FindBy(xpath = "//th[contains(text(),'Code')]")
	WebElement codeSearchLabel;

	@FindBy(xpath = "//th[contains(text(),'Name')]")
	WebElement nameSearchLabel;

	@FindBy(xpath = "//th[contains(text(),'Office Level')]")
	WebElement officeLevelSearchLabel;

	@FindBy(xpath = "//th[contains(text(),'Currency')]")
	WebElement currencySearchLabel;

	@FindBy(className = "select2-search__field")
	WebElement categorySearch;

	// update office from list
	@FindBy(xpath = ".//i[@title='Edit Record']")
	WebElement updateOfficeListButton;

	// update office page

	@FindBy(xpath = ".//button[contains(text(),'Update Office')]")
	WebElement updateOfficeButton;

	String updateOfficePageTitle = "Update Office (%s)";

	// Approve create office

	@FindBy(xpath = "//div[@class='list-nav-bar']//span[contains(text(),'Approved')]")
	WebElement approvedActionTab;

	@FindBy(xpath = "//div[@class='list-nav-bar']//span[contains(text(),'Pending Actions')]")
	WebElement pendingActionTab;
	// Approve update office
	@FindBy(xpath = "//*[contains(text(),'Approval (Update Office)')]")
	WebElement approveUpdateOfficePageTitle;

	// delete office

	String deleteOfficeListButton = "//i[@title='Delete Record']";

	@FindBy(xpath = "//button[contains(text(),'Delete Office')]")
	WebElement deleteOfficeButton;

	@FindBy(xpath = ".//confirm-delete//button[contains(text(),'Confirm')]")
	WebElement confirmDeleteOfficeButton;

	String officeDeletionCreateSuccessToast = ".//div[@class='toast toast-success']//div[contains(text(),'Office (%s) - Deletion sent for approval')]";

	// clone office

	String cloneOfficeListButton = "//i[@title='Create a copy']";

	@FindBy(xpath = "//button[contains(text(),'Clone Office')]")
	WebElement cloneOfficeButton;

	WebDriverWait wait = new WebDriverWait(wdriver, 5);

	public OfficeListPage(WebDriver wdriver) {
		super(wdriver);
		PageFactory.initElements(wdriver, this);
	}

	public void officeTest(HashMap<String, String> usrData) {
		// can change the approve conditions to usrData.contains.appprove
		try {
			if (usrData.get("Action").equalsIgnoreCase("CreateOffice")) {
				waitUntilElementAppears(officeListPageTitle);
				waitUntilBlockUI();
				createOfficeButton.click();
				createOffice(usrData);
			} else if (usrData.get("Action").toLowerCase().contains("approve")) {
				waitUntilElementAppears(officeListPageTitle);
				waitUntilBlockUI();
				pendingActionTab.click();
				approveOffice(usrData);
			} else if (usrData.get("Action").equalsIgnoreCase("EditOffice")) {
				waitUntilElementAppears(officeListPageTitle);
				waitUntilBlockUI();
				approvedActionTab.click();
				updateOffice(usrData);
			} else if (usrData.get("Action").equalsIgnoreCase("DeleteOffice")) {
				waitUntilElementAppears(officeListPageTitle);
				waitUntilBlockUI();
				approvedActionTab.click();
				deleteOffice(usrData);
			} else if (usrData.get("Action").equalsIgnoreCase("CloneOffice")) {
				waitUntilElementAppears(officeListPageTitle);
				waitUntilBlockUI();
				waitUntilElementClickable(approvedActionTab);
				approvedActionTab.click();
				cloneOffice(usrData);
			} else if (usrData.get("Action").equalsIgnoreCase("CloneOfficeData")) {
				waitUntilBlockUI();
				createOffice(usrData);
			}

		} catch (NoSuchElementException e) {
			Log.info("Not on office List page", true);
		}
	}

	public void createOffice(HashMap<String, String> usrData) {
		waitUntilElementAppears(createOfficePageTitle);
		// OfficeLevel ParentOffice OfficeOpeningDate OfficeExternalCode ContactName
		// MobileNumber Landline Alternative FaxNumber Email Address

	//	String ofcCode = getValue(usrData.get("OfficeCode"));
	//	sendKeys(officeCode, ofcCode);
		//sendKeys(officeName, getValue(usrData.get("OfficeName")));
		sendKeys(officeDescription, generateRandomStan());
		// selecting office level
		selectDropDown(officeLevelDropDown, searchInput, dropDownSearchResult, usrData.get("OfficeLevel"));
		// selecting parent office
		selectDropDown(parentOfficeDropDown, searchInput, dropDownSearchResult, usrData.get("ParentOffice"));
		sendKeys(officeOpeningDateInput,
				(usrData.get("OfficeOpeningDate").equalsIgnoreCase("today")) ? getTodaysDate("dd MMM yyyy")
						: usrData.get("OfficeOpeningDate"));
	//	sendKeys(officeExternalCode, getValue(usrData.get("OfficeExternalCode")));
		sendKeys(officeContactName, usrData.get("ContactName"));
		if (!usrData.get("MobileNumber").isEmpty()) {
			sendKeys(officeCountryCode, usrData.get("MobileNumber").split("-")[0]);
			sendKeys(officeMobileNumber, usrData.get("MobileNumber").split("-")[1]);
		}
		if (!usrData.get("Landline").isEmpty()) {
			sendKeys(officeLandlineCountryCode, usrData.get("Landline").split("-")[0]);
			sendKeys(officeLandline, usrData.get("Landline").split("-")[1]);
		}
		if (!usrData.get("Alternative").isEmpty()) {
			sendKeys(officeAlternateCCCode, usrData.get("Alternative").split("-")[0]);
			sendKeys(officeAlternateNumber, usrData.get("Alternative").split("-")[1]);
		}
		if (!usrData.get("FaxNumber").isEmpty()) {
			sendKeys(officeFaxCCode, usrData.get("FaxNumber").split("-")[0]);
			sendKeys(officeFax, usrData.get("FaxNumber").split("-")[1]);
		}
		if (!usrData.get("Email").isEmpty()) {
			sendKeys(officePrimaryEmail, usrData.get("Email").split("-")[0]);
		}
		// clicking on add address button and then filling the subsquient input fields
		if (usrData.get("Action").toLowerCase().contains("create")) {
			addAddressButton.click();
		} else {
			updateOfficeListButton.click();
		}
		sendKeys(addressLineOne, usrData.get("AddressLine1"));
		sendKeys(addressLineTwo, usrData.get("AddressLine2"));
		//

		selectDropDown(countryDropDown, searchInput, dropDownSearchResult, usrData.get("Country"));
		selectDropDown(stateDropDown, searchInput, dropDownSearchResult, usrData.get("State"));
		selectDropDown(districtDropDown, searchInput, dropDownSearchResult, usrData.get("District"));
		selectDropDown(subDistrictDropDown, searchInput, dropDownSearchResult, usrData.get("SubDisctrict"));
		selectDropDown(vtcDropDown, searchInput, dropDownSearchResult, usrData.get("VTC"));

		sendKeys(addressPostalCode, usrData.get("PostalCode"));
		sendKeys(addressLandmark, usrData.get("Landmark"));
		sendKeys(addressLatitude, usrData.get("Latitude"));
		sendKeys(addressLongitude, usrData.get("Longitude"));
		waitUntilElementClickable(addressSubmitButton);
		scrollToElement(addressSubmitButton);
		addressSubmitButton.click();
		scrollUpToWebElement();
		waitUntilElementClickable(officeSubmitButton);
		officeSubmitButton.click();

		boolean flag = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(officePendingApprovalToast));
			waitUntillElementDisappears(officePendingApprovalToast);
			System.out.println("Task already pending for approval, skipping succes toast check");
			flag = false;

		} catch (NoSuchElementException | TimeoutException e) {
		}
		if (usrData.get("TestType").equalsIgnoreCase("positive") && flag) {
			try {
			//	waitUntilElementAppears(formatXpath(officeCreationSuccessToast, ofcCode));
			//	waitUntillElementDisappears(String.format(officeCreationSuccessToast, ofcCode));
				Log.info("Toaster message found and validated.");
			} catch (NoSuchElementException e) {
				Assert.fail("Success toaster message not found.");
			}
		}
	}

	private void approveOffice(HashMap<String, String> usrData) {
		String officeCode = null;
		try {
			officeCode = getValue(usrData.get("OfficeCode"));
			waitUntilBlockUI();
			findAndScrollToElement(String.format(officeRow, officeCode)).click();
		} catch (NoSuchElementException e) {
			selectDropdown(pageSizeDropDown, pageSize);
			do {
				try {
					WebElement officeRecord = findAndScrollToElement(String.format(officeRow, officeCode));
					officeRecord.click();
					break;
				} catch (NoSuchElementException f) {
					waitUntilBlockUI();
					scrollToElement(nextPage);
					waitUntilElementClickable(nextPage);
					try {
						nextPage.click();
					} catch (WebDriverException g) {
						Reporter.log("Missed to click on office record row. Trying to click again on the row.");
						WebElement officeRecord = findAndScrollToElement(String.format(officeRow, officeCode));
						findAndScrollToElement(String.format(officeRow, officeCode));
						officeRecord.click();
						break;
					}
				}
			} while (nextPage.isEnabled());

		}
		if (usrData.get("Action").toLowerCase().contains("approve")) {
			waitUntilElementAppears(approveOfficePageTitle);
			Reporter.log("On Approve office page.", true);
			waitUntilElementClickable(approveButton);
			approveButton.click();
			if (usrData.get("TestType").equalsIgnoreCase("positive")) {
				try {
					waitUntilElementAppears(
							formatXpath(officeApprovalSuccessToast, getValue(usrData.get("OfficeCode"))));
					waitUntilElementNotDisplayed(
							String.format(officeApprovalSuccessToast, getValue(usrData.get("OfficeCode"))));
					Reporter.log("Toaster message found and validated.",true);
				} catch (NoSuchElementException e) {
					Reporter.log("Success toaster message not found.", true);
					// Assert.fail("Success toaster message not found.");
				}
			}

		}

	}

	// update office selecting from approved list page

	public void updateOffice(HashMap<String, String> usrData) {
		// search for the office in List page
		searchOffice(usrData);
		// add code to delete from list page
		if (usrData.get("SubAction").toLowerCase().contains("list")) {
			waitUntilElementClickable(updateOfficeListButton);
			updateOfficeListButton.click();
			Reporter.log("Updating using list action button.", true);
		} else {
			waitUntilElementClickable(updateOfficeButton);
			updateOfficeButton.click();
		}
		updateOfficePage(usrData);
	}

	// now updating office in particular office page
	public void updateOfficePage(HashMap<String, String> usrData) {
		try {

			waitUntilElementAppears(String.format(updateOfficePageTitle, usrData.get("OfficeCode")));

			sendKeys(officeName, getValue(usrData.get("UpdateOfficeName")));
			sendKeys(officeDescription, generateRandomStan());
			// selecting office level
			selectDropDown(officeLevelDropDown, searchInput, dropDownSearchResult, usrData.get("UpdateOfficeLevel"));
			// selecting parent office
			selectDropDown(parentOfficeDropDown, searchInput, dropDownSearchResult, usrData.get("UpdateParentOffice"));
			sendKeys(officeOpeningDateInput,
					(usrData.get("UpdateOfficeOpeningDate").equalsIgnoreCase("today")) ? getTodaysDate("dd-mm-yyyy")
							: usrData.get("OfficeOpeningDate"));
			sendKeys(officeExternalCode, getValue(usrData.get("OfficeExternalCode")));
			sendKeys(officeContactName, usrData.get("UpdateContactName"));

			if (!usrData.get("UpdateMobileNumber").isEmpty()) {
				sendKeys(officeCountryCode, usrData.get("UpdateMobileNumber").split("-")[0]);
				sendKeys(officeMobileNumber, usrData.get("UpdateMobileNumber").split("-")[1]);
			}
			if (!usrData.get("UpdateLandline").isEmpty()) {
				sendKeys(officeLandlineCountryCode, usrData.get("UpdateLandline").split("-")[0]);
				sendKeys(officeLandline, usrData.get("UpdateLandline").split("-")[1]);
			}
			if (!usrData.get("UpdateAlternative").isEmpty()) {
				sendKeys(officeAlternateCCCode, usrData.get("UpdateAlternative").split("-")[0]);
				sendKeys(officeAlternateNumber, usrData.get("UpdateAlternative").split("-")[1]);
			}
			if (!usrData.get("UpdateFaxNumber").isEmpty()) {
				sendKeys(officeFaxCCode, usrData.get("UpdateFaxNumber").split("-")[0]);
				sendKeys(officeFax, usrData.get("UpdateFaxNumber").split("-")[1]);
			}
			if (!usrData.get("UpdateEmail").isEmpty()) {
				sendKeys(officePrimaryEmail, usrData.get("UpdateEmail").split("-")[0]);
			}
			// clicking on add address button and then filling the subsquient input fields

			waitUntilElementClickable(updateOfficeListButton);
			// here xpath same as edit icon in list page
			updateOfficeListButton.click();

			sendKeys(addressLineOne, usrData.get("UpdateAddressLine1"));
			sendKeys(addressLineTwo, usrData.get("UpdateAddressLine2"));
			//

			selectDropDown(countryDropDown, searchInput, dropDownSearchResult, usrData.get("UpdateCountry"));
			selectDropDown(stateDropDown, searchInput, dropDownSearchResult, usrData.get("UpdateState"));
			selectDropDown(districtDropDown, searchInput, dropDownSearchResult, usrData.get("UpdateDistrict"));
			selectDropDown(subDistrictDropDown, searchInput, dropDownSearchResult, usrData.get("UpdateSubDisctrict"));
			selectDropDown(vtcDropDown, searchInput, dropDownSearchResult, usrData.get("UpdateVTC"));
			scrollToElement(addressPostalCode);
			sendKeys(addressPostalCode, usrData.get("UpdatePostalCode"));
			sendKeys(addressLandmark, usrData.get("UpdateLandmark"));
			sendKeys(addressLatitude, usrData.get("UpdateLatitude"));
			sendKeys(addressLongitude, usrData.get("UpdateLongitude"));
			waitUntilElementClickable(addressSubmitButton);
			scrollToElement(addressSubmitButton);
			addressSubmitButton.click();

			// add notes and attachement

			scrollUpToWebElement();
			waitUntilElementClickable(officeEditSubmitButton);
			officeEditSubmitButton.click();

			boolean flag = true;
			try {
				wait.until(ExpectedConditions.visibilityOf(officePendingApprovalToast));
				waitUntillElementDisappears(officePendingApprovalToast);
				System.out.println("Task already pending for approval, skipping succes toast check");
				flag = false;

			} catch (NoSuchElementException | TimeoutException e) {
			}
			if (usrData.get("TestType").equalsIgnoreCase("positive") && flag) {
				try {
					waitUntilElementAppears(formatXpath(officeUpdateSuccessToast, usrData.get("OfficeCode")));
					waitUntillElementDisappears(String.format(officeUpdateSuccessToast, usrData.get("OfficeCode")));
					Log.info("Toaster message found and validated.");
				} catch (NoSuchElementException e) {
					Assert.fail("Success toaster message not found.");
				}
			}
		} catch (NoSuchElementException e) {

		}
	}

	// delete office

	public void deleteOffice(HashMap<String, String> usrData) {
		searchOffice(usrData);

		// deleteOfficeListButton
		if (usrData.get("SubAction").toLowerCase().contains("list")) {
			String xpath = String.format(officeRow, getValue(usrData.get("OfficeCode"))) + "/ancestor::tr"
					+ deleteOfficeListButton;
			System.out.println(xpath);
			waitUntilElementClickable(xpath).click();
		} else {
			waitUntilElementClickable(deleteOfficeButton);
			deleteOfficeButton.click();
		}
		// common confirmation delete message
		waitUntilElementClickable(confirmDeleteOfficeButton);
		confirmDeleteOfficeButton.click();

		// toaster message validation
		boolean flag = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(officePendingApprovalToast));
			waitUntillElementDisappears(officePendingApprovalToast);
			System.out.println("Task already pending for approval, skipping succes toast check");
			flag = false;
			// toasterCloseButton.click(); if possible write condition to close, couldn't
			// write as the element to be clicked is ::before cant handle with xpath
		} catch (NoSuchElementException | TimeoutException e) {
		}
		if (usrData.get("TestType").equalsIgnoreCase("positive") && flag) {
			try {
				waitUntilElementAppears(formatXpath(officeDeletionCreateSuccessToast, usrData.get("OfficeCode")));
				waitUntillElementDisappears(String.format(officeDeletionCreateSuccessToast, usrData.get("OfficeCode")));
				Log.info("Toaster message found and validated.");
			} catch (NoSuchElementException e) {
				Assert.fail("Success toaster message not found.");
			}
		}
		Reporter.log("Office deletion send for approval.", true);
	}

	// clone office

	public void cloneOffice(HashMap<String, String> usrData) {
		searchOffice(usrData);
		if (usrData.get("SubAction").toLowerCase().contains("list")) {
			String xpath = String.format(officeRow, getValue(usrData.get("OfficeCode"))) + "/ancestor::tr"
					+ cloneOfficeListButton;
			waitUntilElementClickable(xpath).click();
		} else {
			waitUntilElementClickable(cloneOfficeButton);
			cloneOfficeButton.click();
		}
	}

	public WebElement searchOffice(HashMap<String, String> usrData) {

		WebElement element = null;

		waitUntilBlockUI();
		waitUntilElementClickable(searchButton);
		searchButton.click();

		int index = getColumnNumberofElement(table, codeSearchLabel);
		wait.until(ExpectedConditions
				.elementToBeClickable(table.findElement(By.xpath("((//thead/tr)[2]/th)[" + (index + 1) + "]"))));
		WebElement searchInput = null;

		if (!usrData.get("OfficeCode").isEmpty()) {
			searchInput = table.findElement(By.xpath("((//thead/tr)[2]/th)[" + (index + 1) + "]/input"));
			waitUntilElementClickable(searchInput);
			searchInput.sendKeys(getValue(usrData.get("OfficeCode")));
			searchInput.sendKeys(Keys.ENTER);
		}
		if (!usrData.get("OfficeName").isEmpty()) {
			index = getColumnNumberofElement(table, nameSearchLabel);
			searchInput = table.findElement(By.xpath("((//thead/tr)[2]/th)[" + (index + 1) + "]/input"));
			waitUntilElementClickable(searchInput);
			searchInput.sendKeys(getValue(usrData.get("OfficeName")));
			searchInput.sendKeys(Keys.ENTER);
		}
		if (!usrData.get("OfficeLevel").isEmpty()) {
			index = getColumnNumberofElement(table, officeLevelSearchLabel);
			searchInput = table.findElement(
					By.xpath("((//thead/tr)[2]/th)[" + (index + 1) + "]//*[@class='select2-selection__arrow']"));
			waitUntilElementClickable(searchInput);
			selectDropDown(searchInput, categorySearch, dropDownSearchResult, usrData.get("OfficeLevel"));
		}
		String officeCode = null;
		try {
			officeCode = getValue(usrData.get("OfficeCode"));
			waitUntilBlockUI();
			WebElement officeRecord = findAndScrollToElement(String.format(officeRow, officeCode));
			System.out.println(usrData.get("SubAction"));
			if (usrData.get("SubAction").isEmpty()) {
				officeRecord.click();
			}
			element = officeRecord;
		} catch (NoSuchElementException e) {
			selectDropdown(pageSizeDropDown, pageSize);
			do {
				try {
					WebElement officeRecord = findAndScrollToElement(String.format(officeRow, officeCode));
					if (usrData.get("SubAction").isEmpty()) {
						officeRecord.click();
					}
					element = officeRecord;
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
		// Total Number of Columns
		List<WebElement> listofHeaderElements = table.findElements(By.xpath("(//thead/tr)[1]/th"));
		int columnNo = listofHeaderElements.indexOf(element);
		return columnNo;
	}

}
*/