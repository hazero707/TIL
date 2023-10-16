package days05;

import java.util.Scanner;

public class EX04_02 {

	public static void main(String[] args) {
		
		/*//
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum +=i;
					System.out.print(i);
			System.out.printf("%d+", sum);
		}
*/
		
		
		   //두 정수 사이의 합을 출력.
		int n,m,sum=0;
	try (Scanner scanner = new Scanner(System.in);){
		 System.out.println("> n, m input? ");
		 n= scanner.nextInt(); 
		 m= scanner.nextInt();
		 
		 for (int i =n; i <=m; i++);
//			 sum +=i ;
//			 System.out.printf("%d+" , i);
//	} {
		  System.out.printf("=%d\n", sum); 
		
//	}catch (Exception e)
	
		
	// [1]
    /*
    if (n > m) {
       for (int i = m; i <= n; i++) {
          sum += i;
          System.out.printf("%d+", i);
       } // for
    } else { 
       for (int i = n; i <= m; i++) {
          sum += i;
          System.out.printf("%d+", i);
       } // for
    } // if
    */
    
    // [2]
    /*
    if( n > m ) {
      int temp = n;
      n = m ;
      m = temp;
    } // if
    
    for (int i = n; i <= m; i++) {
       sum += i;
       System.out.printf("%d+", i);
    } // for
    */
    
    // [3]
    /*
    int min = n > m ? m : n;
    int max = n > m ? n : m;
    for (int i = min; i <= max; i++) {
       sum += i;
       System.out.printf("%d+", i);
    } // for
    */
	      //Math클래스 - 수학관련된 메서드(기능)
		  // Math.random()
		  //Math.min()
		  //Math.max()
		  int min = Math.min(n,m);
		    int max = Math.max(n,m);
		    for (int i = min; i <= max; i++) {
		       sum += i;
		       System.out.printf("%d+", i);
		    }
		       System.out.printf("=%d\n", sum); 
		    } // for
	}

	}
