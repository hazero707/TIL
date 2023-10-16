package days21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



public class Ex13 {
     // 다시 확인하기 
	public static void main(String[] args) {
		// 1. 컬렉션 클래스 - ArrayList
		//      ㄴ  가장 많이 사용되는 컬렉션 클래스
		//      ㄴ  List 인터페이스를 구현한 클래스
		//           ( 순서 유지 O, 중복 허용 O )
		//      ㄴ 배열 요소(Element)
		//      ㄴ 배열 단점  ->   ArrayList  days10.Ex03.java
		// 3:00 수업 시작~ 
		String [] names = new String[3];
		names[0] = "주강민";
		names[1] = "정하영";
		names[2] = "임경재";
		System.out.println( names.length ); // 3
		// ArrayIndexOutOfBoundsException
		// names[3] = "이지현";
		// 검색 후 출력
		for (int i = 0; i < names.length; i++) {
			if( names[i].equals("정하영")) {
				System.out.println( names[i] );
			}
		} // for 
		
		Arrays.fill(names, null); // 앞에 내용을 초기화하겠다. 
		
		
		
		//ArrayList list = new ArrayList();  10
		ArrayList list = new ArrayList(3) ;
		list.add("주강민"); //  0
		list.add("정하영"); //  1
		list.add("임경재"); //  2
		System.out.println( list.size() ); // 3
		list.add("이지현"); //  3
		
		// true
		System.out.println( list.contains("정하영") );
		int index = list.indexOf("정하영");
		if( index != -1) {
		    System.out.println(list.get(index));
		    list.remove(index);
		    list.add(index, "홍길동"); // 삽입
		}else {
			System.out.println("정하영씨는 없다.");
		}
		
		System.out.println(  list );
		
		// index = list.lastIndexOf("정하영");
		// list.clear();
		
		System.out.println(  list.isEmpty() ); // true
		
		System.out.println(  list );
		
		// *** iterator() 
		// 요소를 순차적으로 처리할 수 있는 
		// 반복자(Iterator)를 반환하는 메서드 ***
		Iterator ir = list.iterator();
		
		// 다음 요소가 있으면 true/false hasNext()
		while (ir.hasNext()) {
			//                          다음 요소를 얻어오는 메서드 next()
			String name = (String) ir.next();
			System.out.println( name );
		} // while
		
          
	}

}
