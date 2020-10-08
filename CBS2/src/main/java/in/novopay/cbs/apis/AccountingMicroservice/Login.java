package in.novopay.cbs.apis.AccountingMicroservice;

import java.util.HashMap;

import org.json.JSONObject;

import in.novopay.cbs.apis.AccountingMicroservice.pojo.login.LoginPOJO;
import in.novopay.cbs.apis.AccountingMicroservice.pojo.login.Request;
import in.novopay.cbs.utils.ApiUtils;

import in.novopay.cbs.utils.DBUtils;

public class Login extends ApiUtils {

	public String getRequestBody(HashMap<String, String> usrData, String publickey) {

		DBUtils db = new DBUtils();
		LoginPOJO loginpojo = new LoginPOJO();
		Request request = new Request();
		request.setAuth_type(usrData.get("auth_type"));
		request.setHandle_type(usrData.get("handle_type"));
		request.setHandle_value(usrData.get("handle_value"));

		publickey="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs+CLAhBZbP0MWBY5ka6EKCId2FAIV2ygFkNPhGfxXuqGNdQYRDwbSSYRRYwozRBnN4ooJ0XeGMofD9VLQWsCNvGmJxE2oC4wgDaYDWwjKfehFvwIs6RenJJa7RRcYwFsWAIHzvLHCxGugxAZbjLhMvP+1E0DAiSGN/L/UTdCkxfr4XzlTMi0kcirHLgiAdIIy7F7zRjtw6pcVkzRbwHOhT6rus4MpThYhMIoY6CYpwsF+ryqlqExl1bp0xydtf2CGFjKvlIxxU0yTMx1/ce3ewmVpFKkNgfQOPOe18RGB45W6GjtCZAO5rSslg465T1bahrEABbEfSxBQDgARfLsVQIDAQAB";


		/*if (usrData.get("mpin").equalsIgnoreCase("dynamic")) {
			
			 * request.setAuth_value( getPasswordWithOutSHA(publickey,
			 * db.getAuthValue(usrData.get("handle_value"), usrData)));
			 

			request.setAuth_value("RWpPaW8zbHVnMGJ2K0h6bHMyRzdQZ1p5U04rZFZ3U2dJVmMyZ2szR3ptME44Rm9HcHRSVk4zMlYxaVNKd0xHaUQ4RmI0ZlFNMC9TUVM3cW9FcHkxWnJCUTRqc3NVVHZBWURPUTdYMy9tMmhqKzA3dC9ZL1VRTjZmSnVraWlIVWovcVFYSzdiYjJFaTBDTzR3b1VYcjNQRmRqdUpleUl5eUdOWnRJdXdFTVBPVXR6emNmWkNKbHQvbFNNVTVPd0tjdkpwS0gxUUdCYSs3cTBDeTY4dmw0SHNQZUFKcHhRdnYrSUZlZllpVFFmS283dmRId2M3TjAzOVlhV0NpL3pzUVpreDV5Wk9TQVlEemdhcTJqTTJRT2w3NGNwaVIxZEErb0lJNURzZXQ4bS91MXBTRmc3aFphNjY1NUczZDZSZDJrc0d2V3Rsbk1GNGlCUE0zTHBVSU9nPT0=");

		} else {*/
			request.setAuth_value(getPasswordWithSHA(publickey, usrData.get("auth_value")));
			//request.setRecaptcha_key("03AGdBq26nZOqKF0fvu5rh3UmDNyz7vc2NMc05mtjlD7u0RI3RyzeuEMcTst5EMWSOGlOeFzzbicEACV14cmCHeBspllQAGg98zmX7BbHC7Po4y4c_7mmTn2Imt-24CXqKEYyw341snmMiyq1i5txZAkbFBNQ9muSVz7onSXbt42KwPL5tBUKD1HxEp4OK6pLt2vDAWICT_0MmUzSGqCsEb_vDiQ3ZveR6xmwCVxtVQS9Ez1awQaP230sp03ySgNF4zOwp5fay9Qyxa--TPLv0e92fcy--kPxpZA4fkQf5Ghti4WR24mn1Fg3lst9VGqSEta_fuqx0xv0r2TN9XUnLWzRD1md53dHVEehGb1Pa0ONaXiJwvO_W3EncXXbA6TMJCRwXmRqAnavs4s_EtEPQzyKQQd66B1wr6vS9dIhfiS35vn5zkvW4z0JW50eRgDGF_Erva-2ObJ3W0G96AEZvKe1800b18C-PFA");
		//}
		loginpojo.setHeaders(getRequestBodyHeaders(usrData));
		loginpojo.setRequest(request);

		JSONObject jsonObj = new JSONObject(loginpojo);
		return jsonObj.toString();

	}

}
