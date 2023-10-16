package days10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex06_03 {

	public static void main(String[] args) {
		
		int [] tots = new int[10];
		int [] ranks = new int[10];
		
		Arrays.fill(ranks, 1);
		
		Random rnd = new Random();
		for (int i = 0; i < tots.length; i++) {
			// 0~300
			int tot = rnd.nextInt(301);  // 0<= int  <301
			tots[i] = tot;
		} // for
		
		System.out.println( Arrays.toString(tots));
		
		// 등수처리  4:02 수업시작~ 
		for (int i = 0; i < ranks.length; i++) {
			ranks[i] = 1;
			for (int j = 0; j < ranks.length; j++) {
				// if( i == j) continue; 
				// if( i != j && tots[i] < tots[j]) {
				if( tots[i] < tots[j]) {
					ranks[i]++;
				}
			} // for
		} // for
		
		
		System.out.println( Arrays.toString(ranks));
}
}