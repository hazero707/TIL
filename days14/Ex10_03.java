package days14;

/**
 * @author [초기화 블럭] 
 *         인스턴스 초기화 블럭
 *         클래스 블럭 
 */
public class Ex10_03 {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		System.out.println(m1.name);
		System.out.println(m1.count);
		
		Member m2 = new Member();
		
		/*
		 * 초기화 순서
		 * 1) 명시적 초기화
		 * 2)클래스 초기화 ( 객체 생성될 때 1번 초기화)
		 * 3) 인스턴스 초기화 ( 객체 생성될 때 마다 초기화)
		 *     ㄴ 생성자 중복 코딩 초기화 블럭....
		 * 4) 생성자 초기화 ( 객체 생성될 때 마다 초기화)
		 * 
		 */

	}

}

class Member{ 
	// TODO Auto-generated method stub
	//[필드]
	//1. 인스턴스 변수

	String name= "익명";  //명시적 초기화
	int age=20; //명시적 초기화
	int count;  //명시적 초기화 x
	int serialNo; //명시적 초기화 x
	//2.클래스 변수
	static double rate = 0.05; // 명시적 초기화 

	//클래스 초기화 블럭]
	static{
		//일괄적으로 static 변수가 있다면 초기화하는 데 사용. 
		rate = 0.08;
		System.out.println("> static 초기화 블럭 호출됨...");
	}
	//인스턴스 초기화 블럭 
	{
		 count++;
	       serialNo = count;
	       System.out.println("> 인스턴스 초기화 블럭 호출됨");

		
	}

	public Member() {
      count++;
      serialNo = count;
      
      name = "무명";
      System.out.println("> Member 디폴트 생성자 호출됨.");
	}
	public Member(String name) {
		   count++;
//	       serialNo = count;
	       
	       this.name = name;
	       System.out.println("> Member 1 생성자 호출됨.");


	}
}


