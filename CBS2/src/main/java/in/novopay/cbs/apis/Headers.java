package in.novopay.cbs.apis;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "tenant_code", "client_code", "channel_code", "end_channel_code", "stan", "client_ip",
		"transmission_datetime", "operation_mode", "run_mode", "actor_type", "user_handle_type", "user_handle_value",
		"location", "function_code", "function_sub_code", "user_id","locale" })
public class Headers {

	@JsonProperty("tenant_code")
	private String tenant_code;
	@JsonProperty("client_code")
	private String client_code;
	@JsonProperty("channel_code")
	private String channel_code;
	@JsonProperty("end_channel_code")
	private String end_channel_code;
	@JsonProperty("stan")
	private String stan;
	@JsonProperty("client_ip")
	private String client_ip;
	@JsonProperty("locale")
	private String locale;
	@JsonProperty("transmission_datetime")
	private String transmission_datetime;
	@JsonProperty("operation_mode")
	private String operation_mode;
	@JsonProperty("run_mode")
	private String run_mode;
	@JsonProperty("actor_type")
	private String actor_type;
	@JsonProperty("user_handle_type")
	private String user_handle_type;
	@JsonProperty("user_handle_value")
	private String user_handle_value;
	@JsonProperty("location")
	private String location;
	@JsonProperty("function_code")
	private String function_code;
	@JsonProperty("function_sub_code")
	private String function_sub_code;
	@JsonProperty("user_id")
	private String user_id;
	

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@JsonProperty("tenant_code")
	public String getTenant_code() {
		return tenant_code;
	}

	@JsonProperty("tenant_code")
	public void setTenant_code(String tenant_code) {
		this.tenant_code = tenant_code;
	}

	@JsonProperty("client_code")
	public String getClient_code() {
		return client_code;
	}

	@JsonProperty("client_code")
	public void setClient_code(String client_code) {
		this.client_code = client_code;
	}

	@JsonProperty("channel_code")
	public String getChannel_code() {
		return channel_code;
	}

	@JsonProperty("channel_code")
	public void setChannel_code(String channel_code) {
		this.channel_code = channel_code;
	}

	@JsonProperty("end_channel_code")
	public String getEnd_channel_code() {
		return end_channel_code;
	}

	@JsonProperty("end_channel_code")
	public void setEnd_channel_code(String end_channel_code) {
		this.end_channel_code = end_channel_code;
	}

	@JsonProperty("stan")
	public String getStan() {
		return stan;
	}

	@JsonProperty("stan")
	public void setStan(String stan) {
		this.stan = stan;
	}

	@JsonProperty("client_ip")
	public String getClient_ip() {
		return client_ip;
	}

	@JsonProperty("client_ip")
	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}

	@JsonProperty("transmission_datetime")
	public String getTransmission_datetime() {
		return transmission_datetime;
	}

	@JsonProperty("transmission_datetime")
	public void setTransmission_datetime(String transmission_datetime) {
		this.transmission_datetime = transmission_datetime;
	}

	@JsonProperty("operation_mode")
	public String getOperation_mode() {
		return operation_mode;
	}

	@JsonProperty("operation_mode")
	public void setOperation_mode(String operation_mode) {
		this.operation_mode = operation_mode;
	}

	@JsonProperty("run_mode")
	public String getRun_mode() {
		return run_mode;
	}

	@JsonProperty("run_mode")
	public void setRun_mode(String run_mode) {
		this.run_mode = run_mode;
	}
	
	@JsonProperty("locale")
 public String getLocale() {
			return locale;
		}
	@JsonProperty("locale")
  public void setLocale(String locale) {
			this.locale = locale;
		}


	@JsonProperty("actor_type")
	public String getActor_type() {
		return actor_type;
	}

	@JsonProperty("actor_type")
	public void setActor_type(String actor_type) {
		this.actor_type = actor_type;
	}

	@JsonProperty("user_handle_type")
	public String getUser_handle_type() {
		return user_handle_type;
	}

	@JsonProperty("user_handle_type")
	public void setUser_handle_type(String user_handle_type) {
		this.user_handle_type = user_handle_type;
	}

	@JsonProperty("user_handle_value")
	public String getUser_handle_value() {
		return user_handle_value;
	}

	@JsonProperty("user_handle_value")
	public void setUser_handle_value(String user_handle_value) {
		this.user_handle_value = user_handle_value;
	}

	@JsonProperty("location")
	public String getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	@JsonProperty("function_code")
	public String getFunction_code() {
		return function_code;
	}

	@JsonProperty("function_code")
	public void setFunction_code(String function_code) {
		this.function_code = function_code;
	}

	@JsonProperty("function_sub_code")
	public String getFunction_sub_code() {
		return function_sub_code;
	}

	@JsonProperty("function_sub_code")
	public void setFunction_sub_code(String function_sub_code) {
		this.function_sub_code = function_sub_code;
	}

}
