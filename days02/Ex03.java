package days02;


/**
 * @author 정하영
 * @date 2023. 7. 14. - 오전 10:21:53
 * @subjct  지역변수 (Local Variavle) -시험문제1번
 * @contents
 */
public class Ex03 {
     public static void main(String[] args) {
     	 //String name, int , double
    	 //한 문자를 저장하는 자료형 : char
    	 //자바에서 문자를 나타낼 대는 '한문자'
    	 
    	 //코드영억(블럭)
    	 //{} 영역(범위) 연산자
    	 {
    		 char grade = 'A' ; //Local Variavle(지역변수)
    		 System.out.printf( "등급 : ' %c'",grade);
    	 
    	 }
	     //grade cannot be resolved to a variable
    	 // grade 변수를 선언x 인식x
    	 //System.out.printf( "등급 : ' %c'",grade);
}//main
}//class
