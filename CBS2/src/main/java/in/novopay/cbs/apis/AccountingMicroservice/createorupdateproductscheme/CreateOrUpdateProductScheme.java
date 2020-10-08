package in.novopay.cbs.apis.AccountingMicroservice.createorupdateproductscheme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;

import in.novopay.cbs.utils.ApiUtils;
import in.novopay.cbs.utils.DBUtils;
import in.novopay.cbs.utils.JavaUtils;

public class CreateOrUpdateProductScheme extends ApiUtils {

	public String getRequestBody(String serviceName, HashMap<String, String> usrData) {

		DBUtils dbUtils = new DBUtils();
		CreateOrUpdateProductSchemePojo createOrUpdateProductSchemePojo = new CreateOrUpdateProductSchemePojo();
		PricingDetails pricingDetails = new PricingDetails();
		List<PricingList> pricingList = new ArrayList<PricingList>();
		PricingList pricing = new PricingList();
		ProductSchemeDetails productSchemeDetails = new ProductSchemeDetails();
		Request request = new Request();

		// adding product scheme details

		if (usrData.get("code").equalsIgnoreCase("dynamic")
				&& usrData.get("function_sub_code").equalsIgnoreCase("CREATE")) {
			String code = generateRandomStan();

			productSchemeDetails.setCode(code);
			// javaUtils.addTestDataIni("productSchemeCode",code);

		} else {
			productSchemeDetails.setCode(usrData.get("code"));
		}

		if ((usrData.get("function_sub_code").equalsIgnoreCase("UPDATE"))) {
			System.out.println(getvalueFromTestDataIni("productSchemeCode"));
			// System.out.println(usrData.get("tableName"));

			productSchemeDetails.setId(dbUtils.getID(serviceName, usrData, getvalueFromTestDataIni("productSchemeCode"),
					usrData.get("tableName")));

			productSchemeDetails.setCode(getvalueFromTestDataIni("productSchemeCode"));
		}

		productSchemeDetails.setDescription(usrData.get("description"));

		productSchemeDetails.setStartDate(usrData.get("startDate"));
		productSchemeDetails.setEndDate(usrData.get("endDate"));

		productSchemeDetails.setLimitId(usrData.get("limitId"));
		productSchemeDetails.setName(usrData.get("name"));

		productSchemeDetails.setProductId(usrData.get("productId"));
		productSchemeDetails.setProductType(usrData.get("productType"));
		productSchemeDetails.setInterestCalculationDaysInMonth(usrData.get("interestCalculationDaysInMonth"));
		productSchemeDetails.setInterestCalculationDaysInYear(usrData.get("interestCalculationDaysInYear"));
		productSchemeDetails.setInterestSetupId(usrData.get("interestSetupId"));
		productSchemeDetails.setPricingList(pricingList);
		productSchemeDetails.setSpread(usrData.get("spread"));

		// adding first pricing details

		//pricing.setPricingDetails(pricingDetails);

		pricingDetails.setPriceMasterCode(usrData.get("priceMasterCode"));
		pricingDetails.setPriceSetupId(usrData.get("priceSetupId"));
		pricingDetails.setPricingType(usrData.get("pricingType"));
		pricingDetails.setTransactionAccountingRuleId(usrData.get("transactionAccountingRuleId"));
		pricingDetails.setTransactionCatalogueId(usrData.get("transactionCatalogueId"));
		pricingDetails.setPricingTypeValue(usrData.get("pricingTypeValue"));
		pricingDetails.setPriceSetupCode(usrData.get("priceSetupCode"));
		pricingDetails.setPriceSetupName(usrData.get("priceSetupName"));
		pricingDetails.setTransactionCatalogueSubType(usrData.get("transactionCatalogueSubType"));
		pricingDetails.setId(usrData.get("pricing_id"));
		pricingDetails.setTransactionCatalogueType(usrData.get("transactionCatalogueType"));
		pricingDetails.setPriceMasterName(usrData.get("priceMasterName"));
		pricing.setPricingDetails(pricingDetails);
		pricingList.add(pricing);

		productSchemeDetails.setPricingList(pricingList);

		request.setProductSchemeDetails(productSchemeDetails);

		createOrUpdateProductSchemePojo.setHeaders(getRequestBodyHeaders(usrData));
		createOrUpdateProductSchemePojo.setRequest(request);

		Gson gson = new Gson();
		String userJson = gson.toJson(createOrUpdateProductSchemePojo);
		return userJson.toString();

	}

}
