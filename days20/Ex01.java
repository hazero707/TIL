package days20;

import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		int year= 2025;
		//1d월 : 31일
		for (int i = 0; i < 12; i++) {
			System.out.printf("%d월 : %d일\n",i,getLastDay(year,i));
			
		}
	}
	public static int getLastDay(int year, int month) {
		Date d = new Date(year - 1900, month , 1);
		d.setDate( d.getDate() -1 );
		return d.getDate();
	}




	}


/*
Date a = new Date(2023-1900, 8-1, 5);
Date b = new Date(2023-1900, 8-1, 6);
System.out.println( a.after(b) );
System.out.println( a.equals(b) );
System.out.println( a.before(b) );

String pattern ="yyyy-MM-dd";
SimpleDateFormat sdf = new SimpleDateFormat(pattern);
Date birth = sdf.parse("2023-2-9"); 

System.out.println(birth.toLocaleString());

Date now = new Date();
System.out.println(now.getTime());
now.setHours(0);
now.setMinutes(0);
now.setSeconds(0);
long ms = now.getTime()/1000*1000;
System.out.println(ms);
now = new Date(ms);
System.out.println(now.getTime());
System.out.println(now.toLocaleString());
*/		
