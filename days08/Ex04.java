package days08; 


/**
 * @author 
 * @date 2023. 7. 24. - 오전 11:15:52
 * @subjct  지역변수 개념
 * @contents
 * \      함수 호출 + 매개변수 가지고 
 * 1) Call By Name
 * 2)Call By Value
 * 3)Call By reference
 * 4)Call By 
 */
public class Ex04 {

	public static void main(String[] args) {
		//main  지역변수 x,y
		int x=10;
		int y=20;
		
		System.out.printf("> x%d, y%d\n",x,y);
		/*
		int temp=x;
		x=y;
		y=temp;
		*/
		
		//Call By Value
		swap(x,y); //함수 호축부분  swap(10,20);  //main 함수의 그릇 자체를 넘겨야함
		
		
		System.out.printf("> x%d, y%d\n",x,y);

	}//main
	
	//swap 함수 선언부분
	//                                  지역변수
 private static void swap(int x, int y) {
	
	 System.out.printf("> swap before x%d, y%d\n",x,y);
	 int temp =x;
	x=y;
	y=temp;
	System.out.printf(">swap after x%d, y%d\n",x,y);

}
	
	
	
	
}
