package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex07 {

	public static void main(String[] args) {
		
		//LocalDate
		//LocalTime
		//날짜+시간
		/*
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println(dt);
		
		//truncate 절삭(내림) //내가 원하는 위치에서 절삭할 수 있음 
		dt= dt.truncatedTo(ChronoUnit.HOURS);
		System.out.println(dt);
		*/
		
		/*
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		
		LocalDateTime dt = LocalDateTime.of(d, t); // 시간과 날짜 정보를 가지고있는 d,t를 만들수 있음
		
		LocalDateTime dt2 = d.atTime(t);
		
		LocalDateTime dt3 = t.atDate(d);
		*/
		
		LocalDateTime dt = LocalDateTime.now();
		//LocalDateTime -> LocalDate 변환
		LocalDate d = dt.toLocalDate();
		//LocalDateTime -> LocalTime 변환
		LocalTime t = dt.toLocalTime();
		
		//

	}

}
