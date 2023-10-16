package days22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
	 //[2]
	LocalDateTime dt= LocalDateTime.now();
	//2023-08-11T10:07:39.733732800

	System.out.println(dt);
	//
	//
	String pattern = "yyyy/MM/dd Edydlf hh:mm:ss.SSS";
	DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
	String output = df.format(dt); // 매개변수 다형성 
	System.out.println(output);
		
	
	    
	      }
		}
	


