package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 정하영
 * @date 2023. 7. 14. - 오후 4:44:07
 * @subjct
 * @contents    
 */
public class Ex17 {
	
	public static void main(String[] args) throws IOException {
		//이름, 국어, 영어, 수학을 입력받아서 
		//총점, 평균을 계산하고
		//[출력형식]
		//홍길동ava string 을 byte로 변환님은 국:89 영:78 슈:56 총점:000 평균:00.00 이다.
		                                 //             short        double
		                                              
		                             String name;             
                                     byte kor; 
		                             byte eng;
		                             byte math;
                                     short total;
                                     double average;
                                     BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
                             		System.out.print(" > 이름을 입력하세요  ? ");
                             		name = br. readLine();
                             		System.out.print(">국어점수를 입력하세요 ? ");
                             		String inputData = br.readLine();
                            		kor = Byte.parseByte( inputData ) ; 
                            		System.out.print(">영어점수를 입력하세요 ? ");
                             		String s = br.readLine();
                                    eng = Byte.parseByte( s ) ; 
                                    System.out.print(">수학점수를 입력하세요 ? ");
                             		String c = br.readLine();
                                    math = Byte.parseByte( c ) ; 
                                    
                                    //Type mismatch: cannot convert from int to short
                                    total=(short) (kor+eng+math);
	                                average=(double)total/3;
	                                System.out.print("%s님은 국:%d 영:%d 수:%d  ");
	                                /*
	                                <메모장 시험>
	                                public static void main(String[] args) throws IOException {
	                                    // 이름, 국어, 영어, 수학을 입력받아서
	                                    // 총점, 평균을 계산하고
	                                    // [출력형식]
	                                    // 홍길동님은 국:89 영:78 수:56 총점:000 평균:00.00 이다.
	                                    // (5:25 풀이)
	                                    String name;
	                                    byte kor, eng, mat;
	                                    short total;
	                                    double avg;
	                                    
	                                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	                                    
	                                    System.out.print("1. 이름 입력 ? ");
	                                    name = br.readLine();
	                                    
	                                    System.out.print("2. 국어 입력 ? ");
	                                    kor = Byte.parseByte( br.readLine() );
	                                    
	                                    System.out.print("3. 영어 입력 ? ");
	                                    eng = Byte.parseByte( br.readLine() );
	                                    
	                                    System.out.print("4. 수학 입력 ? ");
	                                    mat = Byte.parseByte( br.readLine() );
	                                    
	                                    // Type mismatch: cannot convert from int to short
	                                    total = (short) (kor + eng + mat);
	                                    avg = (double)total/3;                                                //.2 소수 두번째까지
	                                    System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다."
	                                          ,name, kor, eng,mat, total, avg );
	                                          */
	                                
	        }


}
