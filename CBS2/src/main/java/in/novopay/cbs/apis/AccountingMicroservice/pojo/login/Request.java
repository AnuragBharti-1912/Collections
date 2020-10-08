package in.novopay.cbs.apis.AccountingMicroservice.pojo.login;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"handle_type",
	"handle_value",
	"auth_type",
	"auth_value"
	//"recaptcha_key"
})
public class Request {

	@JsonProperty("handle_type")
	private String handle_type;
	@JsonProperty("handle_value")
	private String handle_value;
	@JsonProperty("auth_type")
	private String auth_type;
	@JsonProperty("auth_value")
	private String auth_value;

	/*
	 * @JsonProperty("recaptcha_key") private String recaptcha_key;
	 */

	@JsonProperty("handle_type")
	public String getHandle_type() {
		return handle_type;
	}

	@JsonProperty("handle_type")
	public void setHandle_type(String handle_type) {
		this.handle_type = handle_type;
	}

	@JsonProperty("handle_value")
	public String getHandle_value() {
		return handle_value;
	}

	@JsonProperty("handle_value")
	public void setHandle_value(String handle_value) {
		this.handle_value = handle_value;
	}

	@JsonProperty("auth_type")
	public String getAuth_type() {
		return auth_type;
	}

	@JsonProperty("auth_type")
	public void setAuth_type(String auth_type) {
		this.auth_type = auth_type;
	}
	@JsonProperty("auth_value")
	public String getAuth_value() {
		return auth_value;
	}
	@JsonProperty("auth_value")
	public void setAuth_value(String auth_value) {
		this.auth_value=auth_value;
	}


	/*
	 * @JsonProperty("recaptcha_key") public String getRecaptcha_key() { return
	 * recaptcha_key; }
	 * 
	 * @JsonProperty("recaptcha_key") public void setRecaptcha_key(String
	 * recaptcha_key) { this.recaptcha_key = recaptcha_key; }
	 */


}