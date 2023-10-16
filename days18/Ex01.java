package days18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;


public class Ex01 {

	public static void main(String[] args) {
		
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		
		/*
		 * int [] temp = new int [m.length]
		 * for (int i = names; i >=0 ; i--) {
			temp[4-i] = names[i];
			
		}
		System.out.println(Arrays.toString(temp));
		 */
		
		//[이유이해]
		//The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Collections.reverseOrder())
		//int[]에서는 Collections메소드를 사용하지 못 한다는 뜻 입니다 /Collections는 객체에서만 사용이 가능한 메소드입니다 /int[]는 객체가 아닌 Primary type이므로 사용이 불가능한 것입니다
		
		// sort 는 기본적으로 오름차순 정렬인데 내림차순으로 정렬하는 위에거는 int 타입은 안되고 comparable  type 이 포함된 클래스를 사용??
		/*
        Arrays.sort(m, Collections.reverseOrder());  // TYPE t는 클래스
		System.out.println(Arrays.toString(m));
		*/
		
		//int[] -> Integer [] (래퍼클래스배열로)  변환화면 위에것 사용가능 
		Integer i;
		//박싱 언박싱 
		Integer [] temp = Arrays.stream(m).boxed().toArray(Integer []::new);
		 Arrays.sort(temp, Collections.reverseOrder()); 
		 System.out.println(Arrays.toString(temp));
	
	}//class

}//main

