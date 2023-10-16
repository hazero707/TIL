package days07;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		

		int user;

		String  inputData;
		Scanner scanner = new Scanner(System.in);
		String regex="[1-3]";
		boolean flag =false;
		int failureNumber =0; //실패횟수 저장 변수 선언
		do {
			if(flag) {
				failureNumber++;
				System.out.printf("> [알림(%d)] 입력을 잘못(1~3)!!!\n",failureNumber);
				if( failureNumber==5) {
					System.out.println("\t [5번] 실패했기에 프로그램 종료!"); // break do~ while 빠져나갈대 /main 함수 빠져나갈때는 프로 그램 종료 return / 
					System.exit(-1); ////int status
					
				}
				
			}
			System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");
		inputData = scanner.next();
		flag = true;
		} while (! inputData.matches(regex) );
		user =Integer.parseInt(inputData);
		System.out.println(user);





	}//main
}
//class

