package in.novopay.cbs.utils;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
 
 public class Log  {
 
// Initialize Log4j logs
 
	 private static Logger Log = Logger.getLogger(Log.class.getName());//
	 
 
 // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite
 
 public static void startTestCase(String sTestCaseName){	
 
	Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
 

	}
 
	//This is to print log for the ending of the test case
 
 public static void endTestCase(String sTestCaseName){
 
	Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
 
	Log.info("X");
 
	}
 
	// Need to create these methods, so that they can be called  
 
 public static void info(String message) {
 
		Log.info(message);
 
		}
 
 public static void warn(String message) {
 
    Log.warn(message);
 
	}
 
 public static void error(String message) {
 
    Log.error(message);
 
	}
 
 public static void fatal(String message) {
 
    Log.fatal(message);
 
	}
 
 public static void debug(String message) {
 
    Log.debug(message);
 
	}

public static void info(String string, Object objName) {
	// TODO Auto-generated method stub
	Log.info(string + objName);
	
}
 
}