package days07;

public class Ex07 {

	public static void main(String[] args) {
		// 1. 1/2+2/3+3/4+ ... +8/9+9/10= ???
		//분자  1234  ~9
		//분모  234     10                i+1
		
		
		
		
		
		// 2.20개 항까지의 합을 구해서 출력
		//    1+2+4+7+11+16+...+191 = ???  규칙적인 수열 
		//       1  2  3  4    5    6...20개

		double sum=0;
		for(int i=1;i<=9;i++) {
			sum +=(double)i/(i+1);
				System.out.printf("%d/%d+",i,i+1);
				
				
			
		}
		System.out.printf("=%f\n", sum);
		
	}

}