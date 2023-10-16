package days16;

public class Ex11 {

	public static void main(String[] args) {
		//[ default 메서드 ]
		// 5년 지난 후 IA 조상 인터페이스에 
		//test XX() 추상메서드 있었으면...

		
		// 1) 여러 인터페이스를 구현하면 디폴트 메서드 충돌.
		//  => 충돌나는 디폴트 메서드를 오버라이딩하면 해결.
		//2) 조상클래스의 메서드와 디폴트 메서드 충돌 
		//   => 충돌나는 디폴트 메서드는 무시가 된다. 
		
	}

}


interface IA{
	 // 3개 추상메서드
	
	// void testXX() ; // 5년 뒤에 추가...
	default void testXX() {
		// 몸체 구현...
	}
}
//IA 인터페이스 implements 클래스 200개
interface IB extends IA{
	// 3개 추상메서드
	// 2개      "
}
//IB 인터페이스 implements 클래스 400개
interface IC extends IB{
	// 3개 추상메서드
	// 2개      "
	// 5개      "
}
//IC 인터페이스 implements 클래스 300개 
interface ID extends IC{
	// 3개 추상메서드
	// 2개      "
	// 5개      "
	// 13개     "
}
//ID 인터페이스 implements 클래스 100개 