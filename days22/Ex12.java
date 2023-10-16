package days22;

import java.util.ListIterator;
import java.util.Vector;



public class Ex12 {

	public static void main(String[] args) {
		//ArrayList - List           요소 
		//Vector - List (동기화o)      요소(element)
		//LinkedList - List          노드 (node)
		//Stack - LIFO구조, vector, List
		//          push()  , pop() , poo() 메서드 사용해야함 
		//Queue(I) -FIFO구조, LinkedList
	   //Deque(I)
	  //offer() poll() peek()
      //PriorityQueue
		//iterator(반복자), Enumeration(열거자)
		//ListsIterator (반복자)?
		//  ㄴ iterator 에 양방향으로 조회기능이 추가된 반복자.
		//  ㄴ List 구현한 클래스에만 사용가능 
		
		
		// hasNext()    hasPrevious()
				// next()       previous()
				
				Vector v = new Vector();
				v.add("유희진");
				v.add("임경재");
				v.add("김호영");
				v.add("이지현");
				
				ListIterator ir =  v.listIterator();
				while (ir.hasNext()) {
					String name = (String) ir.next();
					System.out.println( name );
				} // while
				
				// 
				System.out.println("> 역 방향으로 진행하자~~");
				while (ir.hasPrevious()) {
					String name = (String) ir.previous();
					System.out.println( name );
				} // while
				
		
	}

}
