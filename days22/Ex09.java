package days22;

import java.util.Stack;

public class Ex09 {

	public static void main(String[] args) {
		// ArrayList  특징 기억하기
		//Vector
		//LinkedList
		//스택(Stack) 과 큐  (Queue)
		//          o(1)
		//----------------
		//
		//----------------
		//LIFO구조 
		// -> push ()
		//<- pep()     peek() 
		//   empty()
		// index  search()    //search 는 1 부터 시작함 
		//-1
		
		//스택확용 : 웹브라우저 뒤로 앞으로 
		
		//Vector 부모클래스 동기화처리 o 
		Stack s = new Stack();         //Stack은 vector의 자식 
		s.push("유희진");
		s.push("임경재");
		s.push("김호영");
		s.push("이지현");
		
		System.out.println(s);
		/*
		System.out.println(s.pop()); // 최신것 부터 꺼내옴
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
		System.out.println(s.pop()); // 다꺼냈으면 empty 에러 뜸 
		*/
		/*
		while (!s.empty()) {
			System.out.println(s.pop());	
		} */
		
		/*
		System.out.println(s.peek()); //제거하지않고 최신거 읽어오는거  똑같은 거 계속 읽어올수있음
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.peek());
		*/
		
		//3
		//pop()  pop()  pop()   
		System.out.println(s.search("임경재"));
		
		
		

	}

}
