package days04;

import java.util.Scanner;

/**
 * @author 정하영
 * @date 2023. 7. 18. - 오전 11:03:11
 * @subjct
 * @contents
 */
public class Ex03 {

	public static void main(String[] args) {
		// 제어문
		//1.정의 : 프로그램의 실행 순서를 제어하는 문
		//               건너띄기, 반복처리 등등
		/*
		 * 2.종류
		 * 1)조건문         if , ifelse, ifelseif...else
		 * 2)분기문         switch
		 * 3)반복분         for, foreach
		 * 4)조건반복문  do~while, while
		 * 5)기타            break, continue
		 */
			// condition(조건식)   참/거짓 판가름할 수 있는 식 
		/*	
		if (condition) {
				//조건식이 참일 때만 { } 수행
			} //if
			*/
		
		//정수를 입력받아서 n 변수에 저장을 하고 출력.
		//***(입력값에 대한 유효성 검사 코딩추가)***
		// 짝수 
		int n;
		
		try (Scanner scanner = new Scanner(System.in);)  {
			System.out.print("> 정수입력 ?");
			n= scanner.nextInt();
	//짝수일 경우에는 "짝수"출력		
			if ( n%2==0) {
				System.out.printf("n=%d 짝수(even number)", n);
			}
				if ( n%2!=0) {
					System.out.printf("n=%d 홀수(odd number)", n);
					
			} //if   //if문은 참일때만 수행 
			System.out.printf("n=%d", n);
		
			//scanner.close(); //다쓰면 스캐너 닫기 //  try는 자동으로 close() 짐
		} catch(Exception e) {
		} //catch
		
		
	} //main
 
}//class
