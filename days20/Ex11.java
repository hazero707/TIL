package days20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex11 {
        //  시험 봄
	public static void main(String[] args) {
		/*Date(jdk1.0)
		 * Calendar(jdk1.1)
		 * 
		 * jdk1.8 새로 추가된 날짜, 시간 클래스 (java.time 패키지) 
		 *1.* java.time 패키지 는 4개의 하위패키지 로 구성됨
		 *  java.time : 날짜, 시간 다루는 핵심 클래스 제공
		 *	ㄴ j.t.(줄인말) chorono: 표준(ISO)이 아닌 달력 시스템을 위한 클래스 제공 
		 *  ㄴ j.t.FORMAT : 형식화(파싱) 클래스 제공
		 *  ㄴ j.t.temporal(시간의) : 날짜, 시간의 필드(field)와 단위(unit)
		 *  ㄴ j.t.zone : 시간대 ( time-zone) 클래스 제공 
		 *  
		 *2. java.time : 날짜, 시간 다루는 핵심 클래스 제공
		 * 1)날짜: LocalDate
		 * 2)시간: LocalTime
		 * 3) 날짜 + 시간 : LocalDateTime 클래스
		 * 4) 날짜 + 시간 + 시간대 : ZonedDateTime 클래스
		 *
		 *3) new 연산자로 객체생성 x -> now(), of() aptjem  ??
		 *
		 *4) 날짜와 날짜 사이의 간격 : Period
		 *   시간과 시간 사이의 간격 : Duration
		 *   -> TemporalAmout 인터페이스 구현 
		 *   
		 *  /// ld, lt, ldt, zdt  핵심클래스 모드 
		 *   /// -> Temporal, TemporalAdjuster 인터페이스를 구현 
		 *   
		 *   5. 날짜와 시간의 [단위]를 정의해 놓은 것이 
		 *     ㄴ Temporal[unit] 인터페이스 
		 *     ㄴ ChronoUnit 클래스 
		 *     
		 *     6. 년, 월, 일 , 등의 날짜와 시간의 필드(field)를 정의해 놓은 것이 
		 *            ㄴ Temporal[Field] 인터페이스 
		 *            ㄴ Chrono[Field] 클래스 
		 *            
		 *     7 특정필드 (년, 월, 일 , 시간, 분... 등) 가져오기 
		 *      ㄴget XXX() : int getYEAR();
		 *      ㄴget (필드)       
		 *      
		 *      8. 특정필드 수정 : with() plus(), munus();
		 *      Date d.setYEAR(???);
		 *      J
		 */
		
		//[ of() 메서드로 j.t. 핵심클래스 객체 생성 ] 
		
		
	}

}
