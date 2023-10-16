package days05;

/**
 * @author kenik
 * @date 2023. 7. 19. - 오전 11:26:58
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [문제] 한 라인에 10개씩 출력.
		// [문제] 라인번호를 붙이자.
		// ASCII 256가지
		// i=0
		
		// 1: 0 1 2 3 4 5 6 7 8  9 개행
		// 2: 10[][][][]][][][] 19 개행
		// 3: 20[][][][]][][][] 29 개행
		// [][][][][] 5
		
		// ASCII 10 개행  '\n'  LineFeed( LF )   새줄이동
		// ASCII 13 개행  '\r'  CarrageReturn( CR )
		// 엔터 == 개행 == '\r\n'
		for (int i = 0, lineNumber = 1; i < 256; i++) {
			
			//if( i%10 == 0) System.out.printf("%d : ", i/10 + 1);
			if( i%10 == 0) System.out.printf("%d : ", lineNumber++);
			
			
			// System.out.printf("%d-%c\n", i, (char)i); 			
			System.out.printf("[%c]", (char)i);
			if( i%10 == 9) {
				System.out.println();
			}
			
			
		} // for


	} // main

} // class






