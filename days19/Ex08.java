package days19;

import java.util.Objects;
import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {
		//Arrays 클래스 
		//[ Object 클래스 ]
		Ex08 obj = null;
		
		//if(obj !=null) Xxx
		//if( !Objects.isNull(obj))  Xxx
		//if( Objects.nonNull(obj))   Xxx
		
		//Objects.isNull(obj)  obj 라는 객체가 null 일대 true 반환하는 메서드가 : isNull()
		//Objects.nonNull()  obj 객체가 null 이 아닐때  true    "
		
		/*
		if(obj ==null) {
			new ~~~Exception("예외 메시지");
		}
		this.name =name;
		*/
		
		//Objects.requireNonNull(name, "예외메시지");
		
		//if ( a !=null && a.equals(b)){}  //a
		//if( Objects.equals(a,b)){}
		
		// java.until.Random 클래스
		Random rnd = new Random();
		//rnd.nextBoolean();  //true , flase
		//rnd.nextInt(bound); // 0<= 정수 < bound
		//rnd.nextXXXX();
		

	}

}
