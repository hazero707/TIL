package days06;

public class Ex06_04 {

	public static void main(String[] args) {
		for(int i =2; i <=9; i++) {
			System.out.printf("[%d단]\t", i );
	}
	
	
		System.out.println();
		for(int i =1; i <=5; i++) {
			for (int dan=2; dan<=9; dan++) {
				System.out.printf("%d*%d=%02d\t ", dan, i ,dan*i );
	}
			}
	
		System.out.println();
		
		
	
	for(int i =6; i <=9; i++) {
		for (int dan=2; dan<=9; dan++) {
			System.out.printf("%d*%d=%02d\t ", dan, i ,dan*i );
}
		}

	System.out.println();
	}//main

}
