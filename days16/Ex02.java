package days16;

import days15.Employee;
import days15.Regular;
import days15.SalesMan;
import days15.Temp;

public class Ex02 {

	public static void main(String[] args) {
		//Regular e1 = new Regular();
		//dispGetPay(e1);
		SalesMan e2 = new SalesMan();
		dispGetPay(e2);
		//Temp e3 = new Temp();
		//dispGetPay(e3);

	}
	
	//인스턴스 메서드 -> 클래스 메서드 
	//매개변수 다형성
	public static void  dispGetPay(Employee emp) {
		//emp 도대체 Regular, SalesMan, Temp
		//		 인스턴스 확인할 수 있는 연산자 :
		// instanceof
		// 1) if~else if구문 확인
		// 2) 자식 클래스 먼저 체크 
		if( emp instanceof Regular) {
			System.out.println("> emp 객체는 Regular 타입이다");
			
			
		}
		else if( emp instanceof SalesMan) {
			System.out.println("> emp 객체는 SalesMan 타입이다");
		}
		else if( emp instanceof Temp) {
			System.out.println("> emp 객체는 Temp 타입이다");
		}
	emp.getpay();
	}

}
