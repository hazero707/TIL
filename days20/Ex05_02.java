package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author user
 * @date 2023. 8. 9.오후 12:09:31
 * @subject  날짜, 시간 정보를 사용자가 원하는 형식 출력.
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		//SimpleDateFormat 형식화 클래스
		String pattern="yyyy. MM. dd.  a hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		/*
		Date today = new Date();
		String strToday = sdf.format(today);
		//2023. 08. 09.  오후 12:18:38
		System.out.println(strToday);
		*/
		
		Calendar c = Calendar.getInstance();
		//Calendar -> Date 형 병환 
		//long t= c.getTimeInMillis();
		//System.out.println(t);
		
		//[1] Date today = new Date(c.getTimeInMillis());
		//[2]
		Date today = c.getTime();
		String strToday = sdf.format(today);
		System.out.println(strToday);
		
		
	}//main

}//class
