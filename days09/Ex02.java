package days09;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		
		int n = 10;
		// [3] 제어문 활용. 
		/*
		 2 10
		 2 몫5 -----나머지  [0]
		 2  2   ----------- 1
		 2  1  ------------ 0
		    0  ------------ 1
		*/
		int share, reminder;
		String s = "";
		
		int [] binaryArr = new int[32];
		int index = binaryArr.length - 1;    // 31;
		
		while (n != 0) {  // n > 0
			share = n / 2;
			reminder = n % 2;
			System.out.println( reminder );
			binaryArr[index--] = reminder;
			s += reminder;
			n = share;
		} // while
		// System.out.println( s ); // "0101" -> "1010"
		System.out.println( Arrays.toString(binaryArr).replace(", ", "") ) ;
		
		// 11:03 수업시작~
		
		// String, StringBuilder, StringBuffer 문자열 다루는 클래스
		// StringBuilder sb= new StringBuilder();
		// sb.reverse()
		
		/*
		share = n / 2;
		reminder = n % 2;
		System.out.println( reminder );
		n = share;
		
		share = n / 2;      // 2
		reminder = n % 2;     // 1
		System.out.println( reminder );
		n = share;
		
		share = n / 2;    // 1
		reminder = n % 2; // 0
		System.out.println( reminder );
		n = share;
		
		share = n / 2;    // 0
		reminder = n % 2; // 1
		System.out.println( reminder );
		n = share;
		*/
		
		
		
		// [2] ***
		/*
		String b = Integer.toBinaryString(n); 
		System.out.println( b ); // "1010"
		// "1010" -> 1010 변환
		String s = String.format("%032d\n", Integer.parseInt(b) );
		System.out.println( s );
		*/
		
		/* [1]
		//                          "1010"
		//System.out.println( Integer.toBinaryString(n) );
		
		String s = "00000000000000000000000000000000";
		String b = Integer.toBinaryString(n); 
		s += b;
		System.out.println(s);
		
		// 오버로딩 , 중복함수
		// s.substring(beginIndex);
		// s.substring(beginIndex, endIndex);
		
		System.out.println(s.substring( b.length() ));
		*/
		
	} // main
}
