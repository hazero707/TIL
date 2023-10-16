package days07;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex07_03 {


		public static void main(String[] args) {
			// [문제] 피보나치 수열
			// 항이 100 같거나 작을 때 까지의 수열을 출력하고
			// 합을 구해서 출력
			// 1+1+2+3+5+8+13+...항 = ???
			// 3:00 풀이~~
			/* [1]
			int [] p = new int[1000]; // ArrayList 컬렉션 클래스
			p[1] = p[0] = 1;
			//  0  1  2  3                index
			// [1][1][2][3][][][][][][89][XXX][][]
			int index = 2;
			while(true) {
				int term = p[index-1]+p[index-2];
				if( term > 100) break;
				p[index] = term;
				index++;
			} // 
			System.out.println( Arrays.toString(p) );
			System.out.println( index -1);
			// JDK 1.8 람다식과 스트림
			int sum = IntStream.of(p).sum();
			System.out.println( sum );
			*/
			
			// [2]
			// 첫번째항 1  (토끼 암컷)
			// 두번째항 1  (토끼 숫컷)
			int firstTerm = 1;
			int secondTerm = 1;
			int nextTerm;
			int sum = firstTerm + secondTerm;
			System.out.printf("%d+%d+",firstTerm, secondTerm);
			// f s
			//   ↓
			//   f s
			//     ↓
			//     f s
			// 1+1+2+3+5
			/* [A]
			while ( true ) {
				nextTerm = firstTerm + secondTerm;
				if(nextTerm > 100) break;
				System.out.printf("%d+", nextTerm);
				sum += nextTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
			} // while
			*/
			
			// [B]
			while ( (nextTerm = firstTerm + secondTerm) <= 100  ) {		
				System.out.printf("%d+", nextTerm);
				sum += nextTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
			} // while
			
			System.out.printf("=%d\n", sum);
			
		//주말에 순서도 공부
}
		
}
		

	    



