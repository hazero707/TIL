package days08;

public class Ex03 {

	public static void main(String[] args) {
		
			
			int firstTerm = 1;  //첫번째 항
			int secondTerm = 1; //두번째 항
			int nextTerm;
			int sum = firstTerm + secondTerm;
			System.out.printf("%d+%d+",firstTerm, secondTerm);
			
			for (int i = 1; i < 8; i++) {
				nextTerm =firstTerm + secondTerm;
				System.out.printf("%d", nextTerm);
				sum +=nextTerm;
				firstTerm=secondTerm;
				secondTerm=nextTerm;
				
				
				
			} //for
			
			/*
			while ( (nextTerm = firstTerm + secondTerm) <= 100  ) {		
				System.out.printf("%d+", nextTerm);
				sum += nextTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
			} 
			*/
			
			System.out.printf("=%d\n", sum);
			
		
}

	}


