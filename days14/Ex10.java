package days14;


/**
 * @author 변수 초기화
 *              1) 지역변수 2) 인스턴스변수 3)클래스 변수 
 *              
 *              1.변수 초기화? 변수를 선언하고 처음으로 값을 할당하는것 
 *				2. 지역변수는 반드시 초기화해야지 사용할 수 있다.
 *				3. 인스턴스변수는 초기화 하지 않으면 각 자료형의 기본값으로 초기화되어져있다.
 *
 *		double 0.0  0.0D
 *		int,byte,short : 0 
 *		lOng 0L
 *		FLOAT 0.0F
 *
 *
 *String (클래스) == 참조형 null
 *
 *xhar\i0000
 *
 */
public class Ex10 {
	
	double avg;//인스턴스 변수 
	static double rate;  //클래스 변수

	public static void main(String[] args) {
		String name="홍길동";
		
		//The local variable name may not have been initialized 
		//지역변수는 반드시 초기화해야 사용할 수 있따.
		System.out.println(name);
		System.out.println();

	}

}
