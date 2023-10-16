package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex04 {

	public static void main(String[] args) {
		// jdk1.1 Calendar 추상클래스 - 날짜,시간
				// Calendar c = new Caleandar(); X
				// Calendar c = new GregorianCalendar();
				//          ㄴ BuddhistCalendar 태국 
				Calendar c = Calendar.getInstance(); 
				// c.add( int field 날짜,월,년도, 시간,분,초 , -2);
				// c.clear(시간,분,초); == d2.setHours(0);
				
				// 년 
				System.out.println( c.get(1) ); // 2023 년도
				System.out.println( c.get(Calendar.YEAR) ); // 2023 년도
				// 월
				System.out.println( c.get(2) + 1 ); // 월
				System.out.println( c.get(Calendar.MONTH)+1  ); // 월
				// 일
				System.out.println( c.get(Calendar.DATE) );
				System.out.println( c.get(Calendar.DAY_OF_MONTH) );
				
				// 시간
				System.out.println(   c.get( Calendar.HOUR  )  );  // 12(0~11)
				System.out.println(   c.get( Calendar.HOUR_OF_DAY  )  ); // 24 (0~23)
				// 분
				System.out.println(   c.get( Calendar.MINUTE  )  ); 
				// 초
				System.out.println(   c.get( Calendar.SECOND  )  ); 
				// 밀리세켠드
				System.out.println(   c.get( Calendar.MILLISECOND  )  ); 
				// 요일
				// Date      0일 1월 ~ 6토		
				// Calendar  1일 2월 3화 ~ 7토
				System.out.println(   c.get( Calendar.DAY_OF_WEEK  )  );
				
				System.out.println(   c.get( Calendar.AM )  );   
				System.out.println(   c.get( Calendar.AM_PM )  );   
				
				System.out.println(   c.get( Calendar.DAY_OF_YEAR  )  ); // 221
				
				// 해당 월의 몇 번째 주
				System.out.println(   c.get( Calendar.WEEK_OF_MONTH )  );
				// 해당 년도의 몇 번째 주
				System.out.println(   c.get( Calendar.WEEK_OF_YEAR )  );
				
	}

}
