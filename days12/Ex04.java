package days12;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		int [][] m = new int[5][5];
		
		//fillM(m);
		//fillM02(m);
		//fillM03(m);
		//fillM04(m);
		
		magicSquare(m);
		
		dispM(m);

	} // main

	// 마방진
	private static void magicSquare(int[][] m) {
		//1) 첫번째 행의 가운데 열 = 1
		//2-1) 출력값이 5의 배수라면 행만 증가 
		//2-2)                      x    행 감소, 열 증가  반복적으로 처리 
		//4)           ㄴ 행  -1행  -> 가장큰 행값
		//5)           ㄴ 열   5열 -> 가장 작은 열값
		
		int n=1;
		int row = 0, col= 2;   //행 , 열의 인덱스값을 저장할 변수
		while (n<=25) {
			m[row][col] =n;
			
			dispM(m);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 0.5초
			
			if (n%5==0) {
			row++;
			
			
		}else {
			row--; col++;
			if(col==5) col=0;
			else if(row ==-1) row=4;
			
		}
			n++;
		}
		
	}

	private static void fillM04(int[][] m) {
		/*
		0 [01][02][03][04][05]
		1 [10][09][08][07][06] 
		2 [11][12][13][14][15]
		3 [20][19][18][17][16]
		4 [21][22][23][24][25]
		*/
		/*
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				//if( i %2 ==0 ) m[i][j] =  5*i+j+1 ;
				//else           m[i][4-j]=  5*i+j+1 ;
				m[i][ i%2==0?j:4-j] =  5*i+j+1 ;
			} // for
		} // for
		*/
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				//if(i%2==0) m[i][j]= 5*i+j+1;
				//else m[i][j]= 5*(i+1) - j;				
				m[i][j]=  i%2==0? 5*i+j+1 : 5*(i+1)-j;
				 
			} // for
		} // for
		
	}

	private static void fillM03(int[][] m) {
		/*
		[05][10][15][20][25]
		[04][09][14][19][24]
		[03][08][13][18][23]
		[02][07][12][17][22]
		[01][06][11][16][21]
		*/
		// 00 40
		// 01 30
		// 02 20
		// 03 10
		// 04 00
		// 10 41
		// 11 31 
		// 12 21
		//  :
		/*
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-j][i] =  5*i+j+1 ;
			} // for
		} // for
		*/
		
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] =  5-i + 5*j ;
			} // for
		} // for
		
	}

	private static void fillM02(int[][] m) {
		// 12:00 수업시작
		/*
		[25][24][23][22][21]
		[20][19][18][17][16]
		[15][14][13][12][11]
		[10][09][08][07][06]
		[05][04][03][02][01] 
		for (int i = 0, n=25; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] =  n-- ;
			} // for
		} // for
		*/
		// 00    44
		// 01    43
		// 02    42
		// 03    41
		// 04    40
		// 10    34
		
		// 4-i   4-j
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-i][4-j] =  5*i+j+1 ;
			} // for
		} // for
		
	}

	private static void fillM(int[][] m) {
		/*
		[01][02][03][04][05]
		[06][07][08][09][10]
		[11][12][13][14][15]
		[16][17][18][19][20]
		[21][22][23][24][25]
		*/
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] =  5*i+j+1 ;
			} // for
		} // for
	}

	private static void dispM(int[][] m) {
	   System.out.println("\n\n\n\n");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			} // for
			System.out.println();
		} // for
		
	}

}
