package days06;

public class Ex06 {

	public static void main(String[] args) {
		
		// [구구단]
		// 2단
		/*
		2*1=2
		2*2=2
		2*3=2
		2*4=2
		2*5=2
		2*6=2
		2*7=2
		2*8=2
		2*9=18
		*/
		
		
		//중첩 forans
		for (int dan = 2; dan <= 9; dan++) {
			
			System.out.printf("[%d단]\n", dan);
			for (int i = 1; i <=9; i++) {
				System.out.printf("%d*%d=%d\n",dan, i, dan*i );
			} // for
			
		} // for dan
		/*
		System.out.printf("[%d단]\n", 2);
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d*%d=%d\n",2, i, 2*i );
		} // for
		
		System.out.printf("[%d단]\n", 3);
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d*%d=%d\n",3, i, 3*i );
		} // for


		System.out.printf("[%d단]\n", 3);
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d*%d=%d\n",3, i, 3*i );
		} // for
		
		System.out.printf("[%d단]\n", 3);
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d*%d=%d\n",3, i, 3*i );
		} // for
		System.out.printf("[%d단]\n", 3);
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d*%d=%d\n",3, i, 3*i );
		} // for
		System.out.printf("[%d단]\n", 3);
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d*%d=%d\n",3, i, 3*i );
		} // for
		System.out.printf("[%d단]\n", 3);
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d*%d=%d\n",3, i, 3*i );
		} // for
		System.out.printf("[%d단]\n", 9);
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d*%d=%d\n",9, i, 9*i );
		} // for
		*/
	}

}
