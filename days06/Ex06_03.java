package days06;

public class Ex06_03 {

	public static void main(String[] args) {
		/* [1] 가로로 구구단 출력
		dan=2  2<=9(참)
		  ㄴ i=1,2,3,4,5,6,7,8,9           10  10<=9(F)
		dan=3  3<=9(참)
		  ㄴ i=1,2,3,4,5,6,7,8,9           10  10<=9(F) 
		  : 
		dan=9  9<=9(참)
		  ㄴ i=1,2,3,4,5,6,7,8,9           10  10<=9(F)  
		dan=10  10<=9(거짓)
		  
		  2*1=2_2*2=4_2*3=6_ ... 2*9=18 개행
		  3*1=3_2*2=4_2*3=6_ ... 3*9=27 개행
		  _
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d*%d=%02d ", dan,i,dan*i);
			} // for
			System.out.println();
		} // for
*/
		//[2] 세로로 구구단 출력
		// i=1   dan=2,3,4,5,6,7,8,9
		for (int i = 2; i <= 9; i++) {
			System.out.printf(" [%d]단\t", i);
		} // for
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d*%d=%02d\t", dan,i,dan*i);
			} // for
			System.out.println();
		} // for
	}

}
