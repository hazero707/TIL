package days19;

import java.util.Date;

/**
 * @author user
 * @date 2023. 8. 8.오후 3:27:29
 * @subject 날짜, 시간 클래스 + 형식화(formmatting) 클래스  
 * @content[일정관리]
 * 
 *  내일부터 수업  - 컬렉션 프레임워크 / 제네릭 +어노테이션 / 자바 입출력(IO)  
 *  
 *  + 스레드 + 네트워크, 람다식 + 스트림  
 *  프로젝트 (1)
 *                      //중간에 자잘한 팀프로젝트 해오는 것도 있음 
 *  -> 끝나면 오라클 
 * (2) 1주 토/일/월~금/토/일 => 월발표
 * 
 * 자바+오라클 연동 = JDBC
 * HTML.CSS.JS.Jquery
 * JSP, Servlet
 * (3) 3주~4주
 * 스프링 r / b
 * mybatis 
 * (4) AWS + 수료일 ~ 
 */	 
public class Ex11 {

	public static void main(String[] args) {
		//jdk 1.0  java.util.Date
		//jdk 1.1 java.util.Calendar
		//               ㄴ  GregorianCalendar
		// java.time 패키지 안에 여러하위 패키지와 다양한 클래스 추가 
		
		Date d = new Date();
		
		//Tue Aug 08 15:39:46 KST 2023
		//System.out.println(d.toString());
		System.out.println(d);
		
		//8 Aug 2023 06:39:46 GMT
		// 그리니치 표준시, 세계 표준시간 
		System.out.println(d.toGMTString());
		
		//2023. 8. 8. 오후 3:40:41
		// 지역의 시간 
		System.out.println(d.toLocaleString());
		
		//년
		System.out.println(d.getYear()+1900);
		//월
		//1월(0)  12월(11)
		System.out.println(d.getMonth()+1);
		//일
		System.out.println(d.getDate());
		//시간
		System.out.println(d.getHours());
		//분
		System.out.println(d.getMinutes());
		//초
		System.out.println(d.getSeconds());
		//밀리세컨드
		System.out.println(d.getSeconds()*1000);
		//요일 
		System.out.println(d.getDay());   //1000ms =1s
		System.out.println("일월화수목금토".charAt(d.getDay())); //0(일)~6(토)
		
		//1970.1.1 0:0:0 분부터 카운터된 ms(밀리세컨드) 값  long 타입 
		System.out.println(d.getTime()); //1691477455406
		
		
		
		
		
		
		
		
 
	}

}
