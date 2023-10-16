package days20;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex13 {

	public static void main(String[] args) {
		
		//불변 
		LocalDate d = LocalDate.now();
		System.out.println(d);//2023-08-09
		
		/*
		d= d.withYear(2020);
		d= d.withMonth(5);
		d =d.withDayOfMonth(11)
		System.out.println(d);//2023-08-09
		*/
		
		d= d.with(ChronoField.YEAR, 2010);
		//
		//
		
		
		//불변
		String a = "xyzz";
		String b = a.replace('x', 't');
		System.out.println(b); //"xyzz"

	}

}
