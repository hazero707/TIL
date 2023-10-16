package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 정하영
 * @date 2023. 7. 17. - 오후 5:19:03
 * @subjct 
 * @contents
 */
public class Ex12 {

	public static void main(String[] args) throws IOException {
		String name;
        int kor, eng, mat;
        int total;
        double avg;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //홍길동,90,78,99 엔터
        System.out.print("> 이름,국어,영어,수학 입력 ? ");
        String inputData = br.readLine();
        //System.out.println( inputData );
        
        // "홍길동,90,78,99" 구분자 콤마(,) 잘라내기  "홍길동","90","78","99"
        //1) 기능 2)배개변수 3)리턴값(리턴자료형)
        String [] datas = inputData.split(",");
        
        name =datas[0]; //"홍길동'
        kor =Integer.parseInt(datas[1]); //"90"
        eng =Integer.parseInt(datas[2]);// "78"
        mat =Integer.parseInt(datas[3]); //"99"
      //integer 여서 선언도 byte-> int 로 변경 

        total = (kor + eng + mat);  //totla short-> int 로 변경
        avg = (double)total/3;                                                //.2 소수 두번째까지
        System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다."
              ,name, kor, eng,mat, total, avg );

	}

}
