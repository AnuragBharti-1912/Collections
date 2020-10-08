package in.novopay.cbs.apis.AccountingMicroservice;

import java.util.HashMap;

import org.json.JSONObject;

import in.novopay.cbs.apis.AccountingMicroservice.pojo.getencryptionkey.GetEncryptionKeyPOJO;
import in.novopay.cbs.apis.AccountingMicroservice.pojo.getencryptionkey.Request;
import in.novopay.cbs.utils.ApiUtils;

public class GetEncryptionKey extends ApiUtils {

	public String getRequestBody(HashMap<String, String> usrData) {

		GetEncryptionKeyPOJO getEncryptionKeyPOJO = new GetEncryptionKeyPOJO();
		Request request = new Request();
		request.setKey_type(usrData.get("key_type"));
		getEncryptionKeyPOJO.setHeaders(getRequestBodyHeaders(usrData));
		getEncryptionKeyPOJO.setRequest(request);
		JSONObject jsonObj = new JSONObject(getEncryptionKeyPOJO);
		return jsonObj.toString();
	}
}