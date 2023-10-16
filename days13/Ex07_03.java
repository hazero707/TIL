package days13;

public class Ex07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Point p = new Point();
			p.x = 10;
			p.y = 20;
	System.out.printf("> x=%d , y=%d\n",p.x,p.y);
	
	swap(p);
	
	System.out.printf("> x=%d , y=%d\n",p.x,p.y);
	
	
	//                 메서드의 매개변수 poinp 객체 타입
	   //               참조형 매개변수 p
	}

	private static void swap(Point p) {
		// TODO Auto-generated method stub
		int temp =p.x;
		p.x =p.y;
		p.y=temp;
	}
	

}
