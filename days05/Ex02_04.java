package days05;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 19. - 오전 10:30:24
 * @subject  [복습6번 풀이]
 * @content
 */
public class Ex02_04 {

	public static void main(String[] args) { 
		char one; 
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("> 한 문자 입력 ? ");   
			String inputData = scanner.next();  
			one = inputData.charAt(0);  
			
			if ( Character.isDigit(one) ) {  // [0-9] == \d
				System.out.println("숫자");
			}else if ( Character.isAlphabetic(one) ) { // [a-zA-Z]
				System.out.println("알파벳");
			} else if ( '가' <= one  && one <= '힣' ) {
				System.out.println("한글");
				// 정규표현식   [#$!@]
			 } else if ( one == '#' || one == '$' || one == '!' || one == '@') {  // #$!%@
				System.out.println("특수문자");
			}else {
                System.out.println("X"); 
			} // if
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		

	} // main

} // class








