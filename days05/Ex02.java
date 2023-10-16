package days05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//"a"->'a' "a".charAt(0)
		
		//char ->string 변환
		//1) 'a' + ""
		//2) String.valueOf('a');
		//3) character.tostring('a');
		
		//String -> char 변환 x
		String name = "kenik";
		//원하는 위치의 한 문자를 얻어오고 싶다.
		//char answkduf. charAt(index)
		
		/*
		System.out.println( name.charAt(0));
		System.out.println( name.charAt(1));
		System.out.println( name.charAt(2));
		System.out.println( name.charAt(3));
		System.out.println( name.charAt(4));
		*/
		//System.out.println(문자열 , length());
		//System.out.println(neme , length());
		//for (int i = 0 ; i<5 ; i++) {
		//	System.out.println(name . charAt(i));
			
		//int len
			for (int i = 0 ; i<name.length() ; i++) {
				System.out.println(name . charAt(i));
				
				//문자열 다루는 메서드 함수
				///1. slpit()
				//2. length()
//				3.charAT()
//				4.valueOF
//				5.toString()
//  6.toCharArray() String->char[] 반환하는메서드
				}

	}

}
