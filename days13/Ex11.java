package days13; //패키지 선언

import java.io.IOException;  //IOEEXCEPTION 예외처리를 위한 import문 
import java.util.Random; //랜덤한값  (점수 등) 을 생성하기위한 import문
import java.util.Scanner; // 스캐너로 입력받기위한 import 문 

public class Ex11 {  //클래스 선언 

	  //한 학생의 성적 관리 Student 클래스 선언
		
		//한반에 30명 학생의 성적처리 -> 클래스 사용 수정
		//EX06_04 
		public static void main(String[] args) throws IOException { //메인 메서드 선언 

			String name; // 변수 선언 
			int kor, eng, mat; //국영수 변수 선언 - int 타입으로 
			int tot; // 총합계 변수 선언 - 
			double avg; // 평균 변수 선언 - 실수형 double 타입
			int rank; // 등수  변수 선언 
			
			final int STUDENT_COUNT=30; //한박 학생수는 30명으로 고정된해서 선언

			//클래스 배열
			Student []  students =new Student[STUDENT_COUNT];  //반학생수를 담을 수 있는 배열선언
			
			
			
			Scanner scanner = new Scanner(System.in); //스캐너 사용 선언
			int count = 0;    //학생들 배열에 넣을 때 사용하는 변수 선언
			char con = 'y';   //계속해서 입력받을 것인지를 판단하는 변수 선언 
			
			
			
			
			
			int no=1;  //학생번호는 1번부터 시작하도록 초기값 설정 
			do {    // do-while 문  사용자가 y or Y선언시 계속 반복 
				System.out.printf("> 이름, 국어, 영어, 수학 입력? ");
				// scanner.next() = scanner.nextLine() 
				name = getName();  //scanner.nextLine();   //사용자고부터 정보를 받아들이는부분
				kor = getScore();
				eng = getScore();
				mat = getScore();	
				tot = kor + eng + mat;
				avg = (double)tot / 3;
				rank = 1;  //초기 등수는 1 로 설정 

				students[count]= new Student();  //학생정보를 배열에 저장함 
				students[count].no =no++;
				students[count].name =name;
			
				students[count].kor = kor;
				students[count].eng = eng;
				students[count].mat = mat;
				students[count].tot = tot;
				students[count].avg = avg;		
				students[count].rank = rank;

				count++;  // 그다음학생을 위해 증가 

				// 입력 계속 ? y 
				System.out.print("> 학생 입력 계속 ?");
				con = (char)System.in.read(); //사용자로 부터 y를 입력받을지 결정
			} while (Character.toUpperCase(con) == 'Y'); //y가 입력되면 반복 
	
			for (int i = 0; i < count; i++) { //입력받은 학생정보를 출력 
				students[i].printStudentInfo();
			}
			}
		     
		  public static String getName() { //학생 이름을 랜덤하게 받는 메서드 

		      Random rnd = new Random();      
		      char [] nameArr = new char[3];
		      for (int i = 0; i < nameArr.length; i++) {
		         nameArr[i] = (char)(rnd.nextInt('힣'-'가' +1) + '가'); //한국어로 이름을 생성함 
		      } // for

		      // char[] -> String
		      String name = String.valueOf(nameArr);  //*
		      return name;
		   }

		   public static int getScore() {       //0~100 사이의 랜덤한 점수를 반환하는 메서드 *근데 이거 왜반환하는 걸까?
		      return (int)(Math.random()*101);

	
	       }
		}
  
	
		   
		   
		   
		


		
		
		
		
		
		
		
	


