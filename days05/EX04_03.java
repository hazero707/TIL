package days05;

import java.util.Scanner;

public class EX04_03 {

	public static void main(String[] args) {
// [문제] 정수 n,m 을 입력받아서
		//두 정수의 홀수의 합을 출력
		
		int n, m , sum =0;
		try ( Scanner scanner = new Scanner(System.in)){
			System.out.println("> n, m input");
			n=scanner.nextInt();
			m=scanner.nextInt();
			int min = Math.min(n,m);
			int max = Math.max(n,m);
			//for(int i=min%2==0?min+1:min; i <= max; i+2){
			if (min%2==0) min++;
			for (int i = min; i <= max; i+=2) {
				//if(i%2 !=0) 
				sum +=i;
				System.out.printf("%d+" , i);
			}
			System.out.printf("=%d\n",sum);

		
			
			
		} 
	} //main
}//class

