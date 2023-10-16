package days08;

public class Ex06_02 {

	public static void main(String[] args) {
		int n =10;
		int result =sum(n);
		System.out.printf("1~%d=%d\n", n, result);
		
		// 1~n 합 일반 함수
		// 1~n 합 재귀 함수
		
	}//main
	//10분 *10 = 100분 재귀함수 x   재귀함수는 잘안씀  트리구조 -검색할때 씀 
	//        10분
	
	// 10 + recursiveSum(9)
		//      9+ recursiveSum(8)
		//          8+recursiveSum(7)
		//            7+recursiveSum(6)
		//                 2+recursiveSum(1)
		//                           1
		// return 10+9+8+...2+1
		// 재귀함수
	private static int recursiveSum(int n) {
		if (n==1) return n;
		else       return n + recursiveSum(n-1);  
	
	}
	

	private static int sum(int n) {
		int result =0;
		for (int i = 1; i <= n ; i++) {
			result +=i;
		} //for
		return result;
	}

}//class
