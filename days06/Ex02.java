package days06;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		
		int  code ;
		//Syntax error on token "continue", invalid VariableDeclaratorId    변수선언자 id 잘못됨
		//continue는 예약어 -> 변수명 사용할 수 없어요.
		//char continue ='y' ; //계속할지말지 여부를 확인하는것
		char con ='y' ;
		do {
			System.out.print(">한문자입력?");
			code = System.in.read();
	        System.out.printf("code = %c\n",(char) code);
	        
	        System.in.skip( System.in.available());
	        
	        System.out.printf("\n\n 계속할거냐?");
	        //br, 또는 scanner, 또는 System.in.read()  사용
	        code = System.in.read();  //'y' 'n'
	        con = (char)code;
	        System.in.skip( System.in.available());
		} while (con =='y' || con =='Y');
		System.out.println("end");
		
		
	/*	
		System.out.print(">한문자입력?");
		code = System.in.read();
System.out.printf("code = %c\n",(char) code);
	//system.in 키보드에서 읽어들이는 입력 스트림  ['a']'\r'[]['\n']
//a 엔터('\r'  '\n')
//  0~255 int      read()   next 1 byte
		
//System.in.read();  //enter 쳤을때 13번 값이 들어감 
//System.in.read(); //10
//System.in.skip(2);
System.in.skip( System.in.available());

		System.out.print(">한문자입력?");
		code = System.in.read();
System.out.printf("code = %d\n",(char) code);                     
		//one =(char) code;
		//System.out.printf("one= %c\n", one);
	}
	*/
	}
}

