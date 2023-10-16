package days02;


/**
 * @author 정하영
 * @date 2023. 7. 14. - 오후 2:39:44
 * @subjct 논리형 boolean(1) - true, false 조건사용.
 * @contents
 */
public class Ex11 {
	public static void main(String[] args) {
		//(2) 논리형 boolean(1) - true false 조건사용
		//성별 : 남자(true), 여자(false) 
		
		boolean gender;
		gender = true;
		//gender = 1; x
		//gender ="t"
		
		//%s %c %d %f
		System.out.printf(">성별 %b \n", gender);
	}

}
