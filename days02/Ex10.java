package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Ex10 {
	public static void main(String[] args) throws IOException {
		byte age;
		age = 29;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print(" > 나이가 입력  ? ");
		String inputData = br.readLine();
		age = Byte.parseByte( inputData ) ;  //"20" 
	  
		System.out.printf("> 나이는 %d살입니다.", age);
		
		
		             //위에느 스트링으로 돌려줌/ Type mismatch  cannot convert from string to byte
		
		// 나이 정수 (0~125) byte,short, int ,long
	
		
	}

}
