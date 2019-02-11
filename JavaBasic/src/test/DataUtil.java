package test;

import java.util.Calendar;

public class DataUtil {
	
	public static String getCurrentData(){
		Calendar cal = Calendar.getInstance();
		StringBuffer sb = new StringBuffer();
		
		sb.append(cal.get(Calendar.YEAR));
		sb.append(String.format("%2d", cal.get(Calendar.MONTH)+1));
		sb.append(String.format("%2d", cal.get(Calendar.DATE)));
		
		// 20181120
		return sb.toString();
	}

}
