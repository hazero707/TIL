package util;

public class Draw2D {
	//2D 그리기 작업할 수 있는 모든 기능들을 구현한 클래스
	
	//함수 선언 3가지 생각
		//1) 기능 : 선 긋기  drawLine
		//2)매개변수 : x
		//3)리턴값(리터자료형) :x void
		public static void  drawLine()
		{
			System.out.println("--------------------");

		}
		//Duplicate method drawLine() in type Ex08_02  이라인에 중복선언되어있다
		public static void  drawLine(int n)  //매개변수의 개수 타입이 다르면 다른 선언이 됨
		{
			for (int i = 1; i < n; i++) {
				System.out.print("-");
			} //for
			System.out.println();

		}
		public static void  drawLine(int n,char style)  //매개변수의 개수 타입이 다르면 다른 선언이 됨
		{
			for (int i = 1; i < n; i++) {
				System.out.print("-");
			} //for
			System.out.println();

		}

}
