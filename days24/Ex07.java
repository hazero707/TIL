package days24;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author user
 * @date 2023. 8. 16.오후 2:35:29
 * @subject  제니릭스 , 어노테이션 , 열거형 
 * @content   자바 IO
 *           스레드 + 네트워크 X
 *           람다식과 스트림 X 
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		 * [제네릭(Generics)]
		 * 1. jdk 1.5 - 제네릭
		 *    jdk 1.8 - 람다식 
		 * 2. 제네릭이란 ?
		 * [다양한 타입]의 객체를 다루는 메서드 , 컬렉션 클래스에서  [컴파일시] 타입을 체크해 주는 기능 
		 * 
		 * 3. 왜? 1)객체의 타입을 컴파일 시에 체크하기 때문에 객체의 타입 안정성을 높이고, 2)형 변환의 번거로움이 줄어든다. -> 코드가 간결해 진다
		 *   (제네릭의 장점)
		 *   
		 */
		
		/*
	    ArrayList list = new ArrayList();
	    list.add("홍길동");
	    
	    // String <- Object het() 다운캐스팅 (형변환) 
	    String name = (String)list.get(0);
	    list.add(20);
	    //int <-Integer <- Object
	    int age = (int) list.get(1);
	    System.out.println(age);
	    
	    list.add(true);
	    list.add('A');

*/
		
		//제네릭 클래스 
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김정주");
		list.add("이지현");
		list.add("김호영"
				+ "");
		//list.add(20)
		/*
		String name = list.get(0);
		System.out.println(name);
         */	
		/*
		Iterator ir =list.iterator();
		while (ir.hasNext()) {
			//다운캐스팅 
			String name = (String)ir.next();
			System.out.println(name );
			
		}
		*/
		Iterator<String> ir = list.iterator();
		while (ir.hasNext()) {
			String name =  ir.next();
			System.out.println(name);
		}
		
	}

}
