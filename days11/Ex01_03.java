package days11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex01_03 {

	public static void main(String[] args) {
//[2]  int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
//		   1)  m 배열의 max 값과  
//	   2)  max의 모든 index를 찾아서 배열에 저장 후 출력하는 코딩을 하세요. 
//	   [실행 결과]
//	   max = 92
//	   index =   1, 7, 15
		//암기하기
		 int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
	/*
 int max =m[0], maxCount =1;
 for (int i = 1; i < m.length; i++) {
	 if(max ==m[i]) maxCount++;
	 else if(max< m[i]) {
		max=m[i];
		maxCount =1;
	}
} //for
		 */
		 int [] mcArr = (int[]) getArrayMaxAndCount(m); // ?
	      
	      System.out.printf("> max:%d, maxCount:%d\n", mcArr[0], mcArr[1]);

	}

	private static Object getArrayMaxAndCount(int[] m) {
		 int max =m[0], maxCount =1;
		 for (int i = 1; i < m.length; i++) {
			 if(max ==m[i]) maxCount++;
			 else if(max< m[i]) {
				max=m[i];
				maxCount =1;
			}
		} //for
		//return new int[] { max, maxCount };
		int [] mc = new int[2];
		mc[0] =max;
		mc[2] =maxCount;
		return mc;
	}//main


		
} // class
