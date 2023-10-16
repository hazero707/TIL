package days05;

import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		int  code ;
		char one;
		
		System.out.print(">한문자입력?");
		code = System.in.read();
System.out.printf("code = %d\n", code);
		//one =(char) code;
		//System.out.printf("one= %c\n", one);
		
//System.in.read();  //enter 쳤을때 13번 값이 들어감 
//System.in.read(); //10
//System.in.skip(2);
System.in.skip( System.in.available());

		System.out.print(">한문자입력?");
		code = System.in.read();
System.out.printf("code = %d\n", code);                     
		//one =(char) code;
		//System.out.printf("one= %c\n", one);
	}

}

