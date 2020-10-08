package in.novopay.cbs.apis.AccountingMicroservice.pojo.getencryptionkey;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"key_type"
})
public class Request {

@JsonProperty("key_type")
private String key_type;

@JsonProperty("key_type")
public String getKey_type() {
return key_type;
}

@JsonProperty("key_type")
public void setKey_type(String key_type) {
this.key_type = key_type;
}

}