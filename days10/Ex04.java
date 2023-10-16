package days10;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int [] m = { 3,5,2,4,1 };
		// [3, 5, 2, 4, 1]
		System.out.println( Arrays.toString(m));
		
		// [추가(append)]
		// [삽입(insert)]
		int index = 2;
		int n = 100;
		
		// m = [3, 5, 2, 4, 1]
		// [3][5][100][][][]
		int [] temp = new int[m.length+1];
		
		/* [1]
		System.arraycopy(m, 0, temp, 0, index);
		temp[index]=100;
		System.arraycopy(m, index, temp, index+1, m.length - index);		
		m = temp;
		*/		
		// [2]
		// m    [3, 5, 2, 4, 1]
		// temp [3][5][][2][4][1]
		for (int i = 0; i < m.length; i++) {
			if( index > i ) { temp[i] = m[i]; }
			else if( index <= i ) { temp[i+1] = m[i]; } 
		} // for
		temp[index] = 100;
		m = temp;
		
		// [3, 5, 100, 2, 4, 1]
		System.out.println( Arrays.toString(m));
	} // main


}//class
