package in.novopay.cbs.apis.ActorMicroservice.createorupdateagent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;

import in.novopay.cbs.utils.ApiUtils;
import in.novopay.cbs.utils.DBUtils;
import in.novopay.cbs.utils.JavaUtils;

public class CreateOrUpdateAgent extends ApiUtils {
	

	public String getRequestBody(String serviceName, HashMap<String, String> usrData) {
		
		CreateOrUpdateAgentPojo createOrUpdateAgentPojo=new CreateOrUpdateAgentPojo();
		
		AgentAccountDetail agentAccountDetail=new AgentAccountDetail();
		AgentAccountDetail agentAccountDetail1=new AgentAccountDetail();
		AgentAccountDetail agentAccountDetail2=new AgentAccountDetail();
		JavaUtils javaUtils=new JavaUtils();
		DBUtils dbUtils=new DBUtils();
		
		List<AgentAccountDetail> agentAccountDetailList=new ArrayList<AgentAccountDetail>();
		List<AgentAddressDetail> agentAddressDetailList=new ArrayList<AgentAddressDetail>();
		AgentAddressDetail agentAddressDetail=new AgentAddressDetail();
		AgentDetails agentDetails=new AgentDetails();
	    List<AgentDocumentDetail> agentDocumentDetailList=new ArrayList<AgentDocumentDetail>();
	    AgentDocumentDetail agentDocumentDetail=new AgentDocumentDetail();
		ContactDetails contactDetails=new ContactDetails();
		List<EmployeeAddressDetail> employeeAddressDetailList=new ArrayList<EmployeeAddressDetail>();
		EmployeeAddressDetail employeeAddressDetail=new EmployeeAddressDetail();
		EmployeeBasicDetails employeeBasicDetails=new EmployeeBasicDetails();
		EmployeeContactDetails employeeContactDetails=new EmployeeContactDetails();
		List<EmployeeDocumentDetail> employeeDocumentDetailList=new ArrayList<EmployeeDocumentDetail>();
		EmployeeDocumentDetail employeeDocumentDetail=new EmployeeDocumentDetail();
		EmployeePartnerModeActivationDetails employeePartnerModeActivationDetails=new EmployeePartnerModeActivationDetails();
		EmployeeUserDetails employeeUserDetails=new EmployeeUserDetails();
		List<HandleDetail> handleDetailList=new ArrayList<HandleDetail>();
		HandleDetail handleDetail=new HandleDetail();
		List<PartnerAddressDetail> partnerAddressDetailList=new ArrayList<PartnerAddressDetail>();
		PartnerAddressDetail partnerAddressDetail=new PartnerAddressDetail();
		PartnerContactDetails partnerContactDetails=new PartnerContactDetails();
		List<PartnerDetail> partnerDetailList=new ArrayList<PartnerDetail>();
		PartnerDetail partnerDetail=new PartnerDetail();
		List<PartnerDocumentDetail> partnerDocumentDetailList=new ArrayList<PartnerDocumentDetail>();
		PartnerDocumentDetail partnerDocumentDetail=new PartnerDocumentDetail();
		PartnerPersonalDetails partnerPersonalDetails=new PartnerPersonalDetails();
		PartnerPersonalDetails partnerPersonalDetails1=new PartnerPersonalDetails();
		PartnerPersonalDetails partnerPersonalDetails2=new PartnerPersonalDetails();
		RoleDetails roleDetails=new RoleDetails();
		Purpose purpose=new Purpose();
		List<Purpose> purposeList=new ArrayList<Purpose>();
		Purpose purpose1=new Purpose();
		List<Purpose> purposeList1=new ArrayList<Purpose>();
		Purpose purpose2=new Purpose();
		List<Purpose> purposeList2=new ArrayList<Purpose>();
		
		List<FileName> fileNameList=new ArrayList<FileName>();
		FileName fileName=new FileName();
		List<FileName> agentFileNameList=new ArrayList<FileName>();
		FileName agentFileName=new FileName();
		List<FileName> employeeFileNameList=new ArrayList<FileName>();
		FileName employeeFileName=new FileName();
		List<FileName> partnerFileNameList=new ArrayList<FileName>();
		FileName partnerFileName=new FileName();
		//List<Purpose> purposeList=new ArrayList<Purpose>();
	
		Request request=new Request();
		

		
		
		
		/*Adding  Details*/
		agentDetails.setAgeOfBusiness(usrData.get("ageOfBusiness"));
		agentDetails.setAnnualTurnover(usrData.get("annualTurnover"));
		agentDetails.setBaseOfficeId(usrData.get("baseOfficeId"));
		agentDetails.setBusinessRegistrationAuthority(usrData.get("businessRegistrationAuthority"));
		agentDetails.setBusinessRegistrationCountry(usrData.get("businessRegistrationCountry"));
		agentDetails.setBusinessRegistrationNumber(usrData.get("businessRegistrationNumber"));
		agentDetails.setBusinessType(usrData.get("businessType"));
		agentDetails.setClassification(usrData.get("classification"));
		
		 if(usrData.get("code").equalsIgnoreCase("dynamic")&&usrData.get("function_sub_code").equalsIgnoreCase("create")){
			 String code=generateRandomStan();
			 agentDetails.setCode(code);
			// javaUtils.addTestDataIni("agentCode",code);
		      }else{
		agentDetails.setCode(usrData.get("code"));}
		 
		 if(usrData.get("function_sub_code").equalsIgnoreCase("update")) {
		String id=dbUtils.getID(serviceName, usrData, getvalueFromTestDataIni("agentCode"),usrData.get("tableName"));
			 agentDetails.setId(id);
		 javaUtils.addTestDataIni("agentId",id);
			  
			 agentDetails.setCode(getvalueFromTestDataIni("agentCode"));
				
		 }
		 

		agentDetails.setName(usrData.get("name"));
		agentDetails.setNatureOfBusiness(usrData.get("natureOfBusiness"));
		agentDetails.setParentId(usrData.get("parentId"));
		agentDetails.setShopPhotoDocumentCode("1f769b35-cdf1-4f07-b282-1b7ec46a45ad");
		agentDetails.setTaxIdentificationNumber(usrData.get("taxIdentificationNumber"));
		agentDetails.setTradeLicenseExpiryDate(usrData.get("tradeLicenseExpiryDate"));
		agentDetails.setTradeLicenseIssuingAuthority(usrData.get("tradeLicenseIssuingAuthority"));
		agentDetails.setType("AGENT");
		
		
		/*Adding address Details*/
		
		agentAddressDetail.setAddressLine1(usrData.get("addressLine1"));
		agentAddressDetail.setAddressLine2(usrData.get("addressLine2"));
		agentAddressDetail.setGeoHierarchyElementId(usrData.get("geoHierarchyElementId"));
		//agentAddressDetail.setGeocodedLatLong(geocodedLatLong);
		agentAddressDetail.setId("");
		agentAddressDetail.setLandmark("Hyper Market");
		agentAddressDetail.setLatitude("45.05");
		agentAddressDetail.setLongitude("97.55");
		agentAddressDetail.setPincode(usrData.get("pincode"));
		agentAddressDetail.setType(usrData.get("agentAddressType"));
		
		
		
		//Adding Contact details in Agent address
		
		contactDetails.setPrimaryEmail(usrData.get("primaryEmail"));
		contactDetails.setMobileCountryCode("+91");
		contactDetails.setMobileNumber(usrData.get("mobileNumber"));
		contactDetails.setAlternateContactCountryCode("+91");
		contactDetails.setAlternateContactNumber("9845778453");
		contactDetails.setFaxCountryCode("+91");
		contactDetails.setFax("7834930949");
		contactDetails.setContactId("");
		
		agentAddressDetail.setContactDetails(contactDetails);
		
		agentAddressDetailList.add(agentAddressDetail);
		
		//adding document details
		agentDocumentDetail.setId("");
		agentDocumentDetail.setIdentifier(usrData.get("identifier"));
		agentDocumentDetail.setDocumentCode(usrData.get("documentCode"));
		agentDocumentDetail.setDescription(usrData.get("description"));
		agentDocumentDetail.setNumberOfFiles("1");
		agentDocumentDetail.setType(usrData.get("agentDocumentType"));
		agentDocumentDetail.setValidUntil(usrData.get("validUntil"));
		agentDocumentDetail.setVersion(usrData.get("version"));
		agentDocumentDetail.setPurpose(usrData.get("agentDocumentPurpose"));
		agentFileName.setFileNumber("1");
		agentFileName.setName("Agent Document Details");
		agentFileName.setId("");
		agentFileNameList.add(agentFileName);
		agentDocumentDetail.setFileNames(agentFileNameList);
		agentDocumentDetailList.add(agentDocumentDetail);
		
	
		//Adding Partner Details
		
		if(usrData.get("businessType").equalsIgnoreCase("PROPRIETORSHIP")) {
		  //Adding partner details
			partnerPersonalDetails.setCountryOfBirth(usrData.get("countryOfBirth"));
			partnerPersonalDetails.setCountryOfResidence(usrData.get("countryOfResidence"));
			partnerPersonalDetails.setDateOfBirth(usrData.get("dateOfBirth"));
			partnerPersonalDetails.setFirstName(usrData.get("firstName"));
			partnerPersonalDetails.setMiddleName(usrData.get("middleName"));
			partnerPersonalDetails.setLastName(usrData.get("lastName"));
			partnerPersonalDetails.setGender(usrData.get("gender"));
			partnerPersonalDetails.setId("");
			partnerPersonalDetails.setImageDocumentId("1f769b35-cdf1-4f07-b282-1b7ec46a45ad");
			partnerPersonalDetails.setIsAuthorizedSignatory(usrData.get("isAuthorizedSignatory"));
			partnerPersonalDetails.setNationality(usrData.get("nationality"));
			partnerPersonalDetails.setPreferredLanguage(usrData.get("preferredLanguage"));
			partnerPersonalDetails.setRelationshipWithEntity(usrData.get("relationshipWithEntity"));
			partnerPersonalDetails.setResidentialStatus(usrData.get("residentialStatus"));
			partnerPersonalDetails.setSalutation(usrData.get("salutation"));
			
			
			//Adding Address Details
			partnerAddressDetail.setId("");
			partnerAddressDetail.setAddressLine1(usrData.get("addressLine1"));
			partnerAddressDetail.setAddressLine2(usrData.get("addressLine2"));
			partnerAddressDetail.setGeoHierarchyElementId(usrData.get("geoHierarchyElementId"));
		    partnerAddressDetail.setLandmark("Hyper AMrket");
			partnerAddressDetail.setLatitude("56.98");
			partnerAddressDetail.setLongitude("45.78");
			partnerAddressDetail.setPincode(usrData.get("pincode"));
			partnerAddressDetail.setType(usrData.get("partnerAdrressType"));
			partnerAddressDetailList.add(partnerAddressDetail);
			
			//Adding Contact Details
			
			partnerContactDetails.setAlternateContactCountryCode("+91");
			partnerContactDetails.setAlternateContactNumber("9874839893");
			partnerContactDetails.setContactId("");
			partnerContactDetails.setFaxCountryCode("+91");
	        partnerContactDetails.setLandline("9384747859");
			partnerContactDetails.setLandlineCountryCode("+91");
         	partnerContactDetails.setMobileCountryCode("+91");
         	partnerContactDetails.setMobileNumber(usrData.get("mobileNumber"));
         	partnerContactDetails.setPrimaryEmail(usrData.get("primaryEmail"));
         	
         	//Adding Document Details
         	partnerDocumentDetail.setDescription("Partner Document Details");
         	partnerDocumentDetail.setDocumentCode("1f769b35-cdf1-4f07-b282-1b7ec46a45ad");
         	partnerDocumentDetail.setId("");
         	partnerDocumentDetail.setIdentifier(usrData.get("identifier"));
         	partnerDocumentDetail.setNumberOfFiles("1");
         	partnerDocumentDetail.setPurpose(usrData.get("partnerDoucmentPurpose"));
         	partnerDocumentDetail.setType(usrData.get("partnerDocumentType"));
         	partnerDocumentDetail.setValidUntil(usrData.get("validUntil"));
         	partnerDocumentDetail.setVersion("1");
         	partnerFileName.setFileNumber("1");
         	partnerFileName.setName("Partner Document Details");
         	partnerFileName.setId("");
         	partnerFileNameList.add(partnerFileName);
    		partnerDocumentDetail.setFileNames(partnerFileNameList);
         	partnerDocumentDetailList.add(partnerDocumentDetail);
         	
         	
         	
         	partnerDetail.setPartnerPersonalDetails(partnerPersonalDetails);
         	partnerDetail.setPartnerAddressDetails(partnerAddressDetailList);
         	partnerDetail.setPartnerContactDetails(partnerContactDetails);
         	partnerDetail.setPartnerDocumentDetails(partnerDocumentDetailList);
         	partnerDetailList.add(partnerDetail);
         	
		}
		
		
//Adding Internal Account
		agentAccountDetail.setAccountHolderName(usrData.get("accountHolderName"));
        agentAccountDetail.setCurrency(usrData.get("currency"));
		agentAccountDetail.setDesiredActionValue("CREATE-NEW-ACCOUNT");
		agentAccountDetail.setExternalAccountNumber(usrData.get("externalAccountNumber"));
		agentAccountDetail.setNewAccount("true");
		agentAccountDetail.setId("");
		//agentAccountDetail.setProductCode(productCode);
		agentAccountDetail.setProductId(usrData.get("productId"));
		//agentAccountDetail.setProductName(productName);
		agentAccountDetail.setProductType(usrData.get("extProductType"));
		agentAccountDetail.setProductSchemeId(usrData.get("productSchemeId"));
	    agentAccountDetail.setType("INT");
		purpose.setCode(usrData.get("AccountPurposeTxn"));
		purpose.setValue("Transaction Account");
		purposeList.add(purpose);
		agentAccountDetail.setPurpose(purposeList);
		
		
		//Setting Settlement Account
		
		agentAccountDetail1.setAccountHolderName(usrData.get("accountHolderName"));
		agentAccountDetail1.setAccountNumber(usrData.get("accountNumber"));
		agentAccountDetail1.setCurrency(usrData.get("currency"));
		agentAccountDetail1.setRoutingType(usrData.get("routingType"));
		agentAccountDetail1.setRoutingValue(usrData.get("routingValue"));
		agentAccountDetail1.setExternalAccountType(usrData.get("externalAccountType"));
		agentAccountDetail1.setType(usrData.get("accountType"));
		agentAccountDetail1.setNewAccount("true");
		purpose1.setCode(usrData.get("AccountPurposeSettle"));
		purpose1.setValue(usrData.get("Settlement Account"));
		purposeList1.add(purpose1);
		agentAccountDetail1.setPurpose(purposeList1);
		
		
		agentAccountDetail2.setAccountHolderName(usrData.get("accountHolderName"));
		agentAccountDetail2.setAccountNumber(usrData.get("accountNumber"));
		agentAccountDetail2.setCurrency(usrData.get("currency"));
		agentAccountDetail2.setRoutingType(usrData.get("routingType"));
		agentAccountDetail2.setRoutingValue(usrData.get("routingValue"));
		agentAccountDetail2.setExternalAccountType(usrData.get("externalAccountType"));
		agentAccountDetail2.setType(usrData.get("accountType"));
		agentAccountDetail2.setNewAccount("true");
		purpose2.setCode(usrData.get("AccountPurposeComission"));
		purpose2.setValue(usrData.get("Commision Account"));
		purposeList2.add(purpose2);
		agentAccountDetail2.setPurpose(purposeList2);
		
		
		
	
		
		
		agentAccountDetailList.add(agentAccountDetail);
		agentAccountDetailList.add(agentAccountDetail1);
		agentAccountDetailList.add(agentAccountDetail2);
		
		
		
		
		//Setting role
		
		roleDetails.setId(usrData.get("roleId"));
		roleDetails.setPermissionsChanged("false");
		
		
		
		//Adding employee details
		
		employeeBasicDetails.setDateOfBirth(usrData.get("dateOfBirth"));
		employeeBasicDetails.setFirstName(usrData.get("firstName"));
		employeeBasicDetails.setGender(usrData.get("gender"));
		employeeBasicDetails.setImageDocumentId("");
		employeeBasicDetails.setMiddleName(usrData.get("middleName"));
		employeeBasicDetails.setLastName(usrData.get("lastName"));
		employeeBasicDetails.setSalutation(usrData.get("salutation"));
	
		
		employeeContactDetails.setAlternateContactCountryCode("+91");
		employeeContactDetails.setAlternateContactNumber("8973883949");
		employeeContactDetails.setMobileCountryCode("+91");
		String PhoneNumber=generateRandomMobileNumber();
		employeeContactDetails.setMobileNumber(PhoneNumber);
		employeeContactDetails.setPrimaryEmail(usrData.get("employeePrimaryEmail"));
		
		
		handleDetail.setHandleType(usrData.get("handleType"));
		handleDetail.setHandleValue(PhoneNumber);
		handleDetailList.add(handleDetail);
		
		employeeUserDetails.setHandleDetails(handleDetailList);
		
		
		employeeDocumentDetail.setDocumentCode("1f769b35-cdf1-4f07-b282-1b7ec46a45ad");
		employeeDocumentDetail.setIdentifier(usrData.get("identifier"));
		employeeDocumentDetail.setPurpose(usrData.get("partnerDoucmentPurpose"));
		employeeDocumentDetail.setType(usrData.get("partnerDocumentType"));
		employeeDocumentDetail.setVersion("1");
		employeeFileName.setFileNumber("1");
		employeeFileName.setName("Employee Documents");
		employeeFileName.setId("");
		employeeFileNameList.add(employeeFileName);
		employeeDocumentDetail.setFileNames(employeeFileNameList);
		employeeDocumentDetailList.add(employeeDocumentDetail);
		
		employeePartnerModeActivationDetails.setCreateMode("CREATE_NEW");
		employeePartnerModeActivationDetails.setSelectedPartnerIndex("");
		
		
		//Setting Employee  Address
		employeeAddressDetail.setAddressLine1(usrData.get("addressLine1"));
		employeeAddressDetail.setAddressLine2(usrData.get("addressLine2"));
		employeeAddressDetail.setGeoHierarchyElementId(usrData.get("geoHierarchyElementId"));
		employeeAddressDetail.setLandmark("Hyper Marker");
		employeeAddressDetail.setPincode(usrData.get("pincode"));
		employeeAddressDetail.setLatitude("67.90");
		employeeAddressDetail.setLongitude("65.70");
		employeeAddressDetail.setType(usrData.get("employeeAddressType"));
		employeeAddressDetailList.add(employeeAddressDetail);
		
		
		request.setAgentAccountDetails(agentAccountDetailList);
		request.setAgentAddressDetails(agentAddressDetailList);
		request.setAgentDetails(agentDetails);
	    request.setAgentDocumentDetails(agentDocumentDetailList);
		request.setEmployeeAddressDetails(employeeAddressDetailList);
		request.setEmployeeBasicDetails(employeeBasicDetails);
		request.setEmployeeContactDetails(employeeContactDetails);
		request.setEmployeeDocumentDetails(employeeDocumentDetailList);
		request.setEmployeePartnerModeActivationDetails(employeePartnerModeActivationDetails);
		request.setEmployeeUserDetails(employeeUserDetails);
		request.setPartnerDetails(partnerDetailList);
		request.setRoleDetails(roleDetails);
		createOrUpdateAgentPojo.setHeaders(getRequestBodyHeaders(usrData));
		createOrUpdateAgentPojo.setRequest(request);
		
		Gson gson=new Gson();
		String userJson=gson.toJson(createOrUpdateAgentPojo);
		return userJson.toString();
		
		
	}

	
	
	

}
