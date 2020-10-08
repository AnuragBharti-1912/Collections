import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class date {
	public static void main(String[] args) throws FileNotFoundException {
		 Calendar calendar = Calendar.getInstance();
		 calendar.add(Calendar.DATE, 356);
		 calendar.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
	long stamp=	calendar.getTimeInMillis();
	System.out.println(stamp);
	
		 
	
	}

}
