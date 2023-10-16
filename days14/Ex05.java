package days14;

/**
 * @author user
 *          [ this 키워드 ] 설명 
 *          1. 정의 : 객체 자기 자신의 주소값을 가지는 참조변수 
 *          2. this  3가지 용도 
 *              1) 멤버를 가리킬 때의 this 
 *              예) this.필드명    this.메서드명
 *              this.meane 
 *              Point (int x, int y)
 *              this.x =x;
 *              this.y =y;
 *              
 *              2) 생성자에서 또 다른 생성자를 호출할 때의 this
 *              3) 단독으로 사용될 대의 this : 리턴값, 배개변수
 */
public class Ex05 {

	public static void main(String[] args) {
		// 내일 시험문제 3번 
		
		//Person p = new Person();
		//p 변수, 참조변수, 객체명
		//[name][age][gender][getter]... => [0x100]
		//0x100
		
		//The assignment to variable x has no effect
		
		/*
		Point p1 = new Point (1,2);
		p1.printPoint();
		
		Point p2 = new Point (100,200);
		p2.printPoint();
		*/
		
		//The constructor Point(int) is undefined  int 값 하나있는  선언이 안되어있다.
		Point p3 = new Point(30);
		p3.printPoint();
		
		

	}

}
