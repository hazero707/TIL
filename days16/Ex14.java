package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		int a =0, b=0;
		//double c 선언하거나 try 안에 넣거나 
		
		
		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
		//JVM의 예외처리기 에 의해서
		//InputMismatchException 예외 객체 생성 -> 개발자 파악 처리
		try { //예외가 발생할 수 있을 것 같은 코딩 
			System.out.print("> a,s 두 정 수 입력 ? ");
			 a = scanner.nextInt();
			 b = scanner.nextInt();
			 //
			 //
			 //
			 double c =a/b;
			 System.out.printf("%d /%d = %.2f\n", a,b,c);
			 System.out.println("=정상종료=");
			 
			 //다중 catch문 
			 //(주의사항) 부모 예외 클래스를 밑에 코딩한다. 
			 //jdk 1.7 멀티 catch문 
		} catch (InputMismatchException e) {
			System.out.println(">[알림] 정수만 입력하세요");
			//System.exit(-1); //프로그램 종료
		} catch (ArithmeticException e) {
			System.out.println("> [알림] 0으로 나눌 수 없습니다.");
			//System.exit(-1); // 프로그램 종료 
		} catch (Exception e) { //매개변수 다형성
			e.printStackTrace();
			//System.exit(-1);
		} finally {
			// 예외 발생유무에 상관없이 처리할 구문 
			System.exit(-1);
		}
		//catch 문을 여러개 쓸 때나 부모의 개체에 해당하는 것을 맨 밑에다가 쓴다.
		
		
		 
		
		
		/*
		String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();
	     */
	}

}
