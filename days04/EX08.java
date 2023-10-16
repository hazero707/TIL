package days04;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		// if whrjsans
		//for 반복문
		//swich 분기문
		
		
		//key : 변수, 수식 (정수,문자열,문자)
		//value : 리터럴, 변수x
		/*
		switch (key) {
		case value:
			break;
		case value:
			break;
		case value:
			break;
		[default:
			break;]
			}
			*/
		
		//정수를 입력받아서 짝수,홀수 출력-if/ifelse
int n;
		
		try (Scanner scanner = new Scanner(System.in);)  {
			System.out.print("> 정수입력 ?");
			n= scanner.nextInt();
	
			String  result = null ; //null 스트링의 기본값
			switch (n&2) {
			case 0:
				result = "짝수";
				break;
			case 1:
				result = "홀수";
				break;
			}// switch
			//The local variable result may not have been initialized 초기값 줘야함
			System.out.println(result);
			
		} catch(Exception e) {
		} //catch
		System.out.println(" end ");
		}

	}


