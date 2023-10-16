package days15;

public class Ex08 {

	public static void main(String[] args) {
		/*
		Employee emp1 = new Employee("이준의", "서울 강남구", "010-1234-1424", "2023,12,12");
		emp1.disEmpInfo();
		//Object.toString() -> Overriding                    
		//
		System.out.println(emp1.toString());
		System.out.println(emp1);
              */
		
		//is-a 관계 (상속)
		// 정규직사원은 사원이다. 0
		
		/*//[2]
		Regular emp2 = new Regular("주강민", "서울양천구", "010-3123-2311", "2021.03.21", 400000000);
		//문제점 : 기본급
		emp2.dispEmpInfo();
		//System.out.println(emp2); //@toString()
		 * */
	 
		/*
		//[3]
		//[상속 조건]
		//Employee = Regular 클래스간의 자동형변환  
		//부모클래스 = new  자식 클래스 
		//[업캐스팅(upcasting)] /상속단계에 있는 클래스들간의 형변환
		//자동형변환
		//[이상한 점]  기본급:4000000 출력
		// Employee 클래스의 dispEmpInfo()x
		// 실제 생성된 Regular 객체의 dispEmpInfo() 메서드 호출 
		 * 
		 
		Employee emp2 = new Regular("주강민", "서울양천구", "010-3123-2311", "2021.03.21", 400000000);
	
		emp2.dispEmpInfo();
		//[업캐스팅- 문제점]
		//emp2.getPay();  //호출 못함
		
		
		//Type mismatch: cannot convert from Employee to Regular
		//다운캐스팅(downcasting)  / cast 연산자를 사용해 강제로 형을 변환해야함 (강제형변환) , 업캐스팅 미리 일어난 개체만 다운캐스팅 할 수 있음 
		Regular emp = (Regular) emp2;
		
		
		//
		//Type mismatch: cannot convert from Employee to Regular   employee 에서 regular 로 형변환 해라 
		//java.lang.ClassCastException:   /컴파일과 실행의 오류 - 빌드 오류   
		Regular emp = (Regular) new Employee("이준의", "서울 강남구", "010-1234-1424", "2023,12,12"); //cast 		
		*/
		
	/*
	 * int n =100;
	 
		long l = n; //long=int 타입일치하지 않아요.=> 자동형변환
		
		//l+n long + int 타입일치하지 않아요 => 자동 형변환
		
		//double / int => double
		//float f = 3.14d; //float = double => 강제형변환 => cast 연산자 
	*/
	     /*
		//[4] SalesMan, Regular, Employee
		Regular emp3 = new SalesMan("임경재","경기도 성남시","010-9837-22342", "2021.02.12", 500000,20,70000);
		emp3.dispEmpInfo();
		System.out.println(emp3.getPay()); // 호출이 안됨
		*/
		/*
		//[5]
		 new Temp("박정호", " 서울목동 ", "010-2324-1516", "2020.0101", 20, 250000);
		 emp4.dispEmpInfo();
		 emp4.getPay(); //x
		 */
		
	}
	


}
