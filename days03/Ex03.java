package days03;

import java.util.Scanner;

/**
 * @author 정하영
 * @date 2023. 7. 17. - 오전 11:48:44
 * @subjct
 * @contents
 */
public class Ex03 {
	public static void main(String[] args) {
		
		// [입력형식] 이름 나이 국어 영어 수학 입력 ? 
	   // [출력형식] "홍길동" 20살 10 20 30 60 20.00 
		
		String name;
		int age, kor , eng, mat, total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("이름 나이 국어 영어 수학 입력 ?");
		name= sc.next();
		age = sc.nextInt();
		kor = sc.nextInt();
		eng= sc.nextInt();
		mat= sc.nextInt();
		total=kor+ eng +mat;
		avg= (double)total/3;
		//System.out.printf("\"홍길동\" 20살 10 20 30 60 20.00 ");
		System.out.printf("\"%s\" %d살 %d %d %d %d %.2f\n", name,age,kor,eng,mat,total,avg
				);
		
	}

}
