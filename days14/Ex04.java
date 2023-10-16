package days14;

public class Ex04 {

	public static void main(String[] args) {
		//[ private 필드 선언] - 내일시험 2번문제
		//1. 왜? private 접근 지정자를 사용해서 필드 선언?
		//2. 이유 
		//    1) private 필드 + 유효한 값만을 필드가 사용. 
		//	  2) 필드를 읽기전용, 쓰기 전용
      Person p1 = new Person(  true ); // 생성자를 통해서 값 할당 
      System.out.println(p1.isGender());
      
      //p1.age = -20; // 필드할당.x
      //3. 방법 getter, setter 겟셋  (게터, 세터  추가...
      p1.setAge(20);
      System.out.println(p1.getAge());
      
      // 접근 지정자를 사용해서 필드 (은닉화)
      //he field Person.name is not visible  
      /*
      p1.name = " 홍길동";
      syso(p1.name);
      p1.age =20;
      p1.gender = true;
      */
		
		
	}//main

}//class

//The public type Person must be defined in its own file
//다른 패키지에서는 사용할 클래스는 x 
// 여러 class를 선언 할 수 있지만  pubilc 선언은 하나만 

/*
class Person{
}
*/

