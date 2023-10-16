package days18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex01_02 {

	public static void main(String[] args) {
		String [] names = {
		  "이상문", "박정호", " 주강민", " 이주영", "이동현 "," 정하영"
		  	
		};
		
		//String 배열을 출력하는 방법? 				String []-> Object[]
		//				매개변수        다형성
		System.out.println(Arrays.toString(names));

		//이름을 오름차순 정렬 출력 ㄱ~ㅎ
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		
		//이름을 내림차순 정렬 출력 
		/*
		 * [1]
		 * String [] temp = new String[names.length];
		
		//4->0
		//3->1
		//2->2
		//1->3
		//0->
		for (int i = names.length-1; i >=0 ; i--) {
			temp[4-i] = names[i];
			
		}
		System.out.println(Arrays.toString(temp));
		//names =temp;
		*/
		
		//[2] qoduf -> 기능 구현 클래스 : Arryas 클래스
		/*
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
		*/
		
		//익명 클래스 (수업안했음)
		/*
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//return o1.equals(o2);
				return o2.compareTo(o1); //양수, 0 , 음수 
			}
			*/
		//[3] 익명클래스를 람다식으로 표현 (그냥 암기)
		Arrays.sort(names, ( o1, o2) -> o2.compareTo(o1)); 
			System.out.println(Arrays.toString(names));
	
		
	}

}
