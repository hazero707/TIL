package days16;

public class Ex03 {

	public static void main(String[] args) {
		
		//지역변수 ->상수 (final키워드)
		double PI = 3.141592;
		
		// 3.141592 pi
		// 3.141592 pi
		// 3.141592 pi
		// 3.141592 pi
		// 3.141592 pi
		// 3.141592 pi
		//Final.PI
	

		FinalTest obj = new FinalTest();
		//System.out.println(obj, PI);
		
		//Child c = new Child();
	}

} //class

/*
class Parent{
	
	//재정의할 수 없는 최종(마지막) 메서드 
	final void dispA() {
		//구현~
	}
}
class Child extends Parent{
	@Override
	void dispA() {
		//구현~
	}
	
}

*/

class FinalTest{
	//상수필드
	//public static final double PI= 3.141592;  //명시적 초기화 
	
	//The blank final field PI may not have been initialized 초기화를 안했음 
	final double PI;
	
	//인스턴스 초기화 블럭
	/*
	{
		PI = 3.14;
	}
	*/
	public FinalTest(){  //생성자 초기화
		PI =3.14;
	}
	public void finalTest(int value) {
		//
		//
		
	}

}

