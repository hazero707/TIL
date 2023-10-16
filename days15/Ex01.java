package days15;

import java.util.Arrays;



public class Ex01 {

	public static void main(String[] args) {
		String n = "keNik";   
		  String m= "kKnie";  
		  char [] nArr = n.toUpperCase().toCharArray();
			char [] mArr = m.toUpperCase().toCharArray();
			Arrays.sort( nArr ); 
			Arrays.sort( mArr ); 
			n =  String.valueOf(  nArr );
			m =  String.valueOf(  mArr );
			System.out.println(  n.equals(m)  );
		

		
		
		
		
		 /*[1]
		 
		  System.out.println(n+ "/" + m);
		  
		  n= n.toUpperCase();
		  m= m.toUpperCase();
		  
		  System.out.println(n+ "/" + m);
		  
		  //정렬 KENIK 문자열 정렬X
		  char[] nArr = n.toCharArray();
		  Arrays.sort(nArr);	  
		  System.out.println( Arrays.toString(nArr));
		  
		  char[] mArr = m.toCharArray();
		  Arrays.sort(mArr);
		  System.out.println( Arrays.toString(mArr));
		  
		  //char[] -> String n,m
		  n = String.valueOf(nArr);
		  m = String.valueOf(mArr);
		  
		  System.out.println(n+ "/" + m);
		  System.out.println( n.equals(m));
		  */
		  
	}

}
