package days04;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
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
		
	}

}
