package util;

import java.util.Scanner;

public class Re1 {
	public static void main(String[] args) {
		int com , user; 
		//  for , while , [do~while]
		char con = 'y';
		
		try ( Scanner scanner = new Scanner(System.in) ) {
			
			do {
				System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
				// 4  a
				user = scanner.nextInt();
				com =  (int)(Math.random()*3)+1;
				String [] rockPaperScissors = { "",  "가위", "바위", "보" };
				
				System.out.printf("> 컴퓨터:%s, 사용자:%s\n"
						, rockPaperScissors[com], rockPaperScissors[user]);
				
				switch (user - com) {
				case 1: case -2:
					System.out.println("사용자 승리");
					break;
				case 2: case -1:
					System.out.println("컴퓨터 승리");
					break; 
				default:   
					System.out.println("무승부");
					break;
				} // switch
				
				// 다시 ... y
				System.out.print("> 게임 계속할거냐 ? ");
				con = (char)System.in.read();
				System.in.skip(System.in.available()); // 13, 10 
			} while (  Character.toUpperCase(con) == 'Y'   ); 
			 
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		
		System.out.println(" end ");
	} // main
		

}
