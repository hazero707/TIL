package days14;

import java.sql.Date;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Random rnd = new Random(1000L) ;  //
		
		Scanner scanner = new Scanner(System.in);
		
		// 현재 시스템의 날짜 + 시간정보
		//2023, 8 .1 오전 10:48:15
		int year =2023;
		int month =10;
		int day =25;
		Date d = new Date(year-1900, month-1, day);
		System.out.println(d.toString());
		System.out.println(d.toLocaleString());

		System.out.println(d.getDate()); //3 요일
		}

}
