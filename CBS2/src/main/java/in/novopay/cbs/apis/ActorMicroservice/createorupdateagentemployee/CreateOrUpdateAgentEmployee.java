package in.novopay.cbs.apis.ActorMicroservice.createorupdateagentemployee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;

import in.novopay.cbs.utils.ApiUtils;
import in.novopay.cbs.utils.DBUtils;
import in.novopay.cbs.utils.JavaUtils;

public class CreateOrUpdateAgentEmployee extends ApiUtils {

	public String getRequestBody(String serviceName, HashMap<String, String> usrData) {
		
		
		
		CreateOrUpdateAgentEmployeePOJO createOrUpdateAgentEmployeePOJO=new CreateOrUpdateAgentEmployeePOJO();
		
		DBUtils dbUtils=new DBUtils();
		JavaUtils javaUtils=new JavaUtils();
		Request request=new Request();
		
		// Adding employee basic details
		EmployeeBasicDetails employeeBasicDetails = new EmployeeBasicDetails();
		
		if ((usrData.get("function_sub_code").equalsIgnoreCase("UPDATE"))) {
			System.out.println(getvalueFromTestDataIni("agentEmployeeCode"));
			// System.out.println(usrData.get("tableName"));
			employeeBasicDetails.setId(dbUtils.getID(serviceName, usrData, getvalueFromTestDataIni("agentEmployeeCode"),
					usrData.get("tableName")));
			
		}
		
		employeeBasicDetails.setFirstName(usrData.get("firstName"));
		employeeBasicDetails.setMiddleName(usrData.get("middleName"));
		employeeBasicDetails.setLastName(usrData.get("lastName"));
		employeeBasicDetails.setDateOfBirth(usrData.get("dateOfBirth"));
		employeeBasicDetails.setImageDocumentId(usrData.get("imageDocumentId"));
		employeeBasicDetails.setPreferredLanguage(usrData.get("preferredLanguage"));
		employeeBasicDetails.setSalutation(usrData.get("salutation"));
		employeeBasicDetails.setAgentId(usrData.get("agentId"));
		employeeBasicDetails.setGender(usrData.get("gender"));
		
		// Adding employee address details
		
		EmployeeAddressDetail employeeAddressDetail = new EmployeeAddressDetail();
		
		employeeAddressDetail.setAddressLine1(usrData.get("addressLine1"));
		employeeAddressDetail.setAddressLine2(usrData.get("addressLine2"));
		employeeAddressDetail.setGeoHierarchyElementId(usrData.get("geoHierarchyElementId"));
		employeeAddressDetail.setPincode(usrData.get("pincode"));
		employeeAddressDetail.setLandmark(usrData.get("landmark"));
		employeeAddressDetail.setSTATE(usrData.get("sTATE"));
		employeeAddressDetail.setDISTRICT(usrData.get("dISTRICT"));
		employeeAddressDetail.setSUBDISTRICT(usrData.get("sUBDISTRICT"));
		employeeAddressDetail.setVTC(usrData.get("vTC"));
		employeeAddressDetail.setType(usrData.get("type"));
		employeeAddressDetail.setTypeValue(usrData.get("typeValue"));
		employeeAddressDetail.setCOUNTRY(usrData.get("cOUNTRY"));
		
		
		// Adding employee contact details 
		
		EmployeeContactDetails employeeContactDetails = new EmployeeContactDetails();
		
		employeeContactDetails.setMobileNumber(usrData.get("mobileNumber"));
		employeeContactDetails.setMobileCountryCode(usrData.get("mobileCountryCode"));
		employeeContactDetails.setAlternateContactCountryCode(usrData.get("alternateContactCountryCode"));
		employeeContactDetails.setAlternateContactNumber(usrData.get("alternateContactNumber"));
		employeeContactDetails.setPrimaryEmail(usrData.get("primaryEmail"));
		
		
	// adding employee document details
		
		EmployeeDocumentDetail employeeDocumentDetail = new EmployeeDocumentDetail();
		
		employeeDocumentDetail.setIdentifier(usrData.get("identifier"));
		employeeDocumentDetail.setType(usrData.get("docType"));
		employeeDocumentDetail.setPurpose(usrData.get("purpose"));
		employeeDocumentDetail.setValidUntil(usrData.get("validUntil"));
		employeeDocumentDetail.setDescription("This is Employee Document details");
		employeeDocumentDetail.setDocumentCode("1f769b35-cdf1-4f07-b282-1b7ec46a45ad");
		employeeDocumentDetail.setVersion(usrData.get("version"));
		employeeDocumentDetail.setTypeValue(usrData.get("docTypeValue"));
		employeeDocumentDetail.setPurposeValue(usrData.get("purposeValue"));
		employeeDocumentDetail.setNumberOfFiles("1");
		
		List<FileName> fileNamesList = new ArrayList<FileName>();
		FileName fileName = new FileName();
		fileName.setFileNumber("1");
		fileName.setName("employee Document name");
		fileNamesList.add(fileName);
		employeeDocumentDetail.setFileNames(fileNamesList);
		
		// Adding user handle details
		
		EmployeeUserDetails employeeUserDetails = new EmployeeUserDetails();
		List<HandleDetail> handleDetailList = new ArrayList<HandleDetail>();
		HandleDetail handleDetail = new HandleDetail();
		handleDetail.setHandleType(usrData.get("handleType"));
//		handleDetail.setHandleValue(usrData.get("handleValue"));
		
//		handleDetail.setHandleType("MSISDN");
		handleDetail.setHandleValue(generateRandomMobileNumber());
		handleDetailList.add(handleDetail);
		employeeUserDetails.setHandleDetails(handleDetailList);
		
		
		//Adding role details
		RoleDetails roleDetails = new RoleDetails();
		roleDetails.setId(usrData.get("roleId"));
		roleDetails.setPermissionsChanged("false");
		
		request.setEmployeeBasicDetails(employeeBasicDetails);
		
		List<EmployeeAddressDetail> employeeAddressDetailsList = new ArrayList<EmployeeAddressDetail>();
		employeeAddressDetailsList.add(employeeAddressDetail);
		request.setEmployeeAddressDetails(employeeAddressDetailsList);
		request.setEmployeeContactDetails(employeeContactDetails);
		request.setEmployeeUserDetails(employeeUserDetails);
		
		List<EmployeeDocumentDetail> employeeDocumentDetailsList = new ArrayList<EmployeeDocumentDetail>();
		employeeDocumentDetailsList.add(employeeDocumentDetail);
		request.setEmployeeDocumentDetails(employeeDocumentDetailsList);
		
		request.setRoleDetails(roleDetails);
		
		
		createOrUpdateAgentEmployeePOJO.setHeaders(getRequestBodyHeaders(usrData));
		createOrUpdateAgentEmployeePOJO.setRequest(request);
		
		Gson gson=new Gson();
	    String userJson=gson.toJson(createOrUpdateAgentEmployeePOJO);
		return userJson.toString();
	}
	

}
