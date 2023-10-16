package days07;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		int user;
		String inputData;


		Scanner scanner = new Scanner(System.in);
		do {System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");
			inputData = scanner.next();
		} while (!( inputData.endsWith("1") || inputData.endsWith("2")  ||    inputData.endsWith("3")) );
		user =Integer.parseInt(inputData);
		System.out.println(user);
		 *?
		 */
		
		//
/*
		int user;

		String  inputData;
		Scanner scanner = new Scanner(System.in);
		String regex="[1-3]";
		do {System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");
		inputData = scanner.next();
		} while (! inputData.matches(regex) );
		user =Integer.parseInt(inputData);
		System.out.println(user);
*/

		int user;

		String  inputData;
		Scanner scanner = new Scanner(System.in);
		String regex="[1-3]";
		boolean flag =false;
		do {
			if(flag) {
				System.out.println("> [알림] 입력을 잘못(1~3)!!!");
				
				
			}
			System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");
		inputData = scanner.next();
		flag = true;
		} while (! inputData.matches(regex) );
		user =Integer.parseInt(inputData);
		System.out.println(user);





	}



	/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");
		String inputData = scanner.next();

		if ( inputData.endsWith("1") || inputData.endsWith("2")  ||    inputData.endsWith("3")) {user=Integer.parseInt(inputData);

		}
	 */

	/*
		// 한문자를 대문자로 변환하는 베서더 : toUpperCase
		System.out.println(Character.toUpperCase('y'));
		System.out.println(Character.toUpperCase('y'));

		System.out.println(Character.toLowerCase('y'));
		System.out.println(Character.toLowerCase('y'));

		//String.toUppercase()
		System.out.println( ''aBc".toUpperCse());
				System.out.println( ''aBc".toLowerCse());
	 */
}


