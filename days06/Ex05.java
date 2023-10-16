package days06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int n;
		
		try (Scanner scanner =new Scanner(System.in)){
			//문자 x, 실수 x, 정수 입력
			//12ㅁ     3.14     1231 
			System.out.println("정수(n) 입력?");
			String inputData = scanner.nextLine();
			char [] idArr = inputData.toCharArray();
			
			boolean flag =false; //숫자 x ->true
			
			
			for (int i =0; i<idArr.length; i++) {
				//if(0 >
				if( !('0' <=idArr[i] && idArr[i] <='9')) {
					flag =true;
					break;
				}
					
			}
			if(!flag) {//flag ==false
				n =Integer.parseInt(inputData);
			} else {
				
				System.out.println("입력잘못!");
			}
			//n = scanner.nextInt();   //정수로 입력받는
			//System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
