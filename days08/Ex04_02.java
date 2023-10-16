package days08; 


/**
 * @author 
 * @date 2023. 7. 24. - 오전 11:15:52
 * @subjct  지역변수 개념
 * @contents
 * \      함수 호출 + 매개변수 가지고 
 * 1) Call By Name    drawLine();
 * 2)Call By Value       sum(1,2);
 * 3)Call By reference
 * 4)Call By                 x
 */
public class Ex04_02 {

	public static void main(String[] args) {
		//main  지역변수 x,y
		//int x=10;
		//int y=20;
		int[] m = {10,20}; //m[0], m[1]=20
		
		System.out.printf("> x%d, y%d\n",m[0],m[1]);
		/*
		int temp=x;
		x=y;
		y=temp;
		*/
		
		//Call By Value x //값만넘기는건 안됨
		//Call By Reference .main 함수의 x,y 차조
		//매개변수를 참조타입을 사용하겠따 -배열 ,클래스 ,인터페이스
		//swap(x,y); //함수 호축부분  swap(10,20);  //main 함수의 그릇 자체를 넘겨야함
		swap(m); //0x100 배열 시작 주소
		
		System.out.printf("> x%d, y%d\n",m[0],m[1]);

	}//main
	
	//swap 함수 선언부분
	//                                  지역변수 int[] m =0X100
 private static void swap(int[] m) {
	
	
	 int temp =m[0];
	 m[0]=m[1];
	 m[1]=temp;


}
	
	
	
	
}
