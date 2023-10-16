package days22;

import java.util.HashSet;

public class Ex14 {

	public static void main(String[] args) {

		//Collecton 인터페이스 
		//[Set 인터페이스 구현한 컬렉션 클래스]
		// - 특징 : 순서 유지 x , 중복허용 x
		// -HashSet 컬렉션 클래스 
		//(참고)  Set + 순서유지 o ==> LinkedHashSet 
		
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(10);
		//[1,9,10,15] 저장 순서 유지 x
		System.out.println(hs);
		
		hs.add(1);
		//[1, 9, 10, 15] 중복허용x
		System.out.println(hs);
		
		System.out.println(hs.size());
		
	

	}

}
