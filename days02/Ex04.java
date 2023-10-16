package days02;


/**
 * @author 정하영
 * @date 2023. 7. 14. - 오전 10:35:46
 * @subjct 두 기억공간의 값을 바꾸기- 복습문제2번
 * @contents
 */
public class Ex04 {

	public static void main(String[] args) {
		//두 정수를 저장할x,y 변수를 선언하고
		//각각 10,20으로 초기화하고
		//출력형식:   >x=10, y=20  출력
		// int x
		//int y
		int x=10, y=20;
		System.out.printf("교화전 x= %d, y=%\n", x,y);
		//윙의 동일한 자료형일 경우에는 콤마(,) 연산자를
		//사용해서 나열할 수 있다.
		x=10;
		y=20;
		System.out.printf(">x=%d, y=%d", x,y) ; 
		//프로그램 상에서 두가지 공간의 값을 교환하려면 반드시 동일한 자료형의 임시기억 공간이 필요하다
		//자료형 변수명
		//자요형 변수명
		System.out.println("x");
		System.out.println("y=20");

		//int x=10, y=20;
		System.out.printf(">x=%d, y=%d", x,y);
		{	
			int temp; //(1)
			temp = x; //(2)
			x=y; //(2)
			y= temp; //(4)
		}
	}

}
