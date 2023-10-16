package days25;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author user
 * @date 2023. 8. 17.오전 11:44:26
 * @subject  스레드 + 네트워크 
 * @content *** 람다식과 스트림
 *             [자바 입출력( IO) ]
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		/*
		 * 1. IO = Input + Output 
		 *          입력     출력     == 입출력 
		 * 2. [컴퓨터프로그램]      ---------> 송신   [외부장치(프로그램)]
		 *                     <-------   수신
		 *   프로그램 간에 데이터를 주고 받는 것 
		 *   3. 두 장치를 연결해 주는 객체가 필요하다.  : 스트림(Stream)
		 *   4. 스트림 : 데이터를 운반하는 통로 (빨대)
		 *   1) 흐르는 물 
		 *   2) 단반향 (2가지 스트림) 
		 *      ㄱ.읽기(입력용) 스트림
		 *      ㄴ. 쓰기 (출력용) 스트림 
		 *   5. 연속적인 데이터의 흐름 
		 *   6. 자바의 모든 입출력은 스트림(Stream)이라는 개념으로 이루어진다.
		 *   7. 예)
		 *  키보드장치-> 수신 ->[프로그램처리]->송신 -> 모니터
		 *  (표준입력장치)         기준             (표준출력장치) 
		 *     System.in (스트림)          System.out (스트림)
		 *   8. 자바의 스트림 2가지 종류 구분 
		 *   1) 문자(텍스트)스트림
		 *      최상위 부모 클래스 : Reader ( 입력용 스트림)
		 *      최상위 부모 클래스 : Writer ( 출력용 스트림)
		 *      
		 *     1문자 == 유니코드 2바이트 == char
		 *        한 문자, 문자열, 문자 배열
		 *        
		 *      FileReader 문자단위로 처리하는 입력용 스트림
		 *      FileWriter 문자단위로 처리하는 출력용 스트림
		 *      
		 *      BufferedReader : 문자단위로 처리하는 입력용 스트림 ( 라인단위 처리)
		 *      BufferedWriter : 문자단위로 처리하는 출력용 스트림(  라인단위 처리)
		 *      
		 *      xxxx Reader -> 100 퍼 문자스트림
		 *      xxxWriter  -> 문자 출력 스트림 
		 *      
		 *   2) 바이트(이진)스트림  
		 *    최상위 부모 클래스 : InputStream ( 입력용 스트림)
		 *    최상위 부모 클래스 : OutputsStream ( 출력용 스트림)
		 *      
		 *      1바이트 (8비트)
		 *      바이트 , 바이트배열, 정수 (int) 
		 *      InputStream is = System.in; //바이트 스트림 
		         int nextbyte = System.in.read(); //0~255  -1
		         
		 *      xxxxInputStream
		 *      xxxxOutputStream 
		 *    9. 보조스트림 - 어떠 스트림의 IO을 더 쉽도록 보조 역할을 하는 스트림 
		 */
		
		/*
		파일 읽기(입력용) 스트림 
		FileReader 파일 읽기 (입력용) 스트림 
		FileWriter 파일 쓰기 (출력용) 스트림
		
		FileInputStream :파일 읽기(입력용) 바이트 스트림
		FileOutputStream : 파일 쓰기 ( 출력용) 바이트 스트림 
		*/
		
		/*
		BufferedReader;
		BufferedWriter;
		BufferedInputStream;
		BufferedOutputStream;
    */
		
		

	}

}
