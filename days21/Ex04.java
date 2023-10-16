package days21;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex04 {  // 코드가 같은 에러가 뜸 

	public static void main(String[] args) throws ParseException {
		  String source ="번호:1,이름:홍길동,주소:서울 양천구 목동";  
		  int no;
		  String name;
		  String addr;
		  
		  //MessageFormat 형식화 클래스 x 
		  /*
		    int index =  source.indexOf("이름:");
		    System.out.println( index ); 
		    int beginIndex = index + "이름:".length();
		    int endIndex= source.indexOf(",", index);
		    name = source.substring(beginIndex, endIndex);
		    System.out.println(name);
		  */
		  
		  //MessageFormat.format(pattern, args)
		  String pattern ="번호:{0},이름:{1},주소:{2}";
		  MessageFormat mf = new MessageFormat(pattern);
		  Object [] objArr = mf.parse(source);
		  
		  //Type mismatch : cannot convert from Object to int 
		  //ClassCastException 클래스 형변환 x
		  
		  //E,R,S,T cast 형변환(상속관계)
		  //no = (int)objArr[0]; //1
		  
		  //"1->1
		  //() cast연산자, 강제형변환  //?????
		   no = Integer.parseInt( objArr[0].toString()); //1
		  name = (String) objArr[1]; //홍길동
		  addr = (String) objArr[2]; //주소
		  
		  System.out.println(no);
		  System.out.println(name);
		  System.out.println(addr);
		  
	
	}
	

}
