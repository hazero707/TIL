package days05;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 19. - 오전 10:30:24
 * @subject  [복습6번 풀이]
 * @content
 */
public class Ex02_05 {

	public static void main(String[] args) { 
		char one; 
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("> 한 문자 입력 ? ");   
			String inputData = scanner.next();  
			
			String regex = "[#@$!]"; // [^aeiouAEIOU]
			if( inputData.matches(regex) ) {
				System.out.println("특수문자");
			} // if
			
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		

	} // main

} // class








