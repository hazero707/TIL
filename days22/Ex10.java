package days22;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ex10 {

	public static void main(String[] args) {
		//큐(Queue)  먼저 들어간게 먼저 나오는게 특징 
		//디큐(Duque)  
		//
		//
		//
		//offer()         poll().peek() 
		//push          pop (스택)
		//FIFO 구조 
		//<--       <---
		//collection 인터페이스를 상속받은 인스턴스 
		//Queue q = new LinkedList();
		
		Deque q = new LinkedList();
		q.offer("유희진");
		q.offer("임경재");
		q.offer("김호영");
		q.offer("이지현");
		
		q.offerFirst("홍길동");
		
		
		//q.pollFirst("홍길동");
		
		
		/*
		while (!q.isEmpty()) {
			System.out.println(q.poll());
			String name = (String) q.remove(); 제거 시키고 다시 뽑음   // que 를 쓸대 offer 와 poll 쓴다. 
			System.out.println(name);
			*/
		}
     	
	}


