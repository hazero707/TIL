package days02;

/**
 * @author 정하영
 * @date 2023. 7. 14. - 오전 11:04:38
 * @subjct 표준입력, 표준출력 => system 클래스
 * @contents 객채==개체==Object==클래스==물건
 *              system 클래스 안에 표준 출력 함수
 *              1.println() 
 *              2.printf()
 *              
 *              printstream printf 출력서식을 가지고 있는 출력함수 (string format, object ... args)
 *              3.print()
 *              void ....print(이름,나이)
 */
public class Ex05 {
	public static void main(String[] args) {
		//java.lang 패키지안에 있는 system 클래스
		//java.Lang.System.out.println("정하영");
		//함수(메서드) 3가지 파악 => 정확히 사용할 수 있다. --->시험에 냄
		//1. 함수의 기능(일) 파악 필요
		//2. 함수가 일처리 할 때 필요한 값 파악 (매개변수, 파라미터, 인자, 인수)
		//3. 함수가 일처리를 한 후에 반환(리턴)하는 값 파악 (리턴 값, 리턴자료형)
		
		// 예 main()함수   포함하고있는것이 시작객체
		//1. 기능 ㅁ수 String[] args ? 문자열 배열 args 바꿔도됨 args=arguments==인자들
         //3. 리턴ㅁx  void : 리턴자료형 값 void로 선언
		
		System.out.printf("홍길동").printf("20");
		
		//개행(줄바꿈) 방법
		System.out.print("정하영" + '\n');
		System.out.print("정하영" + '\n');
		System.out.print("홍길동");
		System.out.println();  //매개변수 안주면 -개행
	}

}
