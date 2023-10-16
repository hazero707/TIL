package days16;

public class Ex01 {

	public static void main(String[] args) {
	
		//new Parent();
		//Parent p1 = new Child();
		//Child c1 = new Descendant();
		//Parent p1 = new Descendant();
		
	}

}

//상속계층도 
//자식클래스
//공통적인 멤버 가진 부모클래스 ,abstract 키워드 - 추상클래스 
//일종의 클래스 


abstract class parent{
	 //필드
	//메서드
	//추상메서드
	abstract void dispA();
	abstract void dispB();
	
}
/*
abstract class Child extends Parent{
	
	@Override
	void dispB() {
		
	}
}
*/

/*
abstract class Child extends Parent{
	//필드 
	//메서드 
	
}
*/