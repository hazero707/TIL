package days08;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex01 {

	//2
	public static void main(String[] args) {
		
		
		try (Scanner scanner = new Scanner (System.in)){
			int kor =getScore(scanner, "국어");
			
			//r국어점수의 등급을 출력
			char grade = getGrade(kor);
			System.out.printf("> kor=%d , grade=%c\n" , kor,grade);
			
			/*
			//int eng=getScore(Scanner,"영어");
			//int mat =getScore(Scanner, "수학");
			
			//System.out.printf("> kor%d, eng=%d, mat=%d\n" ,kor,eng,mat);
			 * */
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} //main                                    //t식별자
	public static char getGrade(int score) {
		char grade ='가';
		switch (score/10) {
		case 10: case 9 : grade='수';break;
		case 8:  grade='우';break;
		case 7:  grade='미';break;
		case 6:  grade='양';break;

		//default:
			//break;
		}
		
		return grade;
	}
	public static int getScore(Scanner scanner, String subject) {
		int score=0;
		boolean flag = false;
		String inputData;
		String regex = "100[1-9]?\\d";
		//try ( Scanner scanner = new Scanner (System.in)){  
			do {
				if (flag) {
					System.out.println("점수 입력 잘못(0~100). 다시");
					
				}
				
				System.out.printf("> %s 점수를 입력하세요", subject);
				inputData = scanner.next();
				
				flag = true;
			} while (! inputData.matches(regex) );
			score =Integer.parseInt(inputData);
			
			
			//score = scanner.nextInt();
			
	 
		return score;
	
	}
	//3  //Nosuchelement.존재하지 않는 값을 가져올때 


}

