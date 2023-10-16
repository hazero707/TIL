package days18;

public class Ex08 {

	public static void main(String[] args) {
		//[문자열 다루는 클래스]
		//String : 변경불가능한 클래스***
		//StringBuffer
		//StringBuilder
		//StringTokenizer

		String name="홍길동"; // new String("홍길동");
		name +="님";  // 힙영역에 인스턴스가 새로 만들어짐
		name +="안녕!!";   // 객체가 총 3개만들어짐
		
		System.out.println(name);
		
		//1. 
		System.out.println(name.length()); // 홍길동 문자열 길이 9 
		//2.name.length      필드 x
		//2.name.length()    메서드 o
		for (int i = 0; i < name.length(); i++) { // name 문자열의 값 하나하나
			System.out.printf("name[&d]='%c;\n", i, name.charAt(i));
			
		}//for
		//3.
		String rrn = "890223-1700001";
		System.out.println(rrn.substring(rrn.length()-1));
	//"1"
		System.out.println(rrn.substring(7)); //"1"
		
		//beginIndex<=,       <endIndex  비긴 인덱스는 포함  엔드인텍스는 안포함
		System.out.println(rrn.substring(0,2)); //0 부터 해서 end index 2번째 전까지  8,9 
		
		//4 정규식 페턴 일치 여부 체크 : String.matches()
		String regex ="\\d{6}-\\d{7}";    
		System.out.println(rrn.matches(regex));  //true
		
		//5. concat()
		String a = "ㅁㅁㅁ" + " ㅠㅠㅠ"+"xxx";
		String b = "ㅁㅁㅁ".concat("ㅠㅠㅠ")
		.concat("xxx");
		
		//6.
		//Stream rrn.chars();
		
		//7.  int 0  동일한 문자열이다 
		//-32 x
		//32 x
		//"A"65   "a"97  -32 
		//"a" 97 "A"65     32
		System.out.println("kenik".compareTo("kenik"));
		
		//8.
		System.out.println("kenik".equals("kEnik"));   //문자열이 같냐 다르냐??
		System.out.println("kenik".equalsIgnoreCase("KEnik"));
		
		//9  true, false
		boolean result = "안녀하세요. 홍길동입니다.".contains("김길동");
	    System.out.println(result); //false
	    
	    //10.
	    String url = "http://www.naver.com/test.jsp"; //끝에 jsp 로 끝나는지 아닌지 물어보고싶을때 
	    String suffix= ".html" ; //w접미사
	    String prefix = "http:\\";  //접두사
	   System.out.println( url.startsWith(prefix)); 
	   
	   System.out.println(url.endsWith(suffix)); 
	
		//int []m = {3,5,2,4,1};
		//System.out.println(m.length);
	}//main

}//class
