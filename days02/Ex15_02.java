package days02;

public class Ex15_02 {
	
	public static void main(String[] args) {

		
	              int i =10;
	              
	              //int -> string
	              //10_> "10" 형변환
	              // [1] i+ ""
	              String si = i + "";
	              
	              String.valueOf(i);
	              
	              //[3]
	              si = Integer . toString(i);
	              
	              //"1010"
	              System.out.println( Integer.toBinaryString(i));
	             // System.out.println( Integer.toBinaryString(i, 2));
	              //"12"
	              System.out.println( Integer.toBinaryString(i));
	             // System.out.println( Integer.toBinaryString(i, 8));
	              //"a"
	              System.out.println( Integer.toBinaryString(i));
	             // System.out.println( Integer.toBinaryString(i, 16));
	              //
	} //main

}//class
