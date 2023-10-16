package days06;

import java.util.Arrays;
import java.util.Random;

public class Ex01_02 {

	public static void main(String[] args) {
		// 10개 정수를 임의의 값(5~15)으로 저장
		// 10개 정수를 임의의 값(0~10)+5으로 저장
		
		//5<= (int)(Math.random()*11)+5 <16
		
		Random rnd = new Random();
		
		//rnd.nextInt(int boune)
		
		
		int []m = new int[10];
		for (int i = 0; 5<= i && i <= 15; i++) {
		System.out.printf("m[%d]=%d\n",i ,m[i]);
		//m[i]=(int)(Math.random()*11)+5;
		m[i]=rnd.nextInt(11)+5;
			}
		
		//m 배열의 각 요소를 출력(확인)
		System.out.println( Arrays.toString(m));  //배열을 문자열로 반환하겠다는 to string
		
		//int max = m[0]; // 배열에 있는 가장 큰값 
		
	
		//int min =m[0];
		
		int max,min;
		max = min =m[0];
				
		for(int i=1; i<m.length;i++  ) {  //max m=0으로 저장되이씅 i=1부터
			if(max<m[i]){
				max= m[i];
				
			} else if(min>m[i]) {
				min=m[i];
				
			}
			System.out.println(max +"/" +min);
			}
			}
			
			
	



}
