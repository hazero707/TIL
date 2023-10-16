package days07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);
		System.out.print(">이등변 삼각형 행 갯수?");
		int row =scanner.nextInt();
		//행->열
		//3_>5
		//4->7
		//5->9
		//n->2*n-1
		int col = 2*row-1;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col;j++) {
				if(i+j>=row+1 && j-i<=row-1)System.out.printf("*");
			else System.out.printf("_");
		}
		System.out.println();
		
		
		//필기 다시하기
		
		/*
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col;j++) {
				if(i+j>=4 && j-i<=2)System.out.printf("*");
			}else System.out.printf("_");
			*/
		}
		System.out.println();
		
		
		/*
		int count ;
		int linenumber;
		try(Scanner scanner = new Scanner(System.in)){
			System.out.print(">행 갯수를 입력하세요?");
			
			for(i=1, count=1,;linenumber=1; i<=10;i++) {
				for (int i = 0; i < 6; i++) {
					for (int j = 5; j > 0; j--) {
						if (i < j) {
							System.out.print(" ");
						} else
							System.out.print("*");
					}
					System.out.println();
				}
			}
		}*/
		
		
		/*
		//String.repeat()
		System.out.println("*".repeat(1));
		System.out.println("*".repeat(2));
		System.out.println("*".repeat(3));
		System.out.println("*".repeat(4));
		System.out.println("*".repeat(5);
      
		for(int)
		
		*/
	}

}
