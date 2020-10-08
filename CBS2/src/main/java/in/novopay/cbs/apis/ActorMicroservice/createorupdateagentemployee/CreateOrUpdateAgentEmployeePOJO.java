package in.novopay.cbs.apis.ActorMicroservice.createorupdateagentemployee;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import in.novopay.cbs.apis.Headers;

public class CreateOrUpdateAgentEmployeePOJO {


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

class EmployeeAddressDetail {

   
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
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("type_value")
    @Expose
    private String typeValue;
    @SerializedName("COUNTRY")
    @Expose
    private String cOUNTRY;

 

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
    @SerializedName("middle_name")
    @Expose
    private String middleName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("date_of_birth")
    @Expose
    private String dateOfBirth;
    @SerializedName("image_document_id")
    @Expose
    private String imageDocumentId;
    @SerializedName("preferred_language")
    @Expose
    private String preferredLanguage;
    @SerializedName("salutation")
    @Expose
    private String salutation;
    @SerializedName("agent_id")
    @Expose
    private String agentId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("gender")
    @Expose
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getImageDocumentId() {
        return imageDocumentId;
    }

    public void setImageDocumentId(String imageDocumentId) {
        this.imageDocumentId = imageDocumentId;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}


class EmployeeContactDetails {

    @SerializedName("mobile_country_code")
    @Expose
    private String mobileCountryCode;
    @SerializedName("mobile_number")
    @Expose
    private String mobileNumber;
    @SerializedName("alternate_contact_country_code")
    @Expose
    private String alternateContactCountryCode;
    @SerializedName("alternate_contact_number")
    @Expose
    private String alternateContactNumber;
    @SerializedName("primary_email")
    @Expose
    private String primaryEmail;

    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAlternateContactCountryCode() {
        return alternateContactCountryCode;
    }

    public void setAlternateContactCountryCode(String alternateContactCountryCode) {
        this.alternateContactCountryCode = alternateContactCountryCode;
    }

    public String getAlternateContactNumber() {
        return alternateContactNumber;
    }

    public void setAlternateContactNumber(String alternateContactNumber) {
        this.alternateContactNumber = alternateContactNumber;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
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

class Request {

    @SerializedName("employee_basic_details")
    @Expose
    private EmployeeBasicDetails employeeBasicDetails;
    @SerializedName("employee_address_details")
    @Expose
    private List<EmployeeAddressDetail> employeeAddressDetails = null;
    @SerializedName("employee_contact_details")
    @Expose
    private EmployeeContactDetails employeeContactDetails;
    @SerializedName("employee_user_details")
    @Expose
    private EmployeeUserDetails employeeUserDetails;
    @SerializedName("employee_document_details")
    @Expose
    private List<EmployeeDocumentDetail> employeeDocumentDetails = null;
    @SerializedName("role_details")
    @Expose
    private RoleDetails roleDetails;

    public EmployeeBasicDetails getEmployeeBasicDetails() {
        return employeeBasicDetails;
    }

    public void setEmployeeBasicDetails(EmployeeBasicDetails employeeBasicDetails) {
        this.employeeBasicDetails = employeeBasicDetails;
    }

    public List<EmployeeAddressDetail> getEmployeeAddressDetails() {
        return employeeAddressDetails;
    }

    public void setEmployeeAddressDetails(List<EmployeeAddressDetail> employeeAddressDetails) {
        this.employeeAddressDetails = employeeAddressDetails;
    }

    public EmployeeContactDetails getEmployeeContactDetails() {
        return employeeContactDetails;
    }

    public void setEmployeeContactDetails(EmployeeContactDetails employeeContactDetails) {
        this.employeeContactDetails = employeeContactDetails;
    }

    public EmployeeUserDetails getEmployeeUserDetails() {
        return employeeUserDetails;
    }

    public void setEmployeeUserDetails(EmployeeUserDetails employeeUserDetails) {
        this.employeeUserDetails = employeeUserDetails;
    }

    public List<EmployeeDocumentDetail> getEmployeeDocumentDetails() {
        return employeeDocumentDetails;
    }

    public void setEmployeeDocumentDetails(List<EmployeeDocumentDetail> employeeDocumentDetails) {
        this.employeeDocumentDetails = employeeDocumentDetails;
    }

    public RoleDetails getRoleDetails() {
        return roleDetails;
    }

    public void setRoleDetails(RoleDetails roleDetails) {
        this.roleDetails = roleDetails;
    }

}

class FileName {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("file_number")
    @Expose
    private String fileNumber;

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