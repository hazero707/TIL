package days21;

import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		//6. 수료일(2023.12.27)까지 남은 기간을 아래와 같이 출력하세요 . 	  
	 //  예)
//		   139일 9시간 54분 2초 767밀초 
		Date eday = new Date(2023-1900,12-1,27);
		Date today = new Date();
		
		days20.Ex03.dispDiffDays(today,eday);
		// 138d-13h-30m-38s-238ms
	}

}
