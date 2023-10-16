package days06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("이름입력?");
			//name =scanner.next90;
			name =scanner.nextLine();
			//System.out.println(name);
			
	/*
			 char [] nameArr = new char[name.length()];
			 for(int i=0; i <nameArr.length; i++) 
				 
			nameArr[i] =name.charAt(i);
			
			System.out.println(Arrays.toString(nameArr));
			*/
			//char [] String.toCharArray()
			//1)String -> char [] 변환
			char [] nameArr =name.toCharArray();
			
			
		    //2) char[]  -> String 변환
			name =String.valueOf(nameArr);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
