package days05;

import java.io.IOException;

public class TES {
	public static void main(String[] args) throws IOException {
	//정수 n,m 을 입력받아서 두정수의 홀수의 합을 출력
		
		/*
		int n,m,sum=0;
		try (Scanner scanner =new Scanner(System.in)) {
			System.out.println("n,m intput?");
		n =scanner.nextInt();
		m =scanner.nextInt();
		int min =	Math.min(n, m);
		int max =	Math.max(n, m);
		if(min%2==0)min++;
		for(int i =min; i< max; i+=2) {
			sum +=1;
			System.out.printf("%d+",i);
		}
		System.out.printf("=%d\n",sum);
		}	
		*/
		
		//조건문 if 분기문 switch 반본문 for 기타 break continue
		//while 조건반복문
		/*
		int i =0, sum=0;
		while (++i<=10) {
			System.out.printf("%d+",i);
			sum +=i;
			i++;
		}
		System.out.printf("=%d\n",sum);
		*/
		
//10+9+8+....+1=55
		
		/*int i =10, sum =0;
				while(i>=1) {
					sum +=i;
					System.out.printf("%d+",i);
					i--;
				
				}
	  System.out.printf("%d\n",sum);
	  */
		
		//한문자 입력
		/*
		int  code ;
		char one;
		
		System.out.print(">한문자입력?");
		code = System.in.read();
System.out.printf("code = %d\n", code);
		
System.in.skip( System.in.available());

System.out.print(">한문자입력?");
code = System.in.read();
System.out.printf("code = %d\n", code);                     
//one =(char) code;
		
//정수10개 저장할 배열 m을 선언
	//int [] m = new int[10];
	
	//2.임의의 정수 (1~100)를 각 배열의 요소에 저장
//for (int i = 0; i < m.length; i++) {
	//m[i]=(int)Math.random() *100+1;

/*
 * char one; 
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("> 한 문자 입력 ? ");   
			String inputData = scanner.next();  
			one = inputData.charAt(0);  
			
			if ( Character.isDigit(one) ) {  // [0-9] == \d
				System.out.println("숫자");
			}else if ( Character.isAlphabetic(one) ) { // [a-zA-Z]
				System.out.println("알파벳");
			} else if ( '가' <= one  && one <= '힣' ) {
				System.out.println("한글");
				// 정규표현식   [#$!@]
			 } else if ( one == '#' || one == '$' || one == '!' || one == '@') {  // #$!%@
				System.out.println("특수문자");
			}else {
                System.out.println("X"); 
			} // if
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
 */
	
	}
}

