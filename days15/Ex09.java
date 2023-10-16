package days15;

public class Ex09 {

	public static void main(String[] args) {
		
		//1) 문제점
		//E e1 = new R();
		//E e1 = new s();
		//E e1 = new t();
		//e1.getPay():  x
		//왜? Employee 클래스 안에 getpay..

		
		
		
		
		//학생 관리 : 초등, 중, 고. 대학생
		
		//  추상클래서 학생클래스 : 공통적으로 멤버 
		
		//[다형성] - "여러 가지 형태를 가질 수 있는 능력"
		/*
		 * E e1 = new R();
		 * E e2 = new S();
		 * E e3 = new T();
		 */
		//Cannot instantiate the type 
		//불와전한 클래스 = 추상클래스
		//Employee emp1 = new Employee("이준의", "서울 강남구", "010-1234-1424", "2023,12,12");
		
/*
		Regular emp2 = new Regular("주강민", "서울양천구", "010-3123-2311", "2021.03.21", 400000000);
		Regular emp3 = new SalesMan("임경재","경기도 성남시","010-9837-22342", "2021.02.12", 500000,20,70000);
		new Temp("박정호", " 서울목동 ", "010-2324-1516", "2020.0101", 20, 250000);
		
		emp1.getPay();
		emp2.getPay();
		emp3.getPay();
		*/
	Employee [] emps = new Employee[3];
	//업케스팅(자동형변환) 
	
		
	}

}
