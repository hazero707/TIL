package days11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex01_02 {

	public static void main(String[] args) {
//[2]  int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
//		   1)  m 배열의 max 값과  
//	   2)  max의 모든 index를 찾아서 배열에 저장 후 출력하는 코딩을 하세요. 
//	   [실행 결과]
//	   max = 92
//	   index =   1, 7, 15
		 int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
	
		 int max = 0;
		//람다 사용
		 /*
		 int max= Intstream.of(m).max().getAsInt();
		 System.out.printf("max =%d\n",max); //max 92 값
		 
		 int maxCount =0;
		 for (int i = 0; i < m.length; i++) {
			 if( m[i] ==max)maxCount++;
			 
			 
			
		} //for
		
		*/
		 int maxCount =(int) IntStream.of(m).filter(i-> i==max).count();
		 System.out.println("maxCount="+maxCount);
		 int [] maxIndexArr = new int[maxCount]; //??
		 
	}//main


		
} // class
