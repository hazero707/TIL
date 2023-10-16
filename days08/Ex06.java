package days08;

/**
 * @author dd
 * @date 2023. 7. 24. - 오후 12:16:23
 * @subjct  재귀함수(recursive function)
 * @contents  순환, 되풀이되는 , 재귀하는 
 *  				함수 안에서 자기자신을 다시 호출하는 함수를 
 *                    "재귀[호출]함수"
 */
public class Ex06 {

	public static void main(String[] args) {
		
		disp(); //함수호출

	}//

	private static void disp() {
		System.out.println("> disp()호출됨");
		
		disp();
	}

}
