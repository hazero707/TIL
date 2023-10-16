package days19;

import java.util.Date;

public class Ex13_03 {

	public static void main(String[] args) {
		
		
		
		Date today = new Date();
		//2023. 8. 8. 오후 5:26:51
		System.out.println(today.toLocaleString());
		System.out.println(today.getTime());
		
		Date d = new Date(2023-1900,8-1,8);
		//2023. 8. 8. 오전 12:00:00
		System.out.println(d.toLocaleString());
		
		System.out.println(today.equals(d));
		System.out.println(d.getTime());
		
		System.out.println(today.equals(d));  //false
		
		
		
		
		//"2023. 8. 8.". equals("2023.8.8.")
		//"2023. 8. 8.".compareTo("2023.8.8.")
		
		

	}

}
