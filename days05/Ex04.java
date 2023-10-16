package days05;

public class Ex04 {

		public static void main(String[] args) {
			// [1] 1+2+3+4+5+6+7+8+9+10=55
			/*
			int sum = 0;

			for (int i = 1; i <= 10; i++) {
				sum += i;
				System.out.printf(i==10?"%d":"%d+", i);
			} // for
			System.out.printf("=%d\n", sum);
			 */

			// [2] 1+3+5+7+9=25  
			// 1~10까지의 홀수의 합
			/*
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				if( i%2!=0 ) {
					sum += i;
					System.out.printf("%d+", i);
				}
			} // for
			System.out.printf("=%d\n", sum);
			 */

			// [3] 1+3+5+7+9=25  
			// 1~10까지의 홀수의 합
			// [continue 문 설명]
			/*
			int sum = 0;
			for (int i = 1; i <= 10 ; i++) { 
				if( i%2 == 0 ) continue;
				sum += i;
				System.out.printf("%d+", i); 
			} // for
			System.out.printf("=%d\n", sum);
			 */
			
			// [4]
			int sum = 0;
			for (int i = 1; i <= 10 ; i+=2) {
				sum += i;
				System.out.printf("%d+", i); 
			} // for
			System.out.printf("=%d\n", sum);
			

			// [5] 1 ~ n 까지의 합 출력.
			//  1+2+3+4+5=15
			/*
			int n = 5;
			int sum = 0;
			for (int i = 1; i <= n ; i++) {
				sum += i;
				System.out.printf( i==n?"%d":"%d+", i); 
			} // for
			System.out.printf("=%d\n", sum);
			*/

	}

}
