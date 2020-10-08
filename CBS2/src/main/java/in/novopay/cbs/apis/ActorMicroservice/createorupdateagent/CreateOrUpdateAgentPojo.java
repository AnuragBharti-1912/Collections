package in.novopay.cbs.apis.ActorMicroservice.createorupdateagent;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import in.novopay.cbs.apis.Headers;

public class CreateOrUpdateAgentPojo {
	
	@SerializedName("headers")
	@Expose
	private Headers headers;
	@SerializedName("request")
	@Expose
	private Request request;

	public Headers getHeaders() {
	return headers;
	}

	public void setHeaders(Headers headers) {
	this.headers = headers;
	}

	public Request getRequest() {
	return request;
	}

	public void setRequest(Request request) {
	this.request = request;
	}
	

}



class AgentAccountDetail {

@SerializedName("purpose")
@Expose
private List<Purpose> purpose = null;
@SerializedName("new_account")
@Expose
private String newAccount;
@SerializedName("external_account_number")
@Expose
private String externalAccountNumber;
@SerializedName("account_number")
@Expose
private String accountNumber;
@SerializedName("type")
@Expose
private String type;
@SerializedName("id")
@Expose
private String id;
@SerializedName("product_type")
@Expose
private String productType;
@SerializedName("product_type_value")
@Expose
private String productTypeValue;
@SerializedName("currency")
@Expose
private String currency;
@SerializedName("currency_value")
@Expose
private String currencyValue;
@SerializedName("product_id")
@Expose
private String productId;
@SerializedName("product_code")
@Expose
private String productCode;
@SerializedName("product_name")
@Expose
private String productName;
@SerializedName("product_scheme_id")
@Expose
private String productSchemeId;
@SerializedName("scheme_code")
@Expose
private String schemeCode;
@SerializedName("scheme_name")
@Expose
private String schemeName;
@SerializedName("desired_action_value")
@Expose
private String desiredActionValue;
@SerializedName("external_account_type")
@Expose
private String externalAccountType;
@SerializedName("external_account_type_value")
@Expose
private String externalAccountTypeValue;
@SerializedName("account_holder_name")
@Expose
private String accountHolderName;
@SerializedName("routing_type")
@Expose
private String routingType;
@SerializedName("routing_type_value")
@Expose
private String routingTypeValue;
@SerializedName("routing_value")
@Expose
private String routingValue;
@SerializedName("bank_name")
@Expose
private String bankName;
@SerializedName("branch_name")
@Expose
private String branchName;

public List<Purpose> getPurpose() {
return purpose;
}

public void setPurpose(List<Purpose> purpose) {
this.purpose = purpose;
}

public String getNewAccount() {
return newAccount;
}

public void setNewAccount(String newAccount) {
this.newAccount = newAccount;
}

public String getExternalAccountNumber() {
return externalAccountNumber;
}

public void setExternalAccountNumber(String externalAccountNumber) {
this.externalAccountNumber = externalAccountNumber;
}

public String getAccountNumber() {
return accountNumber;
}

public void setAccountNumber(String accountNumber) {
this.accountNumber = accountNumber;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getProductType() {
return productType;
}

public void setProductType(String productType) {
this.productType = productType;
}

public String getProductTypeValue() {
return productTypeValue;
}

public void setProductTypeValue(String productTypeValue) {
this.productTypeValue = productTypeValue;
}

public String getCurrency() {
return currency;
}

public void setCurrency(String currency) {
this.currency = currency;
}

public String getCurrencyValue() {
return currencyValue;
}

public void setCurrencyValue(String currencyValue) {
this.currencyValue = currencyValue;
}

public String getProductId() {
return productId;
}

public void setProductId(String productId) {
this.productId = productId;
}

public String getProductCode() {
return productCode;
}

public void setProductCode(String productCode) {
this.productCode = productCode;
}

public String getProductName() {
return productName;
}

public void setProductName(String productName) {
this.productName = productName;
}

public String getProductSchemeId() {
return productSchemeId;
}

public void setProductSchemeId(String productSchemeId) {
this.productSchemeId = productSchemeId;
}

public String getSchemeCode() {
return schemeCode;
}

public void setSchemeCode(String schemeCode) {
this.schemeCode = schemeCode;
}

public String getSchemeName() {
return schemeName;
}

public void setSchemeName(String schemeName) {
this.schemeName = schemeName;
}

public String getDesiredActionValue() {
return desiredActionValue;
}

public void setDesiredActionValue(String desiredActionValue) {
this.desiredActionValue = desiredActionValue;
}

public String getExternalAccountType() {
return externalAccountType;
}

public void setExternalAccountType(String externalAccountType) {
this.externalAccountType = externalAccountType;
}

public String getExternalAccountTypeValue() {
return externalAccountTypeValue;
}

public void setExternalAccountTypeValue(String externalAccountTypeValue) {
this.externalAccountTypeValue = externalAccountTypeValue;
}

public String getAccountHolderName() {
return accountHolderName;
}

public void setAccountHolderName(String accountHolderName) {
this.accountHolderName = accountHolderName;
}

public String getRoutingType() {
return routingType;
}

public void setRoutingType(String routingType) {
this.routingType = routingType;
}

public String getRoutingTypeValue() {
return routingTypeValue;
}

public void setRoutingTypeValue(String routingTypeValue) {
this.routingTypeValue = routingTypeValue;
}

public String getRoutingValue() {
return routingValue;
}

public void setRoutingValue(String routingValue) {
this.routingValue = routingValue;
}

public String getBankName() {
return bankName;
}

public void setBankName(String bankName) {
this.bankName = bankName;
}

public String getBranchName() {
return branchName;
}

public void setBranchName(String branchName) {
this.branchName = branchName;
}

}


class AgentAddressDetail {

@SerializedName("contact_details")
@Expose
private ContactDetails contactDetails;
@SerializedName("latitude")
@Expose
private String latitude;
@SerializedName("longitude")
@Expose
private String longitude;
@SerializedName("id")
@Expose
private String id;
@SerializedName("address_line_1")
@Expose
private String addressLine1;
@SerializedName("address_line_2")
@Expose
private String addressLine2;
@SerializedName("geo_hierarchy_element_id")
@Expose
private String geoHierarchyElementId;
@SerializedName("pincode")
@Expose
private String pincode;
@SerializedName("landmark")
@Expose
private String landmark;
@SerializedName("STATE")
@Expose
private String sTATE;
@SerializedName("DISTRICT")
@Expose
private String dISTRICT;
@SerializedName("SUB-DISTRICT")
@Expose
private String sUBDISTRICT;
@SerializedName("VTC")
@Expose
private String vTC;
@SerializedName("geocoded_lat_long")
@Expose
private String geocodedLatLong;
@SerializedName("type")
@Expose
private String type;
@SerializedName("type_value")
@Expose
private String typeValue;
@SerializedName("COUNTRY")
@Expose
private String cOUNTRY;

public ContactDetails getContactDetails() {
return contactDetails;
}

public void setContactDetails(ContactDetails contactDetails) {
this.contactDetails = contactDetails;
}

public String getLatitude() {
return latitude;
}

public void setLatitude(String latitude) {
this.latitude = latitude;
}

public String getLongitude() {
return longitude;
}

public void setLongitude(String longitude) {
this.longitude = longitude;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getAddressLine1() {
return addressLine1;
}

public void setAddressLine1(String addressLine1) {
this.addressLine1 = addressLine1;
}

public String getAddressLine2() {
return addressLine2;
}

public void setAddressLine2(String addressLine2) {
this.addressLine2 = addressLine2;
}

public String getGeoHierarchyElementId() {
return geoHierarchyElementId;
}

public void setGeoHierarchyElementId(String geoHierarchyElementId) {
this.geoHierarchyElementId = geoHierarchyElementId;
}

public String getPincode() {
return pincode;
}

public void setPincode(String pincode) {
this.pincode = pincode;
}

public String getLandmark() {
return landmark;
}

public void setLandmark(String landmark) {
this.landmark = landmark;
}

public String getSTATE() {
return sTATE;
}

public void setSTATE(String sTATE) {
this.sTATE = sTATE;
}

public String getDISTRICT() {
return dISTRICT;
}

public void setDISTRICT(String dISTRICT) {
this.dISTRICT = dISTRICT;
}

public String getSUBDISTRICT() {
return sUBDISTRICT;
}

public void setSUBDISTRICT(String sUBDISTRICT) {
this.sUBDISTRICT = sUBDISTRICT;
}

public String getVTC() {
return vTC;
}

public void setVTC(String vTC) {
this.vTC = vTC;
}

public String getGeocodedLatLong() {
return geocodedLatLong;
}

public void setGeocodedLatLong(String geocodedLatLong) {
this.geocodedLatLong = geocodedLatLong;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getTypeValue() {
return typeValue;
}

public void setTypeValue(String typeValue) {
this.typeValue = typeValue;
}

public String getCOUNTRY() {
return cOUNTRY;
}

public void setCOUNTRY(String cOUNTRY) {
this.cOUNTRY = cOUNTRY;
}

}


class AgentDetails {

@SerializedName("id")
@Expose
private String id;
@SerializedName("code")
@Expose
private String code;
@SerializedName("name")
@Expose
private String name;
@SerializedName("tax_identification_number")
@Expose
private String taxIdentificationNumber;
@SerializedName("trade_license_number")
@Expose
private String tradeLicenseNumber;
@SerializedName("business_registration_number")
@Expose
private String businessRegistrationNumber;
@SerializedName("age_of_business")
@Expose
private String ageOfBusiness;
@SerializedName("annual_turnover")
@Expose
private String annualTurnover;
@SerializedName("shop_photo_document_code")
@Expose
private String shopPhotoDocumentCode;
@SerializedName("trade_license_expiry_date")
@Expose
private String tradeLicenseExpiryDate;
@SerializedName("type")
@Expose
private String type;
@SerializedName("business_type")
@Expose
private String businessType;
@SerializedName("classification")
@Expose
private String classification;
@SerializedName("trade_license_issuing_authority")
@Expose
private String tradeLicenseIssuingAuthority;
@SerializedName("business_registration_authority")
@Expose
private String businessRegistrationAuthority;
@SerializedName("business_registration_country")
@Expose
private String businessRegistrationCountry;
@SerializedName("parent_id")
@Expose
private String parentId;
@SerializedName("base_office_id")
@Expose
private String baseOfficeId;
@SerializedName("nature_of_business")
@Expose
private String natureOfBusiness;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getCode() {
return code;
}

public void setCode(String code) {
this.code = code;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getTaxIdentificationNumber() {
return taxIdentificationNumber;
}

public void setTaxIdentificationNumber(String taxIdentificationNumber) {
this.taxIdentificationNumber = taxIdentificationNumber;
}

public String getTradeLicenseNumber() {
return tradeLicenseNumber;
}

public void setTradeLicenseNumber(String tradeLicenseNumber) {
this.tradeLicenseNumber = tradeLicenseNumber;
}

public String getBusinessRegistrationNumber() {
return businessRegistrationNumber;
}

public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
this.businessRegistrationNumber = businessRegistrationNumber;
}

public String getAgeOfBusiness() {
return ageOfBusiness;
}

public void setAgeOfBusiness(String ageOfBusiness) {
this.ageOfBusiness = ageOfBusiness;
}

public String getAnnualTurnover() {
return annualTurnover;
}

public void setAnnualTurnover(String annualTurnover) {
this.annualTurnover = annualTurnover;
}

public String getShopPhotoDocumentCode() {
return shopPhotoDocumentCode;
}

public void setShopPhotoDocumentCode(String shopPhotoDocumentCode) {
this.shopPhotoDocumentCode = shopPhotoDocumentCode;
}

public String getTradeLicenseExpiryDate() {
return tradeLicenseExpiryDate;
}

public void setTradeLicenseExpiryDate(String tradeLicenseExpiryDate) {
this.tradeLicenseExpiryDate = tradeLicenseExpiryDate;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getBusinessType() {
return businessType;
}

public void setBusinessType(String businessType) {
this.businessType = businessType;
}

public String getClassification() {
return classification;
}

public void setClassification(String classification) {
this.classification = classification;
}

public String getTradeLicenseIssuingAuthority() {
return tradeLicenseIssuingAuthority;
}

public void setTradeLicenseIssuingAuthority(String tradeLicenseIssuingAuthority) {
this.tradeLicenseIssuingAuthority = tradeLicenseIssuingAuthority;
}

public String getBusinessRegistrationAuthority() {
return businessRegistrationAuthority;
}

public void setBusinessRegistrationAuthority(String businessRegistrationAuthority) {
this.businessRegistrationAuthority = businessRegistrationAuthority;
}

public String getBusinessRegistrationCountry() {
return businessRegistrationCountry;
}

public void setBusinessRegistrationCountry(String businessRegistrationCountry) {
this.businessRegistrationCountry = businessRegistrationCountry;
}

public String getParentId() {
return parentId;
}

public void setParentId(String parentId) {
this.parentId = parentId;
}

public String getBaseOfficeId() {
return baseOfficeId;
}

public void setBaseOfficeId(String baseOfficeId) {
this.baseOfficeId = baseOfficeId;
}

public String getNatureOfBusiness() {
return natureOfBusiness;
}

public void setNatureOfBusiness(String natureOfBusiness) {
this.natureOfBusiness = natureOfBusiness;
}

}

class AgentDocumentDetail {

@SerializedName("id")
@Expose
private String id;
@SerializedName("identifier")
@Expose
private String identifier;
@SerializedName("type")
@Expose
private String type;
@SerializedName("purpose")
@Expose
private String purpose;
@SerializedName("valid_until")
@Expose
private String validUntil;
@SerializedName("description")
@Expose
private String description;
@SerializedName("document_code")
@Expose
private String documentCode;
@SerializedName("version")
@Expose
private String version;
@SerializedName("type_value")
@Expose
private String typeValue;
@SerializedName("purpose_value")
@Expose
private String purposeValue;
@SerializedName("file_names")
@Expose
private List<FileName> fileNames = null;
@SerializedName("number_of_files")
@Expose
private String numberOfFiles;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getIdentifier() {
return identifier;
}

public void setIdentifier(String identifier) {
this.identifier = identifier;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getPurpose() {
return purpose;
}

public void setPurpose(String purpose) {
this.purpose = purpose;
}

public String getValidUntil() {
return validUntil;
}

public void setValidUntil(String validUntil) {
this.validUntil = validUntil;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getDocumentCode() {
return documentCode;
}

public void setDocumentCode(String documentCode) {
this.documentCode = documentCode;
}

public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}

public String getTypeValue() {
return typeValue;
}

public void setTypeValue(String typeValue) {
this.typeValue = typeValue;
}

public String getPurposeValue() {
return purposeValue;
}

public void setPurposeValue(String purposeValue) {
this.purposeValue = purposeValue;
}

public List<FileName> getFileNames() {
return fileNames;
}

public void setFileNames(List<FileName> fileNames) {
this.fileNames = fileNames;
}

public String getNumberOfFiles() {
return numberOfFiles;
}

public void setNumberOfFiles(String numberOfFiles) {
this.numberOfFiles = numberOfFiles;
}

}

class ContactDetails {

@SerializedName("contact_id")
@Expose
private String contactId;
@SerializedName("mobile_number")
@Expose
private String mobileNumber;
@SerializedName("mobile_country_code")
@Expose
private String mobileCountryCode;
@SerializedName("alternate_contact_number")
@Expose
private String alternateContactNumber;
@SerializedName("alternate_contact_country_code")
@Expose
private String alternateContactCountryCode;
@SerializedName("fax")
@Expose
private String fax;
@SerializedName("fax_country_code")
@Expose
private String faxCountryCode;
@SerializedName("primary_email")
@Expose
private String primaryEmail;

public String getContactId() {
return contactId;
}

public void setContactId(String contactId) {
this.contactId = contactId;
}

public String getMobileNumber() {
return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
this.mobileNumber = mobileNumber;
}

public String getMobileCountryCode() {
return mobileCountryCode;
}

public void setMobileCountryCode(String mobileCountryCode) {
this.mobileCountryCode = mobileCountryCode;
}

public String getAlternateContactNumber() {
return alternateContactNumber;
}

public void setAlternateContactNumber(String alternateContactNumber) {
this.alternateContactNumber = alternateContactNumber;
}

public String getAlternateContactCountryCode() {
return alternateContactCountryCode;
}

public void setAlternateContactCountryCode(String alternateContactCountryCode) {
this.alternateContactCountryCode = alternateContactCountryCode;
}

public String getFax() {
return fax;
}

public void setFax(String fax) {
this.fax = fax;
}

public String getFaxCountryCode() {
return faxCountryCode;
}

public void setFaxCountryCode(String faxCountryCode) {
this.faxCountryCode = faxCountryCode;
}

public String getPrimaryEmail() {
return primaryEmail;
}

public void setPrimaryEmail(String primaryEmail) {
this.primaryEmail = primaryEmail;
}

}

class EmployeeAddressDetail {

	/*
	 * @SerializedName("contact_details")
	 * 
	 * @Expose private ContactDetails__ contactDetails;
	 */
@SerializedName("latitude")
@Expose
private String latitude;
@SerializedName("longitude")
@Expose
private String longitude;
@SerializedName("address_line_1")
@Expose
private String addressLine1;
@SerializedName("address_line_2")
@Expose
private String addressLine2;
@SerializedName("geo_hierarchy_element_id")
@Expose
private String geoHierarchyElementId;
@SerializedName("pincode")
@Expose
private String pincode;
@SerializedName("landmark")
@Expose
private String landmark;
@SerializedName("STATE")
@Expose
private String sTATE;
@SerializedName("DISTRICT")
@Expose
private String dISTRICT;
@SerializedName("SUB-DISTRICT")
@Expose
private String sUBDISTRICT;
@SerializedName("VTC")
@Expose
private String vTC;
@SerializedName("id")
@Expose
private String id;
@SerializedName("geocoded_lat_long")
@Expose
private String geocodedLatLong;
@SerializedName("type")
@Expose
private String type;
@SerializedName("type_value")
@Expose
private String typeValue;
@SerializedName("COUNTRY")
@Expose
private String cOUNTRY;


	/*
	 * public ContactDetails__ getContactDetails() { return contactDetails; }
	 * 
	 * public void setContactDetails(ContactDetails__ contactDetails) {
	 * this.contactDetails = contactDetails; }
	 */


public String getLatitude() {
return latitude;
}

public void setLatitude(String latitude) {
this.latitude = latitude;
}

public String getLongitude() {
return longitude;
}

public void setLongitude(String longitude) {
this.longitude = longitude;
}

public String getAddressLine1() {
return addressLine1;
}

public void setAddressLine1(String addressLine1) {
this.addressLine1 = addressLine1;
}

public String getAddressLine2() {
return addressLine2;
}

public void setAddressLine2(String addressLine2) {
this.addressLine2 = addressLine2;
}

public String getGeoHierarchyElementId() {
return geoHierarchyElementId;
}

public void setGeoHierarchyElementId(String geoHierarchyElementId) {
this.geoHierarchyElementId = geoHierarchyElementId;
}

public String getPincode() {
return pincode;
}

public void setPincode(String pincode) {
this.pincode = pincode;
}

public String getLandmark() {
return landmark;
}

public void setLandmark(String landmark) {
this.landmark = landmark;
}

public String getSTATE() {
return sTATE;
}

public void setSTATE(String sTATE) {
this.sTATE = sTATE;
}

public String getDISTRICT() {
return dISTRICT;
}

public void setDISTRICT(String dISTRICT) {
this.dISTRICT = dISTRICT;
}

public String getSUBDISTRICT() {
return sUBDISTRICT;
}

public void setSUBDISTRICT(String sUBDISTRICT) {
this.sUBDISTRICT = sUBDISTRICT;
}

public String getVTC() {
return vTC;
}

public void setVTC(String vTC) {
this.vTC = vTC;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getGeocodedLatLong() {
return geocodedLatLong;
}

public void setGeocodedLatLong(String geocodedLatLong) {
this.geocodedLatLong = geocodedLatLong;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getTypeValue() {
return typeValue;
}

public void setTypeValue(String typeValue) {
this.typeValue = typeValue;
}

public String getCOUNTRY() {
return cOUNTRY;
}

public void setCOUNTRY(String cOUNTRY) {
this.cOUNTRY = cOUNTRY;
}

}


class EmployeeBasicDetails {

@SerializedName("first_name")
@Expose
private String firstName;
@SerializedName("last_name")
@Expose
private String lastName;
@SerializedName("middle_name")
@Expose
private String middleName;
@SerializedName("image_document_id")
@Expose
private String imageDocumentId;
@SerializedName("date_of_birth")
@Expose
private String dateOfBirth;
@SerializedName("salutation")
@Expose
private String salutation;
@SerializedName("gender")
@Expose
private String gender;

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getMiddleName() {
return middleName;
}

public void setMiddleName(String middleName) {
this.middleName = middleName;
}

public String getImageDocumentId() {
return imageDocumentId;
}

public void setImageDocumentId(String imageDocumentId) {
this.imageDocumentId = imageDocumentId;
}

public String getDateOfBirth() {
return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}

public String getSalutation() {
return salutation;
}

public void setSalutation(String salutation) {
this.salutation = salutation;
}

public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
}

}


class EmployeeContactDetails {

@SerializedName("primary_email")
@Expose
private String primaryEmail;
@SerializedName("mobile_number")
@Expose
private String mobileNumber;
@SerializedName("mobile_country_code")
@Expose
private String mobileCountryCode;
@SerializedName("alternate_contact_number")
@Expose
private String alternateContactNumber;
@SerializedName("alternate_contact_country_code")
@Expose
private String alternateContactCountryCode;

public String getPrimaryEmail() {
return primaryEmail;
}

public void setPrimaryEmail(String primaryEmail) {
this.primaryEmail = primaryEmail;
}

public String getMobileNumber() {
return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
this.mobileNumber = mobileNumber;
}

public String getMobileCountryCode() {
return mobileCountryCode;
}

public void setMobileCountryCode(String mobileCountryCode) {
this.mobileCountryCode = mobileCountryCode;
}

public String getAlternateContactNumber() {
return alternateContactNumber;
}

public void setAlternateContactNumber(String alternateContactNumber) {
this.alternateContactNumber = alternateContactNumber;
}

public String getAlternateContactCountryCode() {
return alternateContactCountryCode;
}

public void setAlternateContactCountryCode(String alternateContactCountryCode) {
this.alternateContactCountryCode = alternateContactCountryCode;
}

}


class EmployeeDocumentDetail {

@SerializedName("identifier")
@Expose
private String identifier;
@SerializedName("type")
@Expose
private String type;
@SerializedName("purpose")
@Expose
private String purpose;
@SerializedName("valid_until")
@Expose
private String validUntil;
@SerializedName("description")
@Expose
private String description;
@SerializedName("document_code")
@Expose
private String documentCode;
@SerializedName("version")
@Expose
private String version;
@SerializedName("id")
@Expose
private String id;
@SerializedName("type_value")
@Expose
private String typeValue;
@SerializedName("purpose_value")
@Expose
private String purposeValue;
@SerializedName("file_names")
@Expose
private List<FileName> fileNames = null;
@SerializedName("number_of_files")
@Expose
private String numberOfFiles;

public String getIdentifier() {
return identifier;
}

public void setIdentifier(String identifier) {
this.identifier = identifier;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getPurpose() {
return purpose;
}

public void setPurpose(String purpose) {
this.purpose = purpose;
}

public String getValidUntil() {
return validUntil;
}

public void setValidUntil(String validUntil) {
this.validUntil = validUntil;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getDocumentCode() {
return documentCode;
}

public void setDocumentCode(String documentCode) {
this.documentCode = documentCode;
}

public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getTypeValue() {
return typeValue;
}

public void setTypeValue(String typeValue) {
this.typeValue = typeValue;
}

public String getPurposeValue() {
return purposeValue;
}

public void setPurposeValue(String purposeValue) {
this.purposeValue = purposeValue;
}

public List<FileName> getFileNames() {
return fileNames;
}

public void setFileNames(List<FileName> fileNames) {
this.fileNames = fileNames;
}

public String getNumberOfFiles() {
return numberOfFiles;
}

public void setNumberOfFiles(String numberOfFiles) {
this.numberOfFiles = numberOfFiles;
}

}

class EmployeePartnerModeActivationDetails {

@SerializedName("selected_partner_index")
@Expose
private String selectedPartnerIndex;
@SerializedName("create_mode")
@Expose
private String createMode;

public String getSelectedPartnerIndex() {
return selectedPartnerIndex;
}

public void setSelectedPartnerIndex(String selectedPartnerIndex) {
this.selectedPartnerIndex = selectedPartnerIndex;
}

public String getCreateMode() {
return createMode;
}

public void setCreateMode(String createMode) {
this.createMode = createMode;
}

}


class EmployeeUserDetails {

@SerializedName("handle_details")
@Expose
private List<HandleDetail> handleDetails = null;

public List<HandleDetail> getHandleDetails() {
return handleDetails;
}

public void setHandleDetails(List<HandleDetail> handleDetails) {
this.handleDetails = handleDetails;
}

}

class FileName {

@SerializedName("name")
@Expose
private String name;
@SerializedName("file_number")
@Expose
private String fileNumber;
@SerializedName("id")
@Expose
private String id;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getFileNumber() {
return fileNumber;
}

public void setFileNumber(String fileNumber) {
this.fileNumber = fileNumber;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

}





class HandleDetail {

@SerializedName("handle_type")
@Expose
private String handleType;
@SerializedName("handle_value")
@Expose
private String handleValue;

public String getHandleType() {
return handleType;
}

public void setHandleType(String handleType) {
this.handleType = handleType;
}

public String getHandleValue() {
return handleValue;
}

public void setHandleValue(String handleValue) {
this.handleValue = handleValue;
}

}




class PartnerAddressDetail {

	/*
	 * @SerializedName("contact_details")
	 * 
	 * @Expose private ContactDetails_ contactDetails;
	 */
@SerializedName("latitude")
@Expose
private String latitude;
@SerializedName("longitude")
@Expose
private String longitude;
@SerializedName("id")
@Expose
private String id;
@SerializedName("address_line_1")
@Expose
private String addressLine1;
@SerializedName("address_line_2")
@Expose
private String addressLine2;
@SerializedName("geo_hierarchy_element_id")
@Expose
private String geoHierarchyElementId;
@SerializedName("pincode")
@Expose
private String pincode;
@SerializedName("landmark")
@Expose
private String landmark;
@SerializedName("STATE")
@Expose
private String sTATE;
@SerializedName("DISTRICT")
@Expose
private String dISTRICT;
@SerializedName("SUB-DISTRICT")
@Expose
private String sUBDISTRICT;
@SerializedName("VTC")
@Expose
private String vTC;
@SerializedName("geocoded_lat_long")
@Expose
private String geocodedLatLong;
@SerializedName("type")
@Expose
private String type;
@SerializedName("type_value")
@Expose
private String typeValue;
@SerializedName("COUNTRY")
@Expose
private String cOUNTRY;

	/*
	 * public ContactDetails_ getContactDetails() { return contactDetails; }
	 * 
	 * public void setContactDetails(ContactDetails_ contactDetails) {
	 * this.contactDetails = contactDetails; }
	 */

public String getLatitude() {
return latitude;
}

public void setLatitude(String latitude) {
this.latitude = latitude;
}

public String getLongitude() {
return longitude;
}

public void setLongitude(String longitude) {
this.longitude = longitude;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getAddressLine1() {
return addressLine1;
}

public void setAddressLine1(String addressLine1) {
this.addressLine1 = addressLine1;
}

public String getAddressLine2() {
return addressLine2;
}

public void setAddressLine2(String addressLine2) {
this.addressLine2 = addressLine2;
}

public String getGeoHierarchyElementId() {
return geoHierarchyElementId;
}

public void setGeoHierarchyElementId(String geoHierarchyElementId) {
this.geoHierarchyElementId = geoHierarchyElementId;
}

public String getPincode() {
return pincode;
}

public void setPincode(String pincode) {
this.pincode = pincode;
}

public String getLandmark() {
return landmark;
}

public void setLandmark(String landmark) {
this.landmark = landmark;
}

public String getSTATE() {
return sTATE;
}

public void setSTATE(String sTATE) {
this.sTATE = sTATE;
}

public String getDISTRICT() {
return dISTRICT;
}

public void setDISTRICT(String dISTRICT) {
this.dISTRICT = dISTRICT;
}

public String getSUBDISTRICT() {
return sUBDISTRICT;
}

public void setSUBDISTRICT(String sUBDISTRICT) {
this.sUBDISTRICT = sUBDISTRICT;
}

public String getVTC() {
return vTC;
}

public void setVTC(String vTC) {
this.vTC = vTC;
}

public String getGeocodedLatLong() {
return geocodedLatLong;
}

public void setGeocodedLatLong(String geocodedLatLong) {
this.geocodedLatLong = geocodedLatLong;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getTypeValue() {
return typeValue;
}

public void setTypeValue(String typeValue) {
this.typeValue = typeValue;
}

public String getCOUNTRY() {
return cOUNTRY;
}

public void setCOUNTRY(String cOUNTRY) {
this.cOUNTRY = cOUNTRY;
}

}



class PartnerContactDetails {

@SerializedName("primary_email")
@Expose
private String primaryEmail;
@SerializedName("mobile_number")
@Expose
private String mobileNumber;
@SerializedName("mobile_country_code")
@Expose
private String mobileCountryCode;
@SerializedName("alternate_contact_number")
@Expose
private String alternateContactNumber;
@SerializedName("alternate_contact_country_code")
@Expose
private String alternateContactCountryCode;
@SerializedName("landline")
@Expose
private String landline;
@SerializedName("landline_country_code")
@Expose
private String landlineCountryCode;
@SerializedName("fax")
@Expose
private String fax;
@SerializedName("fax_country_code")
@Expose
private String faxCountryCode;
@SerializedName("contact_id")
@Expose
private String contactId;

public String getPrimaryEmail() {
return primaryEmail;
}

public void setPrimaryEmail(String primaryEmail) {
this.primaryEmail = primaryEmail;
}

public String getMobileNumber() {
return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
this.mobileNumber = mobileNumber;
}

public String getMobileCountryCode() {
return mobileCountryCode;
}

public void setMobileCountryCode(String mobileCountryCode) {
this.mobileCountryCode = mobileCountryCode;
}

public String getAlternateContactNumber() {
return alternateContactNumber;
}

public void setAlternateContactNumber(String alternateContactNumber) {
this.alternateContactNumber = alternateContactNumber;
}

public String getAlternateContactCountryCode() {
return alternateContactCountryCode;
}

public void setAlternateContactCountryCode(String alternateContactCountryCode) {
this.alternateContactCountryCode = alternateContactCountryCode;
}

public String getLandline() {
return landline;
}

public void setLandline(String landline) {
this.landline = landline;
}

public String getLandlineCountryCode() {
return landlineCountryCode;
}

public void setLandlineCountryCode(String landlineCountryCode) {
this.landlineCountryCode = landlineCountryCode;
}

public String getFax() {
return fax;
}

public void setFax(String fax) {
this.fax = fax;
}

public String getFaxCountryCode() {
return faxCountryCode;
}

public void setFaxCountryCode(String faxCountryCode) {
this.faxCountryCode = faxCountryCode;
}

public String getContactId() {
return contactId;
}

public void setContactId(String contactId) {
this.contactId = contactId;
}

}


class PartnerDetail {

@SerializedName("partner_personal_details")
@Expose
private PartnerPersonalDetails partnerPersonalDetails;
@SerializedName("partner_contact_details")
@Expose
private PartnerContactDetails partnerContactDetails;
@SerializedName("partner_address_details")
@Expose
private List<PartnerAddressDetail> partnerAddressDetails = null;
@SerializedName("partner_document_details")
@Expose
private List<PartnerDocumentDetail> partnerDocumentDetails = null;

public PartnerPersonalDetails getPartnerPersonalDetails() {
return partnerPersonalDetails;
}

public void setPartnerPersonalDetails(PartnerPersonalDetails partnerPersonalDetails) {
this.partnerPersonalDetails = partnerPersonalDetails;
}

public PartnerContactDetails getPartnerContactDetails() {
return partnerContactDetails;
}

public void setPartnerContactDetails(PartnerContactDetails partnerContactDetails) {
this.partnerContactDetails = partnerContactDetails;
}

public List<PartnerAddressDetail> getPartnerAddressDetails() {
return partnerAddressDetails;
}

public void setPartnerAddressDetails(List<PartnerAddressDetail> partnerAddressDetails) {
this.partnerAddressDetails = partnerAddressDetails;
}

public List<PartnerDocumentDetail> getPartnerDocumentDetails() {
return partnerDocumentDetails;
}

public void setPartnerDocumentDetails(List<PartnerDocumentDetail> partnerDocumentDetails) {
this.partnerDocumentDetails = partnerDocumentDetails;
}

}

class PartnerDocumentDetail {

@SerializedName("identifier")
@Expose
private String identifier;
@SerializedName("type")
@Expose
private String type;
@SerializedName("id")
@Expose
private String id;
@SerializedName("purpose")
@Expose
private String purpose;
@SerializedName("valid_until")
@Expose
private String validUntil;
@SerializedName("description")
@Expose
private String description;
@SerializedName("document_code")
@Expose
private String documentCode;
@SerializedName("version")
@Expose
private String version;
@SerializedName("type_value")
@Expose
private String typeValue;
@SerializedName("purpose_value")
@Expose
private String purposeValue;
@SerializedName("file_names")
@Expose
private List<FileName> fileNames = null;
@SerializedName("number_of_files")
@Expose
private String numberOfFiles;

public String getIdentifier() {
return identifier;
}

public void setIdentifier(String identifier) {
this.identifier = identifier;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getPurpose() {
return purpose;
}

public void setPurpose(String purpose) {
this.purpose = purpose;
}

public String getValidUntil() {
return validUntil;
}

public void setValidUntil(String validUntil) {
this.validUntil = validUntil;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getDocumentCode() {
return documentCode;
}

public void setDocumentCode(String documentCode) {
this.documentCode = documentCode;
}

public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}

public String getTypeValue() {
return typeValue;
}

public void setTypeValue(String typeValue) {
this.typeValue = typeValue;
}

public String getPurposeValue() {
return purposeValue;
}

public void setPurposeValue(String purposeValue) {
this.purposeValue = purposeValue;
}

public List<FileName> getFileNames() {
return fileNames;
}

public void setFileNames(List<FileName> fileNames) {
this.fileNames = fileNames;
}

public String getNumberOfFiles() {
return numberOfFiles;
}

public void setNumberOfFiles(String numberOfFiles) {
this.numberOfFiles = numberOfFiles;
}

}

class PartnerPersonalDetails {

@SerializedName("id")
@Expose
private String id;
@SerializedName("first_name")
@Expose
private String firstName;
@SerializedName("last_name")
@Expose
private String lastName;
@SerializedName("middle_name")
@Expose
private String middleName;
@SerializedName("image_document_id")
@Expose
private String imageDocumentId;
@SerializedName("salutation")
@Expose
private String salutation;
@SerializedName("nationality")
@Expose
private String nationality;
@SerializedName("country_of_birth")
@Expose
private String countryOfBirth;
@SerializedName("country_of_residence")
@Expose
private String countryOfResidence;
@SerializedName("relationship_with_entity")
@Expose
private String relationshipWithEntity;
@SerializedName("preferred_language")
@Expose
private String preferredLanguage;
@SerializedName("residential_status")
@Expose
private String residentialStatus;
@SerializedName("gender")
@Expose
private String gender;
@SerializedName("is_authorized_signatory")
@Expose
private String isAuthorizedSignatory;
@SerializedName("date_of_birth")
@Expose
private String dateOfBirth;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getMiddleName() {
return middleName;
}

public void setMiddleName(String middleName) {
this.middleName = middleName;
}

public String getImageDocumentId() {
return imageDocumentId;
}

public void setImageDocumentId(String imageDocumentId) {
this.imageDocumentId = imageDocumentId;
}

public String getSalutation() {
return salutation;
}

public void setSalutation(String salutation) {
this.salutation = salutation;
}

public String getNationality() {
return nationality;
}

public void setNationality(String nationality) {
this.nationality = nationality;
}

public String getCountryOfBirth() {
return countryOfBirth;
}

public void setCountryOfBirth(String countryOfBirth) {
this.countryOfBirth = countryOfBirth;
}

public String getCountryOfResidence() {
return countryOfResidence;
}

public void setCountryOfResidence(String countryOfResidence) {
this.countryOfResidence = countryOfResidence;
}

public String getRelationshipWithEntity() {
return relationshipWithEntity;
}

public void setRelationshipWithEntity(String relationshipWithEntity) {
this.relationshipWithEntity = relationshipWithEntity;
}

public String getPreferredLanguage() {
return preferredLanguage;
}

public void setPreferredLanguage(String preferredLanguage) {
this.preferredLanguage = preferredLanguage;
}

public String getResidentialStatus() {
return residentialStatus;
}

public void setResidentialStatus(String residentialStatus) {
this.residentialStatus = residentialStatus;
}

public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
}

public String getIsAuthorizedSignatory() {
return isAuthorizedSignatory;
}

public void setIsAuthorizedSignatory(String isAuthorizedSignatory) {
this.isAuthorizedSignatory = isAuthorizedSignatory;
}

public String getDateOfBirth() {
return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}

}


class Purpose {

@SerializedName("code")
@Expose
private String code;
@SerializedName("value")
@Expose
private String value;

public String getCode() {
return code;
}

public void setCode(String code) {
this.code = code;
}

public String getValue() {
return value;
}

public void setValue(String value) {
this.value = value;
}

}


class Request {

@SerializedName("agent_details")
@Expose
private AgentDetails agentDetails;
@SerializedName("employee_basic_details")
@Expose
private EmployeeBasicDetails employeeBasicDetails;
@SerializedName("employee_contact_details")
@Expose
private EmployeeContactDetails employeeContactDetails;
@SerializedName("employee_partner_mode_activation_details")
@Expose
private EmployeePartnerModeActivationDetails employeePartnerModeActivationDetails;
@SerializedName("agent_address_details")
@Expose
private List<AgentAddressDetail> agentAddressDetails = null;
@SerializedName("agent_document_details")
@Expose
private List<AgentDocumentDetail> agentDocumentDetails = null;
@SerializedName("partner_details")
@Expose
private List<PartnerDetail> partnerDetails = null;
@SerializedName("agent_account_details")
@Expose
private List<AgentAccountDetail> agentAccountDetails = null;
@SerializedName("employee_address_details")
@Expose
private List<EmployeeAddressDetail> employeeAddressDetails = null;
@SerializedName("employee_document_details")
@Expose
private List<EmployeeDocumentDetail> employeeDocumentDetails = null;
@SerializedName("employee_user_details")
@Expose
private EmployeeUserDetails employeeUserDetails;
@SerializedName("role_details")
@Expose
private RoleDetails roleDetails;

public AgentDetails getAgentDetails() {
return agentDetails;
}

public void setAgentDetails(AgentDetails agentDetails) {
this.agentDetails = agentDetails;
}

public EmployeeBasicDetails getEmployeeBasicDetails() {
return employeeBasicDetails;
}

public void setEmployeeBasicDetails(EmployeeBasicDetails employeeBasicDetails) {
this.employeeBasicDetails = employeeBasicDetails;
}

public EmployeeContactDetails getEmployeeContactDetails() {
return employeeContactDetails;
}

public void setEmployeeContactDetails(EmployeeContactDetails employeeContactDetails) {
this.employeeContactDetails = employeeContactDetails;
}

public EmployeePartnerModeActivationDetails getEmployeePartnerModeActivationDetails() {
return employeePartnerModeActivationDetails;
}

public void setEmployeePartnerModeActivationDetails(EmployeePartnerModeActivationDetails employeePartnerModeActivationDetails) {
this.employeePartnerModeActivationDetails = employeePartnerModeActivationDetails;
}

public List<AgentAddressDetail> getAgentAddressDetails() {
return agentAddressDetails;
}

public void setAgentAddressDetails(List<AgentAddressDetail> agentAddressDetails) {
this.agentAddressDetails = agentAddressDetails;
}

public List<AgentDocumentDetail> getAgentDocumentDetails() {
return agentDocumentDetails;
}

public void setAgentDocumentDetails(List<AgentDocumentDetail> agentDocumentDetails) {
this.agentDocumentDetails = agentDocumentDetails;
}

public List<PartnerDetail> getPartnerDetails() {
return partnerDetails;
}

public void setPartnerDetails(List<PartnerDetail> partnerDetails) {
this.partnerDetails = partnerDetails;
}

public List<AgentAccountDetail> getAgentAccountDetails() {
return agentAccountDetails;
}

public void setAgentAccountDetails(List<AgentAccountDetail> agentAccountDetails) {
this.agentAccountDetails = agentAccountDetails;
}

public List<EmployeeAddressDetail> getEmployeeAddressDetails() {
return employeeAddressDetails;
}

public void setEmployeeAddressDetails(List<EmployeeAddressDetail> employeeAddressDetails) {
this.employeeAddressDetails = employeeAddressDetails;
}

public List<EmployeeDocumentDetail> getEmployeeDocumentDetails() {
return employeeDocumentDetails;
}

public void setEmployeeDocumentDetails(List<EmployeeDocumentDetail> employeeDocumentDetails) {
this.employeeDocumentDetails = employeeDocumentDetails;
}

public EmployeeUserDetails getEmployeeUserDetails() {
return employeeUserDetails;
}

public void setEmployeeUserDetails(EmployeeUserDetails employeeUserDetails) {
this.employeeUserDetails = employeeUserDetails;
}

public RoleDetails getRoleDetails() {
return roleDetails;
}

public void setRoleDetails(RoleDetails roleDetails) {
this.roleDetails = roleDetails;
}

}


class RoleDetails {

@SerializedName("id")
@Expose
private String id;
@SerializedName("code")
@Expose
private String code;
@SerializedName("name")
@Expose
private String name;
@SerializedName("permission_code_list")
@Expose
private List<String> permissionCodeList = null;
@SerializedName("permissions_changed")
@Expose
private String permissionsChanged;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getCode() {
return code;
}

public void setCode(String code) {
this.code = code;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public List<String> getPermissionCodeList() {
return permissionCodeList;
}

public void setPermissionCodeList(List<String> permissionCodeList) {
this.permissionCodeList = permissionCodeList;
}

public String getPermissionsChanged() {
return permissionsChanged;
}

public void setPermissionsChanged(String permissionsChanged) {
this.permissionsChanged = permissionsChanged;
}

}















