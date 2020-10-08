package in.novopay.cbs.apis.AccountingMicroservice;

import java.util.HashMap;

import in.novopay.cbs.utils.ApiUtils;

public class PayLoadCreateOrUpdateInterestSetup extends ApiUtils  {
	
	
	public String getRequestBody(String serviceName,HashMap<String,String>usrData) {
		

		
		
		String PayLoad="{\\\"headers\\\":{\\\"tenant_code\\\":\\\"bp\\\",\\\"user_id\\\":\\\"1\\\","
				+ "\\\"client_code\\\":\\\"NOVOPAY\\\",\\\"channel_code\\\":\\\"NOVOPAY\\\","
				+ "\\\"end_channel_code\\\":\\\"NOVOPAY\\\",\\\"stan\\\":\\\"{{$timestamp}}\\\","
				+ "\\\"client_ip\\\":\\\"127.0.0.1\\\",\\\"transmission_datetime\\\":\\\"1560894544835\\\","
				+ "\\\"operation_mode\\\":\\\"SELF\\\",\\\"retry_count\\\":\\\"\\\",\\\"run_mode\\\":\\\"REAL\\\","
				+ "\\\"actor_type\\\":\\\"CUSTOMER\\\",\\\"user_handle_type\\\":\\\"MSISDN\\\","
				+ "\\\"user_handle_value\\\":\\\"9816923672\\\",\\\"location\\\":\\\"44.968046;-94.420307\\\","
				+ "\\\"function_code\\\":\\\"DEFAULT\\\",\\\"function_sub_code\\\":\\\"CREATE\\\"},"
				+ "\\\"request\\\":{\\\"interest_setup_details\\\":{\\\"entity_version\\\":\\\"0001\\\","
				+ "\\\"code\\\":\\\""+generateRandomStan()+"\\\",\\\"name\\\":\\\"sdsjdsa\\\",\\\"description\\\":\\\"\\\","
				+ "\\\"product_type\\\":\\\"SAVINGS\\\",\\\"currency\\\":\\\"INR\\\",\\\"base_interest_rate_id\\\":\\\"\\\","
				+ "\\\"interest_calculation_days_in_month\\\":\\\"DIM_001\\\",\\\"interest_calculation_days_in_year\\\":\\\"DIY_001\\\","
				+ "\\\"round_off_type\\\":\\\"RND_OFF_TYP_RUP\\\",\\\"interest_slab_basis\\\":\\\"INT_SLB_TYP_001\\\",\\\"penal_interest_method\\\":\\\"PNL_INT_MET_001\\\",\\\"base_interest_rate_applicable\\\":\\\"false\\\",\\\"interest_slab_structure\\\":\\\"INT_SLB_STR_ABS\\\",\\\"rate_slab_list\\\":[{\\\"start_date\\\":\\\"1560902400000\\\",\\\"amount_slab_list\\\":[{\\\"from_amount\\\":\\\"\\\",\\\"to_amount\\\":\\\"\\\",\\\"slab_list\\\":[{\\\"term_end\\\":\\\"1\\\",\\\"term_unit\\\":\\\"TRM_UNT_002\\\",\\\"effective_rate\\\":\\\"1\\\",\\\"penal_rate\\\":\\\"2\\\"}]}]}]}}}";

	
		return PayLoad.toString();
	
	}

}
