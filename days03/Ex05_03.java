package days03;

/**
 * @author 정하영
 * @date 2023. 7. 17. - 오후 12:40:22
 * @subjct 비교연산자의 결과값은 true/ false (boolean)
 * @contents instaceof 비교연산자 x
 *                   (클래스수업할때 함)
 */
public class Ex05_03 {
	public static void main(String[] args) {
		
		
		System.out.println(10>3); //참(true)
		System.out.println(10<3); //거짓(false)
		System.out.println(10>=3); //참(true)  >= 순서바뀌지 않게 조심
		System.out.println(10<=3); //거짓(false) <= 순서바뀌지 않게 조심
		
		// (주의) 같다 (==) 다르다(!=)
		System.out.println(10==3); // 거짓(false)
		System.out.println(10!=3); // 참(true)  != 순서바뀌지 않게 조심
	}

}
