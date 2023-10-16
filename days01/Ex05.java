package days01;

public class Ex05 {

	  public static void main(String[] args) {
		
		  //+덧셈연산자
		  System.out.println( 3+5 ); //8
		  
		  //+문자열연결연산자
		  String name = "정하영";
		  System.out.println( "이름:" + " name" );
		  		// "이름 : 정하영"
		  
		  //"문자열"+ 정수
		  //정수 + "문자열"
		  int age=20;
		  System.out.println( "나이 : " +age); // "이름 : 20"
		  
		  //이름은 정하영이고, 나이는 29살입니다.
		//+ ------------------>
		
		 System.out.println("이름은"+name + "이고, 나이는"+age +"살입니다.");
		 //이름은 "정하영"이고, 나이는 '29'살입니다.
		 System.out.println("이름은 \""+name +"\" 이고 ,\n 나이는 \'" +age+ "살 \'입니다.");
	
	 
		 
		 //System.out.printf("출력형식문자열", 출력할값,출력할값,출력할값..);
		 //                       format==출력형식
		 //name 문자열 출력할때 출력서식
	}//main
}//class
