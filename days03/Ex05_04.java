package days03;


/**
 * @author 정하영
 * @date 2023. 7. 17. - 오후 2:01:26
 * @subjct  논리연산자
 * @contents  참/거짓  boolean
 *                   1) 일반 논리 연산자
 *                   	ㄱ.&&  일반 논리 AND 연산자 (논리곱)
 *                        (둘다 참이면 참)
 *                        참 && 참 => 참
 *                        참 && 거짓 =>거짓
 *                        거짓 && 참=>거짓
 *                        거짓 &&거짓=>거짓
 *                        
 *                   	ㄴ.|| (엔터키 위에 키) 일반 논리 OR 연산자 (논리합)
 *                   (둘다 거짓이면 거짓)
 *                          참 ||참 => 참
 *                          참 ||거짓 => 참
 *                          거짓 ||참 => 참
 *                          거짓 ||거짓 => 거짓
 *                          
 *                   	ㄷ.! 부정(NOT) 연산자
 *                   !참=>거짓
 *                   !거짓=>참
 *                   2) 비트 논리 연산자 : % ^ | ~
 */
public class Ex05_04 {

	public static void main(String[] args) {
		//연산자 우선 순위 예) x>+
		//산술>비교>논리>대임          //비교            //논리
		//System.out.println(3<=5   && 10>1);  //참  참  참
		//System.out.println(3<=5   && 10<1);  //참 거짓 거짓
		//		
		                 // : Dead code    거짓    &&  참 거짓  앞에가 이미 거짓이면 뒤에건 참이든 거짓이든 체크자체를 안함)
		//		System.out.println(3>=5   && 10<1);  
		//		System.out.println(3>=5   && 10<1);  
		
		/*
		System.out.println(3<=5   || 10>1);  
		//System.out.println(3<=5   || 10<1);  
		//System.out.println(3>=5   || 10<1);  
		//System.out.println(3>=5   || 10<1); 
		 */
		
		//The operator ! is undefined for the argument type(s) int
		//!(not) 부정연산자는 int 피연산자에 사용할 수 없다.
		//!boolean 앞에 올 수 있음 
		//System.out.println(!3 <= 5);
		//비교 > 논리
		//<=     !
		//! 부정연산자는 단항 연산자로 어떤 연산자보다 우선 순위가 높다
		
		System.out.println(!(3 <= 5));
		
		
	}
}
