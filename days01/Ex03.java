package days01;
//Alt+Shift+J
/**
 * @author user 작성자
 * 언제
 * 제목
 * 내용
 */
/**
 * @author 정하영
 * @date 2023. 7. 13. - 오후 3:36:50
 * @subjct 자바의 변수와 상수
 * @contents 1.변수,상수 개념
 *                  2.변수 선언형식
 *                  3.예쩨
 */
public class Ex03 {
	public static void main(String[] args) {
		System.out.println("정하영");

	//1.변수(variable)
	//   1)변하는 수 (수학의미)
	//   2)메모리상의 값을 저장하는 공간(프로그램 언어)
	
	//2. 상수(const)
   //     1)변하지 앟는 수(==고정된 수)
	//    2)메모리상의 값을  저장하는 공간(프로그램 언어)
	
	//[선언형식] 1.클래스, 함수(메서드)
	//3)변수 선언 형식
	//     자료형 변수명[=초기값];
	//     자료형==데이타 타입(data type)
	
	//4.실습
	//;세미콜론 명령라인 종결
	//오류 메세지 cannot be resolved to a variable
	//자바에서 문자열==문자의 나열    "문자열"
	//자바에서 한 문자를 나타낼때 꼴 따음표 '이'
	//     정하여   변수로 인식함
	
	//이름을 저장하는 문자열변수 선언
	
	//변수이름을 명명하는 규칙 p26
	String name = "정하영";
	System.out.println( name );
	
	//Duplicate local variable name
	//name 로컬(지역)변수 중복 선언되었다.
	name = "김모씨";
	System.out.println( name );
  }
}

