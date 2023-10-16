package days04;


/**
 * @author 정하영
 * @date 2023. 7. 18. - 오후 12:28:50
 * @subjct switch 반복문 암기
 * @contents
 */
public class Ex05 {

	public static void main(String[] args) {
		

			// [1~10까지의 합 출력]
			// 1+2+3+4..+9+10=55
			// i=1  sum=1
			// i=2  sum=3
			// i=3  sum=6
			// :
			int sum = 0;
			for (int i = 1; i <=10; i++) {
				System.out.printf("%d+", i);
				sum = sum + i;
			} // for
			System.out.printf("=%d\n", sum);


			// 10000
			/*
			System.out.println("홍길동");  // 반복규칙.
			System.out.println("홍길동");
			System.out.println("홍길동");
			System.out.println("홍길동");
			System.out.println("홍길동"); 
			 */
			/*
			반복횟수 i
			for ( 초기식 ; 조건식 ; 증감식) {
				System.out.println("홍길동"); 
			} // for
			 */
			// 1<=5 참
			// 2<=5 참		   
			// 3<=5 참
			// 4<=5 참		
			// 5<=5 참	
			// 6<=5 거짓
			/*
			for (int i = 1; i <= 5; i++) {
				System.out.println("홍길동"); 
			} // for
			 */

			// i=1 홍길동
			// i=2 홍길동
			// i=3 홍길동
			// i=4 홍길동
			// i=5 홍길동

	}

}
