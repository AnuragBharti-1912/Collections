package in.novopay.cbs.apis.AccountingMicroservice.pojo.login;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import in.novopay.cbs.apis.Headers;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"headers",
	"request"
})
public class LoginPOJO {

	@JsonProperty("headers")
	private Headers headers;
	@JsonProperty("request")
	private Request request;

	@JsonProperty("headers")
	public Headers getHeaders() {
		return headers;
	}

	@JsonProperty("headers")
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	@JsonProperty("request")
	public Request getRequest() {
		return request;
	}

	@JsonProperty("request")
	public void setRequest(Request request) {
		this.request = request;
	}

}