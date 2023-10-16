package days22;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01_02 {

	public static void main(String[] args) {
		//[2-2]
		String s = "2023-08-11(금)";
		String pattern = "yyyy-mm-11(금)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);

		LocalDate d = LocalDate.parse(s);

	}

}
