package days21;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex06 {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now();
		// getXXX()
		// get(  )
		System.out.println( t.getHour() );
		System.out.println( t.getMinute() );
		System.out.println( t.getSecond() );
		System.out.println( t.getNano() );
		// 밀리세컨드  
		System.out.println( t.get( ChronoField.MILLI_OF_SECOND ) );
		
		// 30분 후에 점심~
		// t = t.plusMinutes(30);
		// t = t.minusMinutes(10);
		
		// 1시간 30분 후에 점심~
		// t = t.plusMinutes(60+30);
		t = t.plusHours(1);
		t = t.plusMinutes(30);
		
		System.out.println( t );
		
	}

}
