package days12;

import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {		
		
		Scanner scanner = new Scanner(System.in);
		int [][] lottos;  
		System.out.print("> 로또 게임횟수 입력 ? ");
		int gameNumber = scanner.nextInt();   
		lottos = new int[gameNumber][6];
		
		for (int i = 0; i < lottos.length; i++) {
			fillLotto(lottos[i]);
		} // for
		
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%d 게임] ", i+1);
			dispLotto(lottos[i]);			
		} // for
		
		// 11:05 수업시작~
	} // main
 
	public static void fillLotto(int[] lotto) {
		int index = 0;
		int lottoNumber = (int)(Math.random() * 45)+1;		
		lotto[index++] = lottoNumber;
		boolean flag = false; // 로또번호가 중복이 되면 true 할당.
		
		while (index <= 5) {
			flag = false;
			lottoNumber = (int)(Math.random() * 45)+1;	//  12
			for (int i = 0; i < index; i++) {
				if( lotto[i] == lottoNumber ) {
					flag = true;
					break;
				} // if
			} // for
			
			if( !flag ) lotto[index++] = lottoNumber;			
		} // while
		
		 
	}

	public static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d]", lotto[i]);
		} // for		
		System.out.println();
	}


}
