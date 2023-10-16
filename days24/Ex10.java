package days24;

import java.util.ArrayList;

public class Ex10 {

	public static void main(String[] args) {
		/*
		// [ 제네릭 클래스의 객체 생성과 사용 ]
		Box03<Fruit> fruitBox = new Box03<>();
		Box03<Apple> appleBox = new Box03<>();
		Box03<Grape> grapeBox = new Box03<>(); 
		Box03<Toy> toyBox = new Box03<>();
		
		// Type mismatch: cannot convert from Box03<Grape> to Box03<Apple>
		//타입 불일치 -> 예외발생 
 		// Box03<Apple> box1 = new Box03<Grape>();  예외 발생.
		
		// Type mismatch: cannot convert from Box03<Fruit> to Box03<Apple>
		// 예외발생  부모객체를 넣어도 안됨
		// Box03<Apple> box1 = new Box03<Fruit>(); 예외 발생
		

		// Type mismatch: cannot convert from Box03<Fruit> to Box03<Apple>
		// Box03<Fruit> box1 = new Box03<Apple>(); 예외 발생
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());  // 사과 객체
		fruitBox.add(new Grape());  // 포도 객체
		
		//The method add(Fruit) in the type Box03<Fruit> is not applicable for the arguments (Toy)
		// fruitBox.add(new Toy());  // 장난감 객체
		*/
		
		// Box03<MemberVO X 과일타입 제한> box = new 

	} // main

} // class

// Fruit
//   ㄴ  Apple
//   ㄴ  Grape
// Toy

/*
class Fruit extends Object{
	 public String toString() { return  "Fruit";  }
}
class Apple extends Fruit{
	public String toString() { return  "Apple";  }
}
class Grape extends Fruit{
	public String toString() { return  "Grape";  }
} 

class Toy{ 
	public String toString() { return  "Toy";  }  
}

// 제네릭 클래스 선언
class Box03<T>{
	ArrayList<T> list = new ArrayList<T>(); // [1,2,3]
	void add(T item) {  this.list.add(item); }
	int size() { return this.list.size(); }
	T get(int i) { return this.list.get(i); }
	public String toString() { return  this.list.toString();  }  
}
*/
