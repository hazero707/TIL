package days04;

import java.util.Scanner;

/**
 * @author 정하영
 * @date 2023. 7. 18. - 오후 4:18:01
 * @subjct  컴퓨터 - 사용자랑 가위 바위 보 게임
 * @contents
 */
public class Ex10_4 {

	 public static void main(String[] args) {
	       
		 int com,user;

		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("> user 가위(1), 바위(2), 보(3) ? ");

			user = scanner.nextInt();
			com =(int)(Math.random()*3)+1;
		
		
			System.out.printf("> 컴퓨터 :%d, 사용자:%d\n",com,user);
			//1       ,2     ,3
			//가위    바위    보
			String[] rockpaperscissors = new String[4];  
			//[가위][바위][보]                 -> []
			//r[0]                                                      
			rockpaperscissors[0] = ""; 
			rockpaperscissors[1] = "가위";
			rockpaperscissors[2] = "바위";
			////사용자:java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 3번째가 범위를 넘어섬
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
				default: //case 0:
					System.out.println("무승부");
					break;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }


}
