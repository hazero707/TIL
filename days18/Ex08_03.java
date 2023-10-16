package days18;

import java.util.Arrays;

public class Ex08_03 {

	public static void main(String[] args) {
		String s = "안녕하세요. 입니다. 입니다. 입니다";
		String name = "홍길동";
		/*
		//첫번째 "입니다." 을 찾아서 앞에 "홍길동" 
		//"안녕하세요. 홍길동입니다.입니다.입니다.";
		
		//int index = s.indexOf('입');  //int <- char 문제 없음
		int index = s.indexOf("입니다");
		s= s.substring(0,7) + name + s.substring(index);
		*/
		
		//(문제)
		//마지막 "입니다" 찾아서 그 앞에서 "홍길동"
		//"안녕하세요. 입니다. 입니다. 홍길동입니다."
		
		/*
		String [] sArr = s.split("입니다");
		System.out.println(Arrays.toString(sArr));
		*/
		
		/*
		int index = s.lastIndexOf("입니다"); // 뒤에서 부터 찾겠다.
		System.out.println(index);
		s=s.substring(0,index) + name + s.substring(index);
	    System.out.println(s);
	    */
		
		/*
		int firstIndex =0;
		int index = s.indexOf("입니다", fromIndex);
		System.out.println(index); //7
		fromIndex = firstIndex +"입니다".length();
		int index =s.indexOf("입니다", fromIndex);
		System.out.println(index);
		*/
		
		
		int fromIndex=0;
		int index=-1;
		while ((index = s.indexOf("입니다", fromIndex))!=-1) {
			System.out.println(index);
			fromIndex= index + "입니다".length();
		
		}
		
		//메서드 :indexOf()
		//매개변수 : String target, String sw, int no
		//리턴값 : int index;
		
		"abc".toUpperCase(); //"ABC"
		"Abc".toLowerCase();//"abc"
		
		//홍길동,김길동, 이길동,박길동".split()
		
		String [] nameArr = "홍길동, 김길동, 이길동, 박길동".split(",",2);
		for (int i = 0; i < nameArr.length; i++) {
			System.out.println(nameArr[i]);
		}
		
	
	        
	        
	    }
		

	}


