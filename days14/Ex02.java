package days14;
 
public class Ex02 {

	public static void main(String[] args) {
		
		//필기다시 
		
		//Point p1 = new Point (1, 2);
		Point p1 = new Point(1,2);
		//p1.x = 1;
		//p1.y = 2;
		
		// 객체명.메서드명
		// 객체명.필드명
		Point p2 = p1.plusPoint(p1);
		p2.dispXY();		
		
		p2 = p1.plusPoint();
		p2.dispXY();
		

	}

}
