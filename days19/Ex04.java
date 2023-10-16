package days19;

import java.util.StringTokenizer;

public class Ex04 {

	public static void main(String[] args) {
		// StringTokenizer 클래스
		String str = "고경림,김성준,김정주,김호영";
		//String [] str.split(regex)

		StringTokenizer st=new StringTokenizer(str, ",");
		
		//System.out.println(st.countTokens()); // 토큰 갯수 몇개
		/*
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		*/
		
		/*
		int countToken = st.countTokens();
		for (int i = 0; i < countToken; i++) {
			System.out.println(st.nextToken());
			
		}
		*/
		
		
		while( st.hasMoreTokens()) { //true.false
			System.out.println(st.nextToken());
		}
	}

}
