package days04;

import java.util.Iterator;

public class Ex07 {

	public static void main(String[] args) {
	   
		/*
		int sum=0, i =1;
		for(    ;        ;      ) {  //무한루프
			if( i >10) break; //i가 10보다 크면 빠져나가겠다
			System.out.printf("%d+",i);
			sum +=i;               //sum = sum +i //The local  
		   i++;
		}
		System.out.printf("\b=%d\n",sum);
		
		System.out.println(i);
		*/
		
		/*
		int sum=0;
		for(  int i=1 , j=1 ,k=10  ;  i<=10 && k<=10 || j>-100      ; i++ ,j-- ,k+=2    ) {  //증감식 가능하다
			
			System.out.printf("%d+",i);
			sum +=i;               //sum = sum +i //The local  
		  
		}
		System.out.printf("\b=%d\n",sum);
		
		System.out.println(i);
		*/
		
		int sum=0;
		for(  int i=1  ;  i>=1  ; i--   ); {  
			//;쓰면 명령문만 무한반복
			//System.out.printf("%d+",i);
			//sum +=i;               //sum = sum +i //The local  
		  System.out.println("test");
		}
		System.out.printf("\b=%d\n",sum);
		
		//System.out.println(i);
	
		
	}

}
