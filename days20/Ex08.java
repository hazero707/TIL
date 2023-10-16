package days20;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author user
 * @date 2023. 8. 9.오후 2:33:01
 * @subject 형식화 클래스
 *  			format() 숫자-> 원하는 형식의 문자열 
 *  			parse() 문자열 -> 숫자
 *  
 *  		  simpleDateFormat
 *  			format() 날짜 -> 원하는 형식의 문자열 
 *    	 		parse()  문자열 -> 날짜 
 *    
 * @content
 */
public class Ex08 {
	

	public static void main(String[] args) {
		// 23년 8월 9일 "수요일"
		//날짜로(Date, Calendar) 변환시키는 코딩
		//String strDate =  "23년 8월 9일 \"수요일\"";
         String strDate = "23년 8월 9일 (수요일)";
		
		// 요일  패턴 기호 ? E
		String pattern = "yy년 MM월 dd일 (E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
		   Date d =	sdf.parse(strDate);
		   System.out.println( d.toLocaleString() );
		   // Date -> Calendar 형변환
		   Calendar c = Calendar.getInstance();
		   c.setTime(d);
		   // S 밀리세컨드
		   System.out.println( Ex05.getPatternDate(c, pattern) );
		   
		} catch (ParseException e) { 
			e.printStackTrace();
		}

	}

}
