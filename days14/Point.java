package days14;
 

public class Point {

	//필드 
	private int x;
	private int y;


	//디폴트 생성자 
	public Point() {
		this(1);
		System.out.println(" > poiNT 디폴트 생성자 호출됨 ");
	}


	public Point(int x, int b) {
		System.out.println("> Point 2 생성자 호출됨...");
		//The assignment to variable x has no effect
		this.x= x; //매개변수 x 와 필드 x 겹침 ( this 객체 자기자신 참조변수를 가르킴, 멤버를 가르킴)
		this.y= b; 

	}

	//메서드
	public void dispXY() {
		System.out.printf(">x=%d, y=%d\n", x,y);
	}

	//리턴 자료형이 point 클래스의 참조 타입
	public Point plusPoint(Point p) {
		//p.x +=10;
		//p.y +=20;
		// 새로운 좌표겍체를 생성해서 반환
		//The constructor Point() is undefined
		Point p2= new Point();
		p2.x =p.x+10;
		p2.y =p.y+20;

		return p2;
	}
	

	//중복함수
	//오버로딩(overloading)
	public Point plusPoint() {
		//System.out.printf("> x=%d, y=%d\n", x,y);
		Point p2= new Point();
		p2.x =x+10;
		p2.y =y+20;
		return p2;
	}


	//호출한 객체 p1
	//p1.printPoint()

	public Point(int i) {
		this(i ,i); // Point (x,y) 는 매개변수를 호출하겠다.(생성자 안에서 또다른 생성자를 호출할때)
		System.out.println("> Point 1 생성자 호출됨...");

		//this.x =i;
		//this.y =i;

	}

	// 호출한 객체 p1
	// p1.printPoint()
	// 호출한 객체 p2
	// p2.printPoint()
	// 객체명.필드
	// 객체명.메서드
	public void printPoint() {
		System.out.printf(">x=%d, y=%d",this.x,this.y);
	}
	
	
	// Point p1.offsetPoint(10)
	//       this
	/*
	public void offsetPoint(int n) {
		this.x += n;
		this.y += n;
		// return this;
	}
	*/
	public Point offsetPoint(int n) {
		this.x += n;
		this.y += n;
		return this;
	}

}

