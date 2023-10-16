package days21;

import java.time.LocalDate;

public class Ex05 {

	public static void main(String[] args) {
		// plusxxx(), plus() ,minusXXX(),minus()
		
		//날짜와 시간 비교 : isAfter(), isBefore() , isEquals()
		
		//오늘 생일이니?
		//199.8.10
		//2023.8.10
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(1998, 8, 10);
		
		birth = birth.withYear(today.getYear());
		System.out.println(birth);
		
		System.out.println(today.isBefore(birth));
		System.out.println(today.isEqual(birth));
		System.out.println(today.isAfter(birth));
		
		//today.compareTo(birth) 양수 [0]음수 
		System.out.println(today.compareTo(birth));
//		2023-08-10
//		false
//		true
//		false
	}

}
