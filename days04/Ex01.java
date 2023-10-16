package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		//이름, 국어, 영어, 수학의 값을 입력받아서
		   /*총점, 평균을 계산하고 , 출력하기
		   ( 조건 : BufferedReader br을 사용해서 이름,국,영,수 한 번에 입력받아서 split() 하기. )
		   ( 조건 : 평균은 소수점 2자리까지 출력 )
		   출력형식 예)  이름="홍길동",국어=89,영어=78,수학=90,총점=257,평균=85.67
		   */
        String name;
    	int kor, eng, mat, total;
    	double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println( "> name, kor, eng, mat ? ");
    	//"이창익,89,34,22"
    	String inputData = br.readLine();
    	// 구분자 
    	//String regex = "\\s*, \\s*";  //자바는  역슬러수 두번
    	String regex = "[, ]";
        String [] datas = inputData.split("regex");


         name =datas[0]; 
         kor =Integer.parseInt(datas[1]);  //"90    " ->앞뒤공백제거   .trim()    kor =Integer.parseInt(datas[1].trim());
         eng =Integer.parseInt(datas[2]);
         mat =Integer.parseInt(datas[3]); 

         total = (kor + eng + mat);  
         avg = (double)total/3;                                            
         System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다."
        		 ,name, kor, eng,mat, total, avg );


	}

}
