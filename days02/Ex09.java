package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 정하영
 * @date 2023. 7. 14. - 오후 12:36:47
 * @subjct
 * @contents
 */
public class Ex09 {
 public static void main(String[] args) throws IOException {
	
	 String name ="홍기동"; // 왜 ? 
	 //바이크스트림-> 문자스트림 변환 -> 라인단위 처리 스트림변환
	 BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	 //Unhandled exception type IOException 예외처리
	 System.out.print("> 이름을 입력하세요 ? ");
	 name = br. readLine();
	 
	 System.out.printf("> 이름 : %s\n", name);
	 System.out.printf("> 이름 : %s\n", name);
	 
	  //String name = "정하영";
	  //BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
	  //System.out.print("> 이름을 입력하세요 ? ");
	 // name = br. readLine();


}
}
