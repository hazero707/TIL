package days24;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex06_02 {
	public static void main(String[] args) {
		
	
	String [] names = {"이지현", "김호영","임경재","유희진"};
	System.out.println(Arrays.toString(names));

	/*
	 부모타입 객체명 = new 부모타입 (매개변수...){     
		  *   //필드
		  *  //메서드
		  *  @ override 재정의 함수 구현
		// 
		 * };
		 */
	
	/*
	Comparator c = new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			
			return o2.compareTo(o1);
		}

	
		
	};
	
    Arrays.sort( names, c );
    */

	//sort() 메서드 호출 부분 
	//         매개변수로 익명클래스 사용한 예 
	/*
	 Arrays.sort( names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
	 });
	 */
	
	//중첩
	 Arrays.sort( names, 
			 ( o1,  o2) -> o2.compareTo(o1)  // comparator 구현한 익명클래스 가 와야되고  compare 메서드로 오버라이ㅏ딩 할 수 밖에 없고 그 매배 변수는 string 값을 비교해야 하니깐 매개변수로만 비교해서 쓸수 있음 
			);
	 
	 
	 
	System.out.println(Arrays.toString(names));
	
	}
	
	

}


/*
 * 1. comparator  인터페이스를 구현한 클래스 선언 
class StringDescendingComparator implements Comparator<String>{

@Override
public int compare(String o1, String o2) {
	// TODO Auto-generated method stub
	return o2.compareTo(o1);
			
}*/

