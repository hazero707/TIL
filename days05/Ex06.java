package days05;

/**
 * @author 
 * @date 2023. 7. 19. - 오후 3:46:26
 * @subjct while 조건반복문
 * @contents
 */
public class Ex06 {

	public static void main(String[] args) {
		int i =10, sum =0;
			while(i>=1) {
				sum +=i;
				System.out.printf("%d+",i);
				i--;
			
			}
  System.out.printf("%d\n",sum);
	}

}
