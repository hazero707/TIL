package days04;

import java.util.Scanner;

/**
 * @author 정하영
 * @date 2023. 7. 18. - 오전 11:03:11
 * @subjct
 * @contents
 */
public class Ex03_02 {

	public static void main(String[] args) {

		int n;
		
		try (Scanner scanner = new Scanner(System.in);)  {
			System.out.print("> 정수입력 ?");
			n= scanner.nextInt();
	//짝수일 경우에는 "짝수"출력	
			String result = "짝수(even number)";
			if (n%2==0) {
				
				result = "홀수(ㅐㅇㅇ number)";

			} //제일 좋은 방법 
			/*
			 * if (n%2==0) {
			 
				//System.out.printf("n=%d 짝수(even number)", n);
				result = "짝수(even number)";
				
			} else {
				//System.out.printf("n=%d 홀수(odd number)", n);
				result = "홀수(ㅐㅇㅇ number)";

			}
			
			*/
			System.out.printf("n=%d 홀수(odd number)", n);
					
	 //if   //if문은 참일때만 수행 
	
		
			//scanner.close(); //다쓰면 스캐너 닫기 //  try는 자동으로 close() 짐
		} catch(Exception e) {
		} //catch
		
		
	} //main
 
}//class
