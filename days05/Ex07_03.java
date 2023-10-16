package days05;

public class Ex07_03 {

	public static void main(String[] args) {
		// 조건문 if
		//분기문 switch
		//반복문 for    [foreach]- 배열,컬렉션 반복처리
		//조건반복문 while, do~while
		//기타 break,continue

		//정수10개 저장할 배열 m을 선언
		int [] m = new int[10];
		//2.임의의 정수 (1~100)를 각 배열의 요소에 저장
		
    //    	0.0<=	double (int)Math.random()  <1.0
	//		0.0*100<=	double (int)Math.random() *100 <1.0*100  //하고난후 +1
	//		1<=	 (int)Math.random() *100+1 <101
		/*	
	m[0]=(int)Math.random() *100+1;
	m[0]=(int)Math.random() *100+1;
	m[0]=(int)Math.random() *100+1;
	m[0]=(int)Math.random() *100+1;
	m[0]=(int)Math.random() *100+1;
	m[0]=(int)Math.random() *100+1;
	m[0]=(int)Math.random() *100+1;
	m[0]=(int)Math.random() *100+1;
	m[0]=(int)Math.random() *100+1;
	m[0]=(int)Math.random() *100+1;
	m[0]=(int)Math.random() *100+1;
	*/
			for (int i = 0; i < m.length; i++) {
				m[i]=(int)Math.random() *100+1;
			} //for
	
	//3.for문을 사용해서 각 배열의 요소를 출력
	for (int i = 0; i < m.length; i++) {
		System.out.printf("m[%d]=%d\n",i ,m[i]);
	} //for
	
	//foreach 문 사용해서 출력
	for (int n : m) {
		System.out.println(n);
		
	}//foreach
	}//main

}//class
