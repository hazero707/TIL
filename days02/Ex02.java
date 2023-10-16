package days02;

/**
 * @author 정하영
 * @date 2023. 7. 14. - 오전 9:55:31
 * @subjct 식별자와 키워드 구분
 * @contents 변수, 상수, 리터럴 구분
 *                  상수 문법 - 대문자 사용, final, 한번사용하면 다른값으로 사용금지 등등
 */
public class Ex02 {
   
	public static void main(String[] args) {
		/*
		 * 키워드(keyword) : 의미가 부여된 예약어
		 * 식별자(identifier) : 개발자 부여한 이름들
		 *                       (변수명,클래스명,함수명 등등)
		 */
		
		//String name;
		//키워드  식별자
		// 변수와 상수 설명
		//변수-변화는수, 상수-고정된수
		//-값을 저장하는 메모리상의 저장공간
		
		//원주율 pi 3.12345   pi 기억공간
		//변수(숫자 정수,실수)
		//변수 선언형식 30쪽
		//자료형 상수[=초기값]
		final double  PI = 3.141592;
		
		//String firstName 변수
		//String FIRST_NAME 상수, MAX_VALUE, MIN_VALUE
		//상수는 무조건 대문자 사용 권장
		//The final local variable pi cannot be assigned 상수는 한번 넣으면 다른값으로 변경 어려움
		
		// 리터럴 1 true 'A' 3.14
	}
}
