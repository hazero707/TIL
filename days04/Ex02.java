package days04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		String sKor = " 90  ";
	//	int kor =Integer.parseInt(sKor,trim());  //string.trim()  trim은 "90   " 앞 뒤 공백제거 
		//System.out.println("kor=%d\n", kor);
		
		
		
		
		
		
		//int x=5, y=10;
		//int max = x>y ? x:y;
	  // System.out.printf("max=%d\n", max);
		
		Scanner scanner = new Scanner(System.in);
				double x;
	
		System.out.print(" > 실수 입력?"); //314
		x= scanner.nextDouble();
		
		//x*100+0.5 
		//연산자 우선순위  cast 연산자> /(산술)
	
		x=(int)(x*100+0.5)/100d;
		System.out.printf("> 결과 : %.2f",x);
	}

}
