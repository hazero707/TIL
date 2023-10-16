package days06;

public class Ex06_02 {

	public static void main(String[] args) {
		
		//     3
		//k=1[2][3][4]
//		//k=2[5][6][7] 
//		//k=3[8][9] 
		for(int k =1; k<=3; k++) {
			for(int dan =3*k-1; dan <=3*k+1 && dan !=10; dan++) {
			//if(dan !=10)	System.out.printf("[%d]단\t",dan);
				System.out.printf("[%d]단\t",dan);
			}
			
			for(int i =1; i<=9;i++) {
				for(int dan =3*k-1; dan<=3*k+1; dan++) {
			//if(dan !=10)	System.out.printf("%d*%d=%02d\t",dan,i, dan*i);
					System.out.printf("%d*%d=%02d\t",dan,i, dan*i);              //두단으로 나눠서 두번으로 써줌 
		}
		System.out.println();
		
	
	
	}
			System.out.println();

		}
		
		
		/*
			// [구구단] while문 사용 변경
		int dan = 2;
		int i = 1;
		while (dan <= 9) {  // dan 2~9
			i=1;
			System.out.printf("[%d단]\n", dan);			
			//i=1;
			while( i <= 9 ) {
				System.out.printf("%d*%d=%d\n", dan, i, dan*i);
				i++;
			} // while			
			dan++;
			//i=1;
		} // while
		}//while
		*/
	//[2]
		/*
		for(int k =1; k<=2; k++) {
			for(int i =4*k-2; i <=4*k+1; i++) {
				System.out.printf("[%d]단\t",i);
				
			}
			System.out.println();
			for(int i =1; i<=9;i++) {
				for(int dan =4*k-2; dan<=4*k+1; dan++) {
					System.out.printf("%d*%d=%02d\t",dan,i, dan*i);
		}
		System.out.println();
		
	
	
	}
			System.out.println();

		}
		*/
	}
}
