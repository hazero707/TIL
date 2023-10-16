package days24;

import java.util.ArrayList;


public class Ex12 {

	public static void main(String[] args) {
		  //[제한된 제네릭 클래스]
	      // T 모든 타입이 아니라 과일 타입만 제한해서 제네릭 클래스를 사용하려고 함
	   
		FruitBox<Fruit> fruitBox = new FruitBox<>();
	      FruitBox<Apple> appleBox = new FruitBox<>();
	      FruitBox<Grape> grapeBox = new FruitBox<>();
	      
	      /*
	                        //(FruitBox<? extends Fruit>box)
	      Juice juice = Juicer.makeJuice(fruitBox);
	      juice = Juicer.makeJuice(appleBox);
	      juice = Juicer.makeJuice(grapeBox);
	      */
	      
	      //makeJuice 메서드를 제네릭 메서드로 선언(수정) 
	      //호츨방법 다르다. 
	      Juice juice = Juicer.<Apple>makeJuice(appleBox);
	      //<Apple> 생략이 가능하다.
	      //Juice juice = Juicer.makeJuice(appleBox);
	      
	     
	    //  FruitBox<Toy> box4 = new FruitBox<Toy>();
	      
	       //[ 제네릭 메서드]
	       // - 메서드의 선언부에 제네릭 타입이 선언된 메서드를 
	       // 제네릭 메서드라고 한다. 
	       // - 형식 
	       // public static <T> Juice makeJuice(FruitBox<T> box){
	       //   }
	     
	       
	   }//main

	}//class

class Fruit  {
	 public String toString() { return  "Fruit";  }
}
class Apple extends Fruit{
	public String toString() { return  "Apple";  }
}
class Grape extends Fruit{
	public String toString() { return  "Grape";  }
} 


	class Box05<T>{
	   ArrayList<T> list = new ArrayList<T>(); 
	   void add(T item) { this.list.add(item); }
	   int sizq() { return this.list.size(); }
	   T get(int i) { return this.list.get(i); }
	   public String toString() {return this.list.toString();}
	}

	class FruitBox<T extends Fruit> extends Box05<T>{
		//구현	
}
	//[클래스 선언]       제네릭 클래스 아님 
  // 매개변수를 과일박스를 주면 
	// 쥬스를 만들어서 반환하는 기능이 있는 쥬스 클래스 
	class Juice{}
	/*
	(FruitBox<? extends Fruit> box) : Fruit 물려받은 자식들만 가능 
    (FruitBox<? super Fruit> box) : Fruit 부모들 가능 
    (FruitBox<?> box) : 제한 없다 모든 타입은 가능 하다 
  */
	class Juicer{                      
		// 메서드 오버로딩 조건
		// 제네릭 타입의 매개변수는 오버로딩이 성립되지 않는다.
		//                             ?  == 와일드 카드
		/*
		static Juice makeJuice(FruitBox<? extends Fruit > box) {
			return new Juice();
		}
		*/
		// 위의 일반 메서드를 제네릭 메서드로 변경
		static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
			return new Juice();
		}
		
		
		/*
		static Juice makeJuice(FruitBox<Fruit> box) {
			return new Juice();
		}
		
		static Juice makeJuice(FruitBox<Apple> box) {
			return new Juice();
		}
		
		static Juice makeJuice(FruitBox<Grape> box) {
			return new Juice();
		}
		
		*/
	}