package days07;

public class Ex07_02 {

	public static void main(String[] args) {

		// 2. 20개 항까지의 합을 구해서 출력 
				//    1+2+4+7+11+16+22+29+37+46+56+67+79+92+106+121+137+154+172+191+=1350  규칙적인 수열
				//      1 2 3 4  5   6   계차수열
				
				//  [계차수열을 이용하여 수열의 일반항 구하기]
				//  https://terms.naver.com/entry.naver?docId=3338127&cid=47324&categoryId=47324
				/*
				int term = 1; // 일반항
				int defference = 0; // 계차
				int sum = 0;  // 총합 
				
				for (int i = 1; i <= 20; i++) {
					term += defference;
					System.out.printf("%d+", term); // 1+2+
					sum += term;
					defference++; // 2
				} // for
				System.out.printf("=%d\n", sum);		
				*/
				
				/*
				int term;
				for (int i = 1; i <= 20; i++) {
					// (n^2-n)/2+1
					term =  (int) ((Math.pow(i, 2)-i)/2+1);  //이해 안됨
					System.out.printf("%d+", term );
				} // for
				*/
	}

}