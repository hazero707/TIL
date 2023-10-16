package days13;

public class Point {
	
// 필드
public int x = 0;
public int y = 0;

// 메서드 
public void dispXY() {
	System.out.printf("> x=%d, y=%d\n", x, y);
}

// 메서드 추가
// 리턴자료형이 Point 클래스의 참조타입.
public Point plusPoint(Point p) {
	 
	// 새로운 좌표객체를 생성해서 반환
	Point p2 = new Point();
	p2.x = p.x + 10;
	p2.y = p.y + 20;
	
	return p2;
}

// 중복함수	
// 오버로딩(overloading)
// 객체명.메서드명()
// p1.plusPoint()
public Point plusPoint() {
	// x, y 필드 누구꺼? p1  plusPoint() 메서드를 호출한 객체
	// System.out.printf("> x=%d, y=%d\n", x, y);
	Point p2 = new Point();
	p2.x = x + 10;
	p2.y = y + 20;
	
	return p2;
 
   

}
}
