package days21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) throws ParseException {
		//[2] String -> sdf.parse()-> Date -> Clendar -> Date -> sdf.format()-> String
  String source = " 2023/08/10 (목) 12:23:01 ";
  
  String pattern ="yyyy/MM/dd (E) hh :mm :ss";  
  SimpleDateFormat sdf = new SimpleDateFormat(pattern);
  Date d = sdf.parse(source);
  
   System.out.println(d.toLocaleString());
 Calendar c = Calendar.getInstance();
 c.setTime(d);
 
 d=c.getTime();
 
 pattern="yyyy년 M월 d일 (E)";
 sdf  = new SimpleDateFormat(pattern);
 String strD = sdf.format(d);
 System.out.println(strD);


  
		  

	}

}
