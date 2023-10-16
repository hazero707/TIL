package days15;

import java.io.IOException;


public class Ex05 {

	public static void main(String[] args) {
		// 단일상속
		// 다중 상속 : x
		/* class Tv{  int power; }
		 * class VCR{int power;}
		 * 
		 *                    다중상속 x ->[ 인터페이스 구현]  // 자바는 허용하지 않음 
		 * class TVCR extends Tv, VCR {    // Tv + VCR
		 *  int power;
		 *  int power;
		 * } 
		 */   

		//[오버라이딩 주의사항 (시험나옴)
		// 1. 정의 : 부모클래스로부터 상속 받은 메서드를 재정의하는 것
		//2. override 사전적의미 == overwrite ==위에 덮어쓴다
		//3. 오버라이딩의 조건
		//  1) 메서드명 수정x
		//  2) 매개변수 동일
		//  3) 리턴타입 동일
		//  4) 접근지정자는 부모의 접근지정자 범위보다 같거나 넓어야 된다.
		//  5) 부모의 메서드보다 많은 수의 예뢰를 선언할 수 없다
		//  6) 인스턴스 메서드 <-> static 메서드 변경 x

	} //main
	// class
}
class Parent{

	int print(String n, int a) throws IOException{
		return 100;
	}

}
class Child extends Parent{
	// The method print(String) of type Child must override or implement a supertype method
	// Cannot reduce the visibility of the inherited method from Parent
	//@Override
	protected int print(String name) throws IOException, NullPointerException{
		return 200;
	}
}
