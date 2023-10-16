package days06;

import java.util.Scanner;

public class Ex05_02 {

	public static void main(String[] args) {
		int n;
		
		try (Scanner scanner =new Scanner(System.in)){
			
			System.out.println("정수(n) 입력?");
			String inputData = scanner.nextLine();
			
			//비밀번호 9~15, 숫자1, 알대1, 알소, 특수문자 1
			
			//boolean flag =false;
			
			//정규표현식(regular expression)
			//0~9 숫자로만 이루어진 문자열 체크하는 정규표현식
			//String regex ="^[0-9]+$";   //+숫자가 한개이상 와야한다
			//Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ ) 역슬러시\ 하나 더 붙여라
			String regex ="^\\d+$"; 
			boolean flag = inputData.matches(regex);
			
					if(flag) {
						n =Integer.parseInt(inputData);
			System.out.println(n);
		} else {
			
			System.out.println("입력잘못!");
		}
			
			/*
			if(!flag) {//flag ==false
				n =Integer.parseInt(inputData);
				System.out.println(n);
			} else {
				
				System.out.println("입력잘못!");
			}//if
			//n = scanner.nextInt();   //정수로 입력받는
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}//catch

	}//main

}//class
