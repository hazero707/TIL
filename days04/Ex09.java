package days04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		//국어 점수입력받아서 
		//    수우미양가 등급 출력
		// (if문 -> switch 문 변경)
		
		 int kor;
	      try( Scanner scanner = new Scanner(System.in) ){
	         
	         System.out.print("> 국어 점수 입력 ? ");
	         kor = scanner.nextInt(); 
	         char grade = '가';
	         
	         // 100           10
	         // 99~90          9
	         // 89~80          8
	         // 79~70          7
	         // 69~60          6 
	         // 59~0           0~5
	         switch ( kor/10 ) {  // key  변수, 수식 O
	         case 10: case 9:   //jdk 14이상을  case 10,9로 작성가능 
	            grade = '수'; break;	                    
	         case 8:
	            grade = '우'; break;
	         case 7:
	            grade = '미'; break;
	         case 6:
	            grade = '양'; break;
	         default:
	            grade = '가'; break;
	         } // switch
	         
	         System.out.println( grade);
	          

		}
		
		
	/*
			int kor;
			try (Scanner scanner = new Scanner(System.in);){
				System.out.print("> 국어 점수 입력 ? ");
				kor=scanner.nextInt();
			
			//중첨 if문
			//The operator <= is undefined for the argument type(S) boolean, int
			 char grade = '가';
			 
				if (0<= kor && kor<=100) {
					if (90<=kor) {
						//System.out.println("수");
					}
						else if (80<= kor) {
						//System.out.println("우");
						}
						else if (70<= kor) {
						//System.out.println("미");
						}
						else if (60<= kor ) {
						//System.out.println("양");
						}	
				
			 else {
					//System.out.println("가");
						grade = '가';
				}
				System.out.printf("kor=%d(%c)", kor, grade);
		}
				else {
					System.out.println("국어 점수 입력 잘못!!");
					
				}
			}
			 catch (Exception e) {
				e.printStackTrace();
		
			}
			*/
			
	}//main

}//class
