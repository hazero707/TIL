package days07;

import java.util.Scanner;

public class Ex05_02 {

	public static void main(String[] args) {
		//정규표현식 
		// 국어점수(kor)을 입력받아서
		//0<=<=100
		//올바른 국어점수,잘못된 국어점수 출력...
		
		/*
		byte kor;
		Scanner scanner = new Scanner(System.in);
		System.out.println("> 국어점수를 입력하세요?");
		kor = (byte) scanner.nextInt();
		if(kor>=0 && kor<=100) { 
			System.out.println();
			
			*/
		//int [] kors = {99,1,100,101,-90,0};
		String kor ="999";
		//String regex = "\\d{3}"; //100~999
		//String regex = "\\d{1,2}|100"; //09
		//String regex = "100|[1-9]\\d|\\d"; //10~99
		//
		String regex = "100|[1-9]\\d";
		
		System.out.println(kor.matches(regex));
		
		
		
		}
	}


