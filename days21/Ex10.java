package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex10 {

	public static void main(String[] args) {

		// 개강일 + 100 일		
		// 수료일  ~ 오늘날짜 : ~ 차
		
		// 날짜 - 날짜 = Period
		// 시간 - 시간 = Duration
		
		// - between()    == until()
		// static메서드    인스턴스메서드
		
		// - of(), with() 변경
		// - plus(), minus() 등등 메서드 
		
		// 개강일
		LocalDate s = LocalDate.of(2023, 7, 13);
		// 오늘날짜
		LocalDate t = LocalDate.now();
		t = t.plusDays(1);
		
		// 날짜 차               s <=   
		Period p = Period.between(s, t);
		int year =  p.getYears();
		System.out.println( year );
		
		long month = p.get( ChronoUnit.MONTHS );
		System.out.println( month );
		
		long day = p.getDays();
		System.out.println(day);
		
		// 시간 차 Duration
		LocalTime st = LocalTime.of(9, 0, 0);
		LocalTime tt = LocalTime.now();
		
		Duration d = Duration.between(st, tt);
		// 시간차
		long ss = d.getSeconds();
//		System.out.println(ss );   // 13287
//		System.out.println(ss/60 ); // 분
//		System.out.println(ss/(60*60) ); // 시간
		
		// [Unsupported]TemporalTypeException
		// long h = d.get( ChronoUnit.HOURS );
		// System.out.println(h);
		
		
		
	}

}
