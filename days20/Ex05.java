package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex05 {

	public static void main(String[] args) {
		//Date x
		//Calendar o
		//1) 2015  5  1 무슨 요일
		Calendar c = new GregorianCalendar(2015, 5-1, 1);
		System.out.println( c.get(Calendar.DAY_OF_WEEK) );
		
		//2)2015     5  1  몇일까지?
	   System.out.println(c.getActualMaximum(Calendar.DATE));  // 그달 가장 큰 날짜 
		
		
		
		//[1]
		/*Calendar c = Calendar.getInstance();
		//System.out.println(c.toString());
		// "2015. 5. 1 오전 9:11:12"
		String pattern="yyyy. MM. dd.  a hh:mm:ss";
		//System.out.println(getPatternDate(new Date(),pattern));
		System.out.println(getPatternDate(c,pattern));
		
		c.set(Calendar.YEAR,2015);
		c.set(Calendar.MONTH, 5-1);
		c.set(Calendar.DATE, 1);
		
		
		c.set(2015,5-1,1);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		*/

	}
	public static String getPatternDate(Object obj, String pattern) { 
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		if (obj instanceof Date) {
			Date d = (Date)obj;
			return sdf.format(d);
		}else if (obj instanceof Calendar) {
			Calendar c = (Calendar)obj;
			Date d = c.getTime();
			return sdf.format(d);
		}  
		return null;
	}

	//MAIN
	 
	public static String getPatternDate(Date d, String pattern) {
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		return sdf.format(d);
		
	    }
    public static String getPatternDate(Calendar c, String pattern) {
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = c.getTime();
		return sdf.format(d);
       }
  
}
