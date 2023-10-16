package days23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import days10.Ex06_04;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		//3반 30명 학생의 이,국,영,수,총,평,등,전등를 처리하는 코딩을 하세요.
		  //( 조건 : 컬렉션 클래스 선택 후 사용 )

		//1반 30 명
		ArrayList<Student> class1List = new ArrayList<>();  //한 반학생들 저장할수 있는 객체  1반 
		ArrayList<Student> class2List = new ArrayList<>();
		ArrayList<Student> class3List = new ArrayList<>();
		
		ArrayList<ArrayList<Student>> sistList = new ArrayList<>();  // 이 3반학생을 저장할수 잇는 객체 
		sistList.add(class1List);    //class1list.size 의 인원수 
		sistList.add(class2List);
		sistList.add(class3List);  
		
		char con = 'y';
		
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;

		Scanner scanner = new Scanner(System.in);

		int ban ;
		
		//학생 정보 입력하는 부분 
		do {
			// 1. 반 입력?
			System.out.printf("> 반 입력 ? ");
			ban = scanner.nextInt(); // 1 or 2 or [3]
			
			ArrayList<Student> classList = sistList.get(ban-1);
			

			// 2. 그 반의 학생 정보 입력 ? 
			//System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ? ", ban , sisList.get(ban-1).size() + 1);  
			System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ? ", ban , classList.size() + 1);  
			
			
			int no = classList.size()+1;
			name = Ex06_04.getName();
			kor = Ex06_04.getScore();
			eng = Ex06_04.getScore();
			mat = Ex06_04.getScore();

			tot = kor + eng + mat;
			avg = (double)tot / 3;
			wrank = rank = 1;

		Student s = new Student(no, name, kor,eng , mat, tot, avg, rank ,wrank );
		classList.add(s);

		
			// 입력 계속 
			System.out.print("> 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con) == 'Y' );
		
		
		// 출력 
		 // System.out.printf("\t\t학생 정보 출력( %d명 )\n", 총학생수);
		/*
		  int totalStudents=0;
	       Iterator<ArrayList<Student>> ir = sistList.iterator();
	        while (ir.hasNext()) {
	             ArrayList<Student> classList = ir.next();          
	             totalStudents += classList.size();
	         } //while
	       System.out.printf("\t\t학생 정보 출력( %d명 )\n", totalStudents);
	       */
		
		System.out.println("-".repeat(10));
		 // sistList.stream().mapToInt(classList->classList.size()).forEach(학생수->System.out.println(학생수));
		// 반에 대당하는 하나하나  ArrayList rk 몇몇 가지고 있는지를 새로운 스트림으로 만들겟다.
		// =                                             메서드 참조
		 // sistList.stream().mapToInt(ArrayList::size).forEach(System.out::println);   // 반에 대당하는 하나하나  ArrayList rk 몇몇 가지고 있는지를 새로운 스트림으로 만들겟다.
		  
		//=
		 int totalStudents = sistList.stream().mapToInt(ArrayList::size).sum();
		 System.out.printf("\t\t학생 정보 출력( %d명 )\n", totalStudents);
		 
		
		System.out.println("-".repeat(10));
		  Iterator<ArrayList<Student>> ir = sistList.iterator();
		ban=1;
		while (scanner.hasNext()) {
			ArrayList<Student> classList = ir.next();
		
			 System.out.printf("[%d반 학생 : %d명 ]\n", ban++,classList.size());
			
			 Iterator<Student> ir2= classList.iterator();
			 while (ir2.hasNext()) {
				Student s =  ir2.next();
				System.out.println(s); //s.toString()
				
			}
		}
	}

}
