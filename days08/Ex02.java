package days08;

public class Ex02 {

	public static void main(String[] args) {
		//한 문자를 매개변수로 받아서 대문자로 바꿔서 반환하는 함수 선언
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6));
		System.out.println(sum(new int [] {1,2}));
		
		char one='x';
		char upperOne = myUpperCase(one);
		System.out.println(upperOne);

	} //main
	public static char myUpperCase(char one) {
		if('a'<= one && one <='z') {
			one =(char) (one-32);
		}return one;
		
		/*
		// char UpperCaseOne = one;
				//return Character.toUpperCase(one);
				if (Character.isLowerCase(one)) {
					// UpperCaseOne = Character.toUpperCase(one);
					one = Character.toUpperCase(one);
				} // if
				return one;
		*/
	}
	
	
	
	public static int sum(int...args) {
		int result=0;
		/*
		for (int i = 0; i < args.length; i++) {
			result+=args[i];
			}
			*/
		
		//foreach문 확장for문
			for (int i : args) {
				result +=i;
			
			} //foreach
		return result;
	}
	
	//피보나피 수열 4번 피보나치 수열의 10개 항의 합을 출력
	//while 조건반복문 사용
	//for문 사용이 더 효율적
	

}
