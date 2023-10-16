package days24;


/**
 * @author user
 * @date 2023. 8. 16.오후 12:38:29
 * @subject  중첩인터페이스 
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Button btnTouch = new Button();
		
		btnTouch.setOnClickListener( new CallListener() );
		btnTouch.touch();
		
		
		btnTouch.setOnClickListener( new MessageListener() );
		btnTouch.touch();
		

	} // main

} // class

class Button{
	
	// 필드
	OnClickListener listener;
	
	// 생성자, setter    의존성 주입( DI ) 
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		this.listener.onClick(); //그함수의 기능을 호출하겠다.
	}
	
	// 중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}
}

class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() { 
		System.out.println("전화를 건다.");
	}
	
}

class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() { 
		System.out.println("메시지를 보낸다.");
	}
	
}

/*
class Car{
   Engine engine; 
   public void setEngine(Engine engine) {
		this.engine = engine;
	}
   void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	} 
   
   
   
}

   interface Engine{ // 인터페이스 안에서 멤버들끼리 쉽게 접근할수 있게 함  ,  근데 외부에 선언을 대부분 많이 함 
		void moreFuel(int fuel);
   }

*/
