package days10;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 정
 * @date 2023. 7. 26. - 오후 12:06:24
 * @subjct  배열 단점 -> 컬렉션 클래스
 * @contents 1) 배열크기 자동크기 중가/감소 
 * 
 */
//필기필요
public class Ex03 {

	static int index=0; //모든 함수에 사용할수있는 전역변수
	static Scanner scanner = new Scanner(System.in); //어디서든 접군할수 있는 
	static char con ='y';
		public static void main(String[] args) throws IOException {
			Scanner scanner = new Scanner(System.in);
			
			int [] m = new int[3];	 
			
			
			String [] menus = {"추가","수정","삭제","검색","조회","종료"};
			int selectedNumber ;
			
			while (true) {
				dispMenus( menus);
				selectedNumber = selectMenus(scanner);
				processMenus(selectedNumber,m);
			} // while
			

		} // main

		private static void processMenus(int selectedNumber,int []m) throws IOException {
			
			switch (selectedNumber) {
			case 1:  //main.m 배열에 값을 입력받아서 요소추가
				add(m);
				break;
			case 2: 
				System.out.println("배열에 요소 수정");
				break;
			case 5:  //모든요소
				list(m);
				break;
			case 6:
				exit();
				break;
			} // switch
			 
		}
		public static void 일시정지() {
		System.out.printf("아무키나 누르면 계속합니다.");
		try {
			System.in.read();
			System.in.skip(System.in.available());
			
		} catch (Exception e) {
			e.printStackTrace();
		}; //일시정지
		}
		
private static void list(int[] m) {
	System.out.println("[5.조회]");
	
if (index==0) {
	System.out.println("\t 추가된 요소가 없습니다.");
	return ;  //함수를 빠져나간다.
}  //if
	for (int i = 0; i < index; i++) {
		  System.out.printf("m[%d]=%d",i,m[i]);
		
	} //for
			System.out.println();
		}

		//m 배열에 요소를 추가하는 함수(메서드)
		private static void add(int[] m) throws IOException {
			System.out.println("[1.추가]");
			
			do {
				//배열크기 증가 코딩오는 위치
				//int index =3;
				if(index ==m.length) {
					
					int [] temp =new int [m.length +3];
					for (int i = 0; i < m.length; i++) {
						temp[i]=m[i];
					} //for
					m=temp;
				}
				//if(index==3) break;
				System.out.print("정수입력");
				int n =scanner.nextInt();
				m[index++]=n;
				
				System.out.printf("\t 요소추가 계속할거냐?");
				con = (char)System.in.read();
				System.in.skip(System.in.available());
				
			} while (Character.toUpperCase(con)=='Y' ) ;
			//while (Character.toUpperCase(con) =='Y' && index <3); 
				
			System.out.println(Arrays.toString(m) );
			
			}
			
		
		

		private static void exit() {
			System.out.println("\n\n 프로그램 종료합니다.~");
			System.exit(-1);
		}

		private static int selectMenus(Scanner scanner) {
			System.out.print("> 메뉴 선택하세요?");
			return scanner.nextInt();
		}

		private static void dispMenus(String[] menus) {
			System.out.println("[메뉴]");
			for (int i = 0; i < menus.length; i++) {
				System.out.printf("%d. %s\t", i+1, menus[i]);
			} // for
			System.out.println();
			
		}


	}


