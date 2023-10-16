package days03;



/**
 * @author 정하영
 * @date 2023. 7. 17. - 오후 3:04:42
 * @subjct [전위형, 후위형 중간연사자 설명]
 * @contents
 */
public class Ex05_07 {
	public static void main(String[] args) {
		
		int x =10;
		//int y =++x; //전위형 ++후 = 실행
		int y = x++;  //후위형 =대입연산후 ++실행
		
		//단독(홀로) 사용된 때는 전/후위형은 같은 결과이고..
		//x++;
		//++x;

		System.out.printf("> x=%d, y=%d\n", x,y);
	
	}

}
