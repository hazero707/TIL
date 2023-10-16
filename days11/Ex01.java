package days11;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//[2]  int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
//		   1)  m 배열의 max 값과  
//	   2)  max의 모든 index를 찾아서 배열에 저장 후 출력하는 코딩을 하세요. 
//	   [실행 결과]
//	   max = 92
//	   index =   1, 7, 15
		 int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		int max=m[0];
		for(int i=1; i<m.length ; i++) {
		if( max< m[i]) max =m[i];
		}
	
		System.out.printf("max =%d\n",max);
		
		
		//index=1,7,15
		/*
		String s ="inex=";
		for(int i=0; i<m.length ; i++) {
			if( max== m[i]) s +=i+",";
			}//for
		System.out.println(s.substring(0, s.length()-2)); // ,잘라주기
		*/  
		
		//배열추가
		int [] maxIndexArr =  new int [m.length]; //배열 최대
		int index=0;
		for(int i=0; i<m.length ; i++) {
			if( max== m[i]) maxIndexArr[index++]=i;
			}//for
		System.out.println(Arrays.toString(maxIndexArr));
		
	   // String.join(null, args)
		//index =1,7,15
		int [] arr=Arrays.copyOf(maxIndexArr, index);
		System.out.println(Arrays.toString(arr));
		
		//[2-2] 이렇게 풀면됨
		String s ="inex=";
		for(int i=0; i<m.length ; i++) {
			s +=i+",";
		}//for
		System.out.println(s.substring(0, s.length()-2));
		
	}//main


		
} // class
