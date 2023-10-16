package days05;

public class Ex05 {

	public static void main(String[] args) {
		//조건문 : if 
		//분기문 : switch
		//반복문 : for
		//기타 : break, continue
		//조건반복문 : while, do while
		
		/*컬렉션
		
		/*[열거자] 반복해서 처리
		while (en.hasMoreElements()) {
			type type = (type) en.nextElement();
			
		}
		*/
		//[반복자] 반복해서 커리
		//while (it.hasNext()) {
		//	type type = (type) it.next();
		
		/*
		while (condition) {
			//조건식이 참이면 반복해서 {}블럭 실행.
			//조건식이 참일 동안 반복해서 {} 블럭 실행.
		} */
		
		//for 반복문과 while 조건반복문의 차이점
		//반복횟수         반복조건
		// 몇번해야된지 몰라서 계속해야된때 while 문  /정확히 5번째 ~하겠다 for 문사용
		
		//1~10까지 합 (while문)
		/*
		 * [1]
		int i =1, sum=0;
		while( i <=10) {
			sum +=i;
			System.out.printf("%d+",i);
			i++;   
		}
		System.out.printf("=%d\n",sum);
		*/
		/*
		//[2]
		int i =0, sum=0;
		while( i <=10) {
			/*
			if( i== 0) {
				i++;
		
				continue;
		} 
			//i++;   -> (i<9)
			System.out.printf("%d+",i);
			sum +=i;
			i++;   
		}
		System.out.printf("=%d\n",sum);*/
		
		
		//[3]
		int i =0, sum=0;
		while( ++ i <=10) {  //전위형 증감연산자
			//while( i++ <=10) {  후위형 증감연산자를 쓰면 +11 까지 됨
			System.out.printf("%d+",i);
			sum +=i;
			i++;   
		}
		System.out.printf("=%d\n",sum);
		}

	}


