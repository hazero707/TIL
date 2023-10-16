package days13;

public class Ex06 {

	public static void main(String[] args) {
		
		//좌표점 20개 쓰기+ 읽기
		//main x,y 지역변수
		int x = 10,y = 20;
		int x1 = 11,y1 = 21;
		int x2 = 12,y2 = 22;
		int x3 = 13,y3 = 23;
		int x4 = 14,y4 = 24;
		int x5 = 15,y5 = 25;
	
		
		dispXY(x,y); //Call By Value 값을 가지고 호출 

	}
	//                           dispXY. x=10, y=20 지역변수 
	private static void dispXY(int x, int y) {
		// TODO Auto-generated method stub
		System.out.printf("> x=%d, y =%d\n", x,y);
	}
	// The variable argument type int of the method dispXY must be the last parameter
		// 가변인자를 여러 개 사용 X
		// 가변인자는 last parameter로 선언해서 사용했다.
		/*
		private static void dispXY(int...x, int...y) {
			
		}
		*/
		/*
		private static void dispXY(int x, int y, int x1, int y1, int x2, int y2) {
			
		}
		*/
		/*
		private static void dispXY(int [] x, int []y) {
			
		}
		*/
}
