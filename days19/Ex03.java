package days19;

import java.io.UnsupportedEncodingException;
import java.util.StringJoiner;

/**
 * @author user
 * @date 2023. 8. 8.오전 11:29:08
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str ="가";
		byte [] bArr = str.getBytes("UTB-8");
		/*
		for (int i = 0; i < bArr.length; i++) {
			System.out.printf("[%02x]:", bArr[i]);  // 2자리 16진수로 주겠따
		System.out.println();
		*/	
		printByteArr(bArr); // 한글 한문자 : 3바이트 처리 
		// "가" -> 3바이트 UTF-8 byte[] -> "가"
		String s =  new String(bArr, "UTF-8");
		System.out.println(s);
		
		bArr = str.getBytes("EUC-KR");
		printByteArr(bArr);   // 한글 한문자 : 2바이트 처리
		s =  new String(bArr, "EUC-KR");
		System.out.println(s);
	} // main
	
		//bye rPdufdmf 출력하는 함수 
		private static void printByteArr(byte[] bArr) {
			StringJoiner sj =new StringJoiner(":", "[","]");
			for (int i = 0; i < bArr.length; i++) {
				sj.add( String.format("%02x", bArr[i]) );
			
		}
			System.out.println( sj.toString() );

	}

}
