package in.novopay.cbs.apis.ActorMicroservice.createorupdatecollection;

import java.util.HashMap;
import com.google.gson.Gson;

import in.novopay.cbs.utils.ApiUtils;

public class CreateOrUpdateCollection extends ApiUtils {

	public String getRequestBody(String serviceName, HashMap<String, String> usrData) {

		//DBUtils dbUtils = new DBUtils();
		
		CreateOrUpdateCollectionPojo objPojo = new CreateOrUpdateCollectionPojo();
		
		TelecomContact objTelecomContact = new TelecomContact();
		objTelecomContact.setAlternativePhoneNumber(usrData.get("alternativePhoneNumber"));
		objTelecomContact.setPrimaryPhoneNumber(usrData.get("primaryPhoneNumber"));
		
		ContactDetails objContactDetails = new ContactDetails();
		objContactDetails.setTelecomContact(objTelecomContact);
		
		PostalContact postalContact= new PostalContact();
		postalContact.setCity(usrData.get("city"));
		postalContact.setContactId(usrData.get("contactId"));
		postalContact.setLandmark(usrData.get("landmark"));
		postalContact.setLat(usrData.get("lat"));
		postalContact.setLocality(usrData.get("locality"));
		postalContact.setLong(usrData.get("long"));
		postalContact.setPincode(usrData.get("pincode"));
		postalContact.setState(usrData.get("state"));
		postalContact.setStreet(usrData.get("street"));
		objContactDetails.setPostalContact(postalContact);
		
		Customer customer= new Customer();
		customer.setContactDetails(objContactDetails);
		customer.setName(usrData.get("name"));
		customer.setShopName(usrData.get("shopName"));
		customer.setffbUserId(usrData.get("ffbUserId"));
		
		DueDetails dueDetails= new DueDetails();
		dueDetails.setAmount(usrData.get("amount"));
		dueDetails.setDpdBucketId(usrData.get("dpdBucketId"));
		dueDetails.setDueDate(usrData.get("dueDate"));
		dueDetails.setGeneratedDate(usrData.get("generatedDate"));
		dueDetails.setProductCategory(usrData.get("productCategory"));
		
		Request request= new Request();
		request.setTimestamp(usrData.get("timestamp"));
		request.setCollectionId(usrData.get("collectionId"));
		request.setCustomer(customer);
		request.setDueDetails(dueDetails);

		objPojo.setHeaders(getRequestBodyHeaders(usrData));
		objPojo.setRequest(request);

		Gson gson = new Gson();
		String userJson = gson.toJson(objPojo);
		return userJson.toString();

	}

}
