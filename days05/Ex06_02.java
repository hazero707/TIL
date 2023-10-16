package days05;

import java.util.Scanner;

/**
 * @author
 * @date 2023. 7. 19. - 오후 4:03:00
 * @subjct
 * @contents
 */
public class Ex06_02 {

	public static void main(String[] args) {
		//두 정수 사이의 합을 구하는
		int n, m , sum =0;
		try ( Scanner scanner = new Scanner(System.in)){
			System.out.println("> n, m input");
			n=scanner.nextInt();
			m=scanner.nextInt();
			int min = Math.min(n,m);
			int max = Math.max(n,m);
			//for(int i=min%2==0?min+1:min; i <= max; i+2){
			if (min%2==0) min++;
			//int=min;
			while (min<=max) {
				sum +=min;
				System.out.printf("%d+",min);
				min +=2;
				
			}
			System.out.printf("=&d\n",sum);

		} catch (Exception e){
			e.printStackTrace();

		}

	}
}
