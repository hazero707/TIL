package days07;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int com,user;
		//반복횟수 정해져있지 않으면 while
		//for , while,[ do while]
		char con ='y';
		 try (Scanner scanner = new Scanner(System.in)) {
				
			int failureNumber=0;
		do
		{ 
			/* 
			failureNumber++;
			System.out.printf(">[알림(%d)] 입력을 잘못(1~3)!!!");
			if(failureNumber==5) {
				System.out.println("\t [5번] 실패했기에 프로그램 종료!"); // break do~ while 빠져나갈대 /main 함수 빠져나갈때는 프로 그램 종료 return / 
				System.exit(-1);
				*/
				
			
			
			
			

			System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");

		user = scanner.nextInt();
		com =(int)(Math.random()*3)+1;
	
	
		System.out.printf("> 컴퓨터 :%d, 사용자:%d\n",com,user);
		
		String[] rockpaperscissors = new String[4];  
		                                   
		rockpaperscissors[0] = ""; 
		rockpaperscissors[1] = "가위";
		rockpaperscissors[2] = "바위";
		
		rockpaperscissors[3] = "보";
		
		System.out.printf("> 컴퓨터 : %s, 사용자 : %s\n"
				       ,rockpaperscissors[com-1], rockpaperscissors[user-1]);

		switch(user - com) {
		case 1 : case-2:
		   System.out.println("사용자 승리");
		   break;
		case 2 : case -1:
			System.out.println("컴퓨터 승리");
			break;
			default: 
				System.out.println("무승부");
				break;
				
			
		}
System.out.print(("게임 계속할거냐?"));
con =(char)System.in.read();
System.in.skip(System.in.available());	
		} while (Character.toUpperCase(con)=='Y');
		 }
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
		
		 
	
	


