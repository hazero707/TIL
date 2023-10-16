package days10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex02 {
	  public static void main(String[] args) {
	       getTotalDays(2023,7,1);
	       System.out.println( getTotalDays(2023,7,1));

	   }


	private static int getDayOfWeek(int year, int month, int day) {
	  //필기다시
		
		// 날짜, 시간 기능(일,함수,메서드) 구현된 클래스
		//java.util.Date, Calendar
		//jdk1.8 LocalDate, LocalTime, LocalDateTime
		LocalDate d = LocalDate.of(year, month, day);
	   DayOfWeek w= d.getDayOfWeek();  //요일을 얻어오겠다.
		//1(월) 2(화) 3(수)~~6(토)   7(일)
	   return w.getValue()%7;
				}
	private static int getTotalDays (int year, int month, int day) {
		LocalDate startDate = LocalDate.of(1, 1, 1);
		LocalDate endDate = LocalDate.of(year, month, month);
		
		int totalDays = (int) startDate.until(endDate, ChronoUnit.DAYS)+1;
		
		//startDate.until(endDate, ChronoUnit.months);
		//startDate.until(endDate, ChronoUnit.year);
		return totalDays;
	}
	
	private static int getLastDay(int year, int month) {
		LocalDate d = LocalDate.of(year,month,1);
		
		LocalDate lastDate = d.withDayOfMonth(d.lengthOfMonth());
		
		return lastDate.getDayOfMonth();// a마지막날짜 객체로 일만 얻어오는것
	}

}
