package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author 정하영
 * @date 2023. 7. 17. - 오전 8:32:26
 * @subjct
 * @contents
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		String name = "홍길동";
		System.out.printf("%s\n",name);  //ctrl + alt +
		System.out.printf("[%s]\n",name);
		System.out.printf("[%10s]\n",name); //10자리를 확보하고 우측정렬
		System.out.printf("[%-10s]\n",name); //10자리를 확보하고 좌측정렬
		System.out.println();
		

		
		//byte, short, int , long %d %o %x 10진수 16진수 8진수
		int n =50;
		System.out.printf("%d\n",n); //50
		System.out.printf("%#o\n",n); //062   flag
 		System.out.printf("%#x\n",n); //0x32
 		
 		double pi =3.141592;
 		System.out.printf("%f\n", pi );
 		System.out.printf("%.3f\n", pi );   //자동 반올림 처리.
 		System.out.printf("[%10.3f]\n", pi );   //자동 반올림 처리.  10자리확보후 소수3자리까지
 		
 		int no =1; //0001
 		System.out.printf("%d\n", no);
 		System.out.printf("%04d\n", no);  //*** 기억) 4자리 앞에 0을 쓰면 빈자리 0으로 채워줌 
 		
 		System.out.printf("%d(%c)\n", 65,65);
 		System.out.printf("%1$d(%1$c)\n", 65);
 		//java.util.MissingFormatArgumentException: Format specifier '%c'
 	      //  형식 argument 빠졌다.
 		
 		System.out.printf("홍길동");
 		
// 		System.out.println("> 이름을 입력하세요 ? ");
// 		
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.next();  //(??)
//	    System.out.printf(">이름은 %s ", name);
 		

	    
	}//main

}
