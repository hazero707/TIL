package days15;

public class Ex04 {

	public static void main(String[] args) {
		/*
		상속 계층도
		Object           Object
		  ↑               ↑
		   Shape           Point
		    ↑
	     Circle	  Triangle  
		*/
		
		//  is-a 관계(상속)
		//  삼각형은 도형이다. (O)
		//   T   extends  S
		//   원은 도형이다. (O )
		
		Point center = new Point(50,50);
		int r = 10;	
		Circle c = new Circle(center,r);
		
		c.color = "red";
		//shape 부모클래스로 부터 물려받은 draw () 메서드 수정. 
		//재정의 함수 ==오버라이딩( overriding)  //시험나옴 비교
		//중복 함수 == 오버로딩(overloading)
		c.draw(); // 원점출력 + 색깔출력 
		
		System.out.println("--".repeat(30));
		//클래스 배열 초기화
		Point [] p = {
				new Point(1,1),
				new Point(20,40),
				new Point(10,5)
		};
		Triangle t = new Triangle(p);
		t.draw();
		System.out.println("-".repeat(30));
	
	}

}

//삼각형
//정의 : 한 평면상에 있고 일직선상에 없는 3개의 점 A,B,C를 
//      2개씩 쌍으로 하여 선분을 연결하여 이 루어진 도형
class Triangle extends Shape{
	
	//꼭지점 3개 
	Point [] p = null;
	
	public Triangle(Point [] p){
		this.p=p;
	}

	@Override
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s]\n",
				this.p[0].getXY(),
				this.p[1].getXY(),
				this.p[2].getXY()
				
				);
	}
	
}

/*
//원
class Circle{
	//원점
	int x;
	int y;
	//반지금
	int r; // radius

	Circle(){}
	Circle (int x, int y, int r){
		this.x =x;
		this.y=y;
		this.r=r;
	}
	 void draw() {
	      // 도형 그리기. 코딩
	   }

}
*/
//상속 
class Circle extends Shape{
	
	//원점
	Point center; //has-a 관계 
	int r;
	// String color = "black"을 상속받았음 
	
	public Circle( ) {
		this(new Point(0,0),0);
	}
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
		
		
	}
	//그리기 메서드
	//@애노테이션(annotation)
	@Override
	void draw() {
		//System.out.printf("[color=%s, center=(%d,%d)]\n", this.color, this.center.x, this.center.y);
		System.out.printf("[color=%s, center=%s]\n", this.color, this.center.getXY());
	}
	   
}


//도형 = 삼, 사 , 원, 마, 타원 등
class Shape{
	String color = "black"; //명시적 초기화
			
			void draw() {
		System.out.printf("[color=%s]\n", this.color);
	}
}
//class Point extends java.lang.Object
// 자바는 컴파일러가 자동으로 extends Oject 상속
class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
				
	}
	Point(){
		this(0, 0);

	}
	
	String getXY() {
		return String.format("(%d,%d)", this.x,this.y);
	}
}