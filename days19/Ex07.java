package days19;

public class Ex07 {

	public static void main(String[] args) {
		// [오토박싱 과 오토언박싱( unboxing)]   //자동으로 되는 것
		int i =100; //정수를 저장하는 변수
		Integer j=i; // 클래스 타입의 객체   기본형 변수(i)가 -> 객체 (j) 대입  (바꾸는것) = 박싱  (기본형이 객체 타입으로 바꾸는것), (자동으로 되서 오토)
		
		//JDK 1.5이전 
		//Integer k = new Integer(i);
		
		int k =j; //객체 -> 기본형 변환되는 것 =   오토언박싱 (자동으로 되서 오토)
		
		test(i); // int 기본형   -> Integer 박싱 -> Object 업캐스팅 
		test(3.14);
		test(1L);
		test("a");
		test(j); //Integer 클래스     
		test("홍길동");//String ( 업스팅)
	}//main
                                  //모든 자료형을 매개변수 받아서 처리 
	private static void test(Object i) {   //(업캐스팅) 부모에게 업캐스팅 
		System.out.println(i);
		
	}
	/*
	 * 
	private static void test(int i) { //Integer -> int 형변환
		System.out.println(i);
	 */

}//class
