package days07;

public class Ex01 {


		public static void main(String[] args) {
			// 1. 구구단 가로 출력
			// for i=2~9     단
			//    for j=1~9    
			// i=1  j=1,2,3,4~ 9
			// i=2  j=1,2,3,4~ 9
			// 2*1 2*2 ~ 2*9

			// 2. 구구단 세로 출력
			// for i=1~9     
			//    for j=2~9  단   
			// i=1  j=2,3,4~ 9
			// i=2  j=2,3,4~ 9
			// 2*1 3*1 ~ 9*1
			
			// 3. 이등변 삼각형 별찍기
			// 1: __*      i=1   j=2    j=1
			// 2: _***     i=2   j=1    j=3
			// 3: *****    i=3   j=0    j=5
			//             i+j==3    j=3-i
			//                           2*i-1
			for (int i = 1; i <=3; i++) {
				for (int j = 1; j <= 5; j++) {
					if( i+j>=4 && j-i <= 2) System.out.print("*");
					else System.out.print("_");
				} // for
				System.out.println();
			} // for
			
			
			/*
			for (int i = 1; i <= 3; i++) { // 행갯수
				System.out.printf("%d : ", i);
				// 공백 for
				for (int j = 1; j <= 3-i; j++) {
					System.out.print("_");
				} // for
				// 별 for
				for (int j = 1; j <= 2*i-1; j++) {
					System.out.print("*");
				} // for
				System.out.println();
			} // for
			*/
			
			// *
			// **
			// ***
			// ****
			/*
			for (int i = 1; i <=4; i++) {
				for (int j = 1; j <=4; j++) {
					//if( i >= j ) System.out.print("*");
					if( i <= j ) System.out.print("*");
					else System.out.print("_");
				}
				System.out.println();
			}
			*/
			
			// ___*
			// __**
			// _***
			// ****
			/*
			for (int i = 1; i <=4; i++) {
				for (int j = 1; j <=4; j++) { 
					if( i + j >= 5 ) System.out.print("*");
					else System.out.print("_");
				}
				System.out.println();
			}
			*/
			
			/*
			for (int i = 1; i <=5; i++) {
				for (int j = 1; j <=5; j++) {
					//if( i==j) System.out.print("*");
					//if( i+j==6) System.out.print("*");
					if( i+j==6  || i==j ) System.out.print("_");
					else System.out.print("*");
				} // for
				System.out.println();
			} // for
			*/
	}

}
