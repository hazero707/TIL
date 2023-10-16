package days24;

public class Ex09 {

	public static void main(String[] args) {
		// [제네릭스의 제한] 
		// 사용할 수 없는 것들에 대하여 

	}//main

}//class 

class Box02<T>{
	
	//static T item2; 
	//1) 제네릭 클래스에서는  정적 필드 선언 할 수 x
	
	
	//Cannot make a static reference to the non-static type T
	//2) static 메서드의 매개변수로 T 타입 사용할 수 없다
	/*
	static int compare(T t1, T t2) {
		return 0;
	}
	*/
	
	//3) T 타입의 배열은 선언 할 수 있다. 
	T[] itemArr;
	
	
}
