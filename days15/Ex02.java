package days15;


/**
 * @author user
 *     1) has-a 관계
 *     2) is_a 관계 (상속)
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		 * [상속(inheritance)}
		 * 1. 상속?  기존의 클래스를 재사용하여 새로운 클래스로 작성하는 것 
		 * 2. 상속 장점
		 *    -코드 재사용 -> 생산성 향상, 유지보수 용이
		 *    3. 상속+ 클래스 선언 형식 
		 * 접근지정자 기타제어자 class 새클래스명 extends 슈퍼클래스(기존클래스){
		 * }
		 * 4.기존클래스 = [부모클래스], 상위클래스, [Super클래스], 기초클래스    /  [  ]많이 쓰는 용어
		 * 
		 * 	새로운 클래스 = [자식클래스], 하위 클래스, [Sub클래스], 파생클래스   
		 * 
		 * 5. 예 ) Point : 좌표를 관니(구현)하는 기능이 구현된 클래스
		 */

	} //main
} //class

class Point2D{
	int x;
	int y;
	Point2D(){}
	Point2D(int x, int y){
		this.x = x;
		this.y =y;
	}
}

class Point3D extends Point2D{
	int z;
	Point3D(){}
	Point3D(int x, int y, int z){
		//this.x = x;
		//this.y =y;
		super(x,y); //Point2D(int x. int y) 부모의 생성자 호출 
		this.z =z;
	}	
}
/*
class Point3D{
	int x;
	int y;
	int z;
	Point3D(){}
	Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
*/
