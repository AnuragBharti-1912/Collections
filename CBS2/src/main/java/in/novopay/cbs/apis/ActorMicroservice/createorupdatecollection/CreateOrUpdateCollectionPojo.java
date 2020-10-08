package in.novopay.cbs.apis.ActorMicroservice.createorupdatecollection;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import in.novopay.cbs.apis.Headers;

public class CreateOrUpdateCollectionPojo {

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

class ContactDetails {

	@SerializedName("telecomContact")
	@Expose
	private TelecomContact telecomContact;
	@SerializedName("postalContact")
	@Expose
	private PostalContact postalContact;

	public TelecomContact getTelecomContact() {
		return telecomContact;
	}

	public void setTelecomContact(TelecomContact telecomContact) {
		this.telecomContact = telecomContact;
	}

	public PostalContact getPostalContact() {
		return postalContact;
	}

	public void setPostalContact(PostalContact postalContact) {
		this.postalContact = postalContact;
	}

}

class Customer {

	@SerializedName("ffbUserId")
	@Expose
	private String ffbUserId;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("shopName")
	@Expose
	private String shopName;
	@SerializedName("contactDetails")
	@Expose
	private ContactDetails contactDetails;

	public String getffbUserId() {
		return ffbUserId;
	}

	public void setffbUserId(String ffbUserId) {
		this.ffbUserId = ffbUserId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

}

class DueDetails {

	@SerializedName("amount")
	@Expose
	private String amount;
	@SerializedName("generatedDate")
	@Expose
	private String generatedDate;
	@SerializedName("dueDate")
	@Expose
	private String dueDate;
	@SerializedName("productCategory")
	@Expose
	private String productCategory;
	@SerializedName("dpdBucketId")
	@Expose
	private String dpdBucketId;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getGeneratedDate() {
		return generatedDate;
	}

	public void setGeneratedDate(String generatedDate) {
		this.generatedDate = generatedDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getDpdBucketId() {
		return dpdBucketId;
	}

	public void setDpdBucketId(String dpdBucketId) {
		this.dpdBucketId = dpdBucketId;
	}

}





class PostalContact {

	@SerializedName("contactId")
	@Expose
	private String contactId;
	@SerializedName("pincode")
	@Expose
	private String pincode;
	@SerializedName("locality")
	@Expose
	private String locality;
	@SerializedName("street")
	@Expose
	private String street;
	@SerializedName("landmark")
	@Expose
	private String landmark;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("state")
	@Expose
	private String state;
	@SerializedName("lat")
	@Expose
	private String lat;
	@SerializedName("long")
	@Expose
	private String _long;

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLong() {
		return _long;
	}

	public void setLong(String _long) {
		this._long = _long;
	}

}

class Request {

	@SerializedName("timestamp")
	@Expose
	private String timestamp;
	@SerializedName("collectionId")
	@Expose
	private String collectionId;
	@SerializedName("customer")
	@Expose
	private Customer customer;
	@SerializedName("dueDetails")
	@Expose
	private DueDetails dueDetails;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public DueDetails getDueDetails() {
		return dueDetails;
	}

	public void setDueDetails(DueDetails dueDetails) {
		this.dueDetails = dueDetails;
	}

}

class TelecomContact {

	@SerializedName("primaryPhoneNumber")
	@Expose
	private String primaryPhoneNumber;
	@SerializedName("alternativePhoneNumber")
	@Expose
	private String alternativePhoneNumber;

	public String getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}

	public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
	}

	public String getAlternativePhoneNumber() {
		return alternativePhoneNumber;
	}

	public void setAlternativePhoneNumber(String alternativePhoneNumber) {
		this.alternativePhoneNumber = alternativePhoneNumber;
	}

}