package days02;

public class Ex12 {
	public static void main(String[] args) {
		//문자형              char(2)
		//[집법변환]
		//16진수 01233
		byte b =10; // [101010]
		//int i = 10 // [0000000 0000000 0000000 00001010]
		
		char c = 'A';  // 2진수 (0,1)  65 -> ASCII 7bit ( 128문자)
		//자바 유니코드 2바이크 [0000000][01000001]
		//확장ASCII (8비트 256문자)
		//인코딩 (encoding) 'A' => 65변환
		//디코딩 (decoding) '65' =>'A'변환
		
		// '\u0000'~ '\uffff'
		// 16진수 61 -> 10진수? 
		char d = '\u0061';
		System.out.printf("d : %c\n" , d); // 'a'- 97, 'A'-65
		//대문자 - 소문자 65-97 =-32
		
	}
}
