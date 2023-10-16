package days24;

import java.util.ArrayList;
import java.util.Collections;

public class Ex03 {

	public static void main(String[] args) {
		// Arrays : 배열 사용하기 쉽도록 기능이 구현된 클래스 
		//          sort(), binarySearch(), fill(), copy()  등등 
		//Collections 클래스 
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);  //[]

		//1,2,3,4,5
		list.add(1);
		//					<? super Object> 의미
		//                Collection<? super Object>
		//					Object...
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		//[1,2,3,4,5] -> [ 4,5,1,2,3]
		Collections.rotate(list, 2);
		System.out.println(list);
		
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		Collections.shuffle(list); // 자동으로 임의의 자리 바꾸기 (무작위로 섞임)
		Collections.shuffle(list); // 또 섞임 
		
	    System.out.println(list);
	    
	    Collections.sort(list);
	    System.out.println(list);
	    
	    //내림차순 정렬
	    Collections.sort(list, Collections.reverseOrder());
	    System.out.println(list);
	    
	    Collections.fill(list, -1);
	    System.out.println(list);
	    
	    //Collections.copy(null.null);
	    //Collections.replaceAll(null,null,null)
	    //등등
	}//main

}//class
