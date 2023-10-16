package days03;

import java.util.Scanner;

/**
 * @author 정하영
 * @date 2023. 7. 17. - 오후 3:44:39
 * @subjct (시험) 두 문자열을 비교
 * @contents
 */
public class Ex09 {

	public static void main(String[] args) {
		
		String name1 ="홍길동", name2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">비교할 이름을 입력? ");
	  //String name2;
		name2 = scanner.next();
		
		//디버깅
		System.out.printf("[%s]\n", name2);
		
		//System.out.println( name1  == name2);
		
		//(암기) 두 문자열을 비교할때 equals()사용한다.
		System.out.println( name1.equals(name2));
		System.out.println( name1.equals(name2));
		//대소문자 구분하지 않고 문자열 비교
		System.out.println("keNik".equalsIgnoreCase("KENIK"));

	}

}
