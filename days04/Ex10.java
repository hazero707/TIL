package days04;

import java.util.Scanner;

/**
 * @author 정하영
 * @date 2023. 7. 18. - 오후 4:18:01
 * @subjct  컴퓨터 - 사용자랑 가위 바위 보 게임
 * @contents
 */
public class Ex10 {

	public static void main(String[] args) {
		//가위(1), 바위(2), 보(3)
		//컴퓨터는 1~3 임의의 수를 발생
		// 사용자는 1~3 정수를 scanner 입력.
		int com,user;

		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("> user 가위(1), 바위(2), 보(3) ? ");
			//입력값에 대한 유효성 검사..
			user = scanner.nextInt();
			com =(int)(Math.random()*3)+1;
			
			
			/*                        /*        [사용자 - 컴퓨터]
       *   com/user   가위(1)    바위(2)    보(3)
       *     가위(1)        무          사(1)     컴(2)
       *     바위(2)      컴(-1)        무         사(1)
       *       보(3)       사(-2)     컴(-1)      무
       *       
       *       win
       *       사용자 : 1, -2
       *       컴퓨터 : 2, -1
       *       그 외 : 0
       */
		
			System.out.printf("> 컴퓨터 :%d, 사용자:%d\n",com,user);
			
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
