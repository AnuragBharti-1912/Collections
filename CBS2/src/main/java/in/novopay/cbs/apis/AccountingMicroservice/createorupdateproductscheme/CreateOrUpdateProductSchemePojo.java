package in.novopay.cbs.apis.AccountingMicroservice.createorupdateproductscheme;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import in.novopay.cbs.apis.Headers;

public class CreateOrUpdateProductSchemePojo {
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

class PricingDetails {

	@SerializedName("transaction_catalogue_type")
	@Expose
	private String transactionCatalogueType;
	@SerializedName("pricing_type")
	@Expose
	private String pricingType;
	@SerializedName("price_setup_code")
	@Expose
	private String priceSetupCode;
	@SerializedName("price_setup_id")
	@Expose
	private String priceSetupId;
	@SerializedName("pricing_type_value")
	@Expose
	private Object pricingTypeValue;
	@SerializedName("price_setup_name")
	@Expose
	private String priceSetupName;
	@SerializedName("transaction_catalogue_sub_type")
	@Expose
	private String transactionCatalogueSubType;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("transaction_catalogue_id")
	@Expose
	private String transactionCatalogueId;
	@SerializedName("price_master_code")
	@Expose
	private String priceMasterCode;
	@SerializedName("transaction_accounting_rule_id")
	@Expose
	private String transactionAccountingRuleId;
	@SerializedName("price_master_name")
	@Expose
	private String priceMasterName;

	public String getTransactionCatalogueType() {
		return transactionCatalogueType;
	}

	public void setTransactionCatalogueType(String transactionCatalogueType) {
		this.transactionCatalogueType = transactionCatalogueType;
	}

	public String getPricingType() {
		return pricingType;
	}

	public void setPricingType(String pricingType) {
		this.pricingType = pricingType;
	}

	public String getPriceSetupCode() {
		return priceSetupCode;
	}

	public void setPriceSetupCode(String priceSetupCode) {
		this.priceSetupCode = priceSetupCode;
	}

	public String getPriceSetupId() {
		return priceSetupId;
	}

	public void setPriceSetupId(String priceSetupId) {
		this.priceSetupId = priceSetupId;
	}

	public Object getPricingTypeValue() {
		return pricingTypeValue;
	}

	public void setPricingTypeValue(Object pricingTypeValue) {
		this.pricingTypeValue = pricingTypeValue;
	}

	public String getPriceSetupName() {
		return priceSetupName;
	}

	public void setPriceSetupName(String priceSetupName) {
		this.priceSetupName = priceSetupName;
	}

	public String getTransactionCatalogueSubType() {
		return transactionCatalogueSubType;
	}

	public void setTransactionCatalogueSubType(String transactionCatalogueSubType) {
		this.transactionCatalogueSubType = transactionCatalogueSubType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTransactionCatalogueId() {
		return transactionCatalogueId;
	}

	public void setTransactionCatalogueId(String transactionCatalogueId) {
		this.transactionCatalogueId = transactionCatalogueId;
	}

	public String getPriceMasterCode() {
		return priceMasterCode;
	}

	public void setPriceMasterCode(String priceMasterCode) {
		this.priceMasterCode = priceMasterCode;
	}

	public String getTransactionAccountingRuleId() {
		return transactionAccountingRuleId;
	}

	public void setTransactionAccountingRuleId(String transactionAccountingRuleId) {
		this.transactionAccountingRuleId = transactionAccountingRuleId;
	}

	public String getPriceMasterName() {
		return priceMasterName;
	}

	public void setPriceMasterName(String priceMasterName) {
		this.priceMasterName = priceMasterName;
	}
}

class PricingList {
	@SerializedName("pricing_details")
	@Expose
	private PricingDetails pricingDetails;

	public PricingDetails getPricingDetails() {
		return pricingDetails;
	}

	public void setPricingDetails(PricingDetails pricingDetails) {
		this.pricingDetails = pricingDetails;
	}

}

class ProductSchemeDetails {

	@SerializedName("code")
	@Expose
	private String code;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("spread")
	@Expose
	private String spread;
	@SerializedName("pricing_list")
	@Expose
	private List<PricingList> pricingList = null;
	@SerializedName("start_date")
	@Expose
	private String startDate;
	@SerializedName("end_date")
	@Expose
	private String endDate;
	@SerializedName("product_id")
	@Expose
	private String productId;
	@SerializedName("product_type")
	@Expose
	private String productType;
	@SerializedName("limit_id")
	@Expose
	private String limitId;
	@SerializedName("interest_setup_id")
	@Expose
	private String interestSetupId;
	@SerializedName("interest_calculation_days_in_month")
	@Expose
	private String interestCalculationDaysInMonth;
	@SerializedName("interest_calculation_days_in_year")
	@Expose
	private String interestCalculationDaysInYear;
	@SerializedName("id")
	@Expose
	private String id;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSpread() {
		return spread;
	}

	public void setSpread(String spread) {
		this.spread = spread;
	}

	public List<PricingList> getPricingList() {
		return pricingList;
	}

	public void setPricingList(List<PricingList> pricingList) {
		this.pricingList = pricingList;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getLimitId() {
		return limitId;
	}

	public void setLimitId(String limitId) {
		this.limitId = limitId;
	}

	public String getInterestSetupId() {
		return interestSetupId;
	}

	public void setInterestSetupId(String interestSetupId) {
		this.interestSetupId = interestSetupId;
	}

	public String getInterestCalculationDaysInMonth() {
		return interestCalculationDaysInMonth;
	}

	public void setInterestCalculationDaysInMonth(String interestCalculationDaysInMonth) {
		this.interestCalculationDaysInMonth = interestCalculationDaysInMonth;
	}

	public String getInterestCalculationDaysInYear() {
		return interestCalculationDaysInYear;
	}

	public void setInterestCalculationDaysInYear(String interestCalculationDaysInYear) {
		this.interestCalculationDaysInYear = interestCalculationDaysInYear;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

class Request {

	@SerializedName("product_scheme_details")
	@Expose
	private ProductSchemeDetails productSchemeDetails;

	public ProductSchemeDetails getProductSchemeDetails() {
		return productSchemeDetails;
	}

	public void setProductSchemeDetails(ProductSchemeDetails productSchemeDetails) {
		this.productSchemeDetails = productSchemeDetails;
	}

}
