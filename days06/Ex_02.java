package days06;

public class Ex_02 {

	public static void main(String[] args) {

		//<내풀이>
		/*[1]
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.printf("*");


			} //for
			System.out.println();


		} //for
		 */
		/*[2]
		for (int i = 4; i >0; i--) {
			for (int j = 0; j <i ; j++){
				System.out.printf("*");
			} //for
			System.out.println();}
		 */

		/*3번째 문제 오류
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.printf("%3s*");


			} //for
			System.out.println();
		 */
		/*	
		//----3번문제 완료---
			for (int i = 1; i <=4; i++) {
				for (int j = 4; j > i; j--) {
					System.out.printf("공");
				}
						for (int j = 1; j <= i; j++) {
							System.out.printf("*");

				} //for
				System.out.println();

		} //for */

		//4번문제
/*
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j < i; j++) {
				System.out.printf("공");
			}
			for (int j = 4; j >= i; j--) {
				System.out.printf("*");

			} //for
			System.out.println();
*/
			/*
			//5번문제 - 잘못됨
			for(int i =1 ; i<4 ;i++) {
				for(int j=4;j> i ;j-=2)
					System.out.printf("");
			}
				for(int j=0; j < i ; j+=2) {
					System.out.printf("*");
			
		}
				System.out.println();
				*/
	}
}

