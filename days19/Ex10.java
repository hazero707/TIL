package days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {

	public static void main(String[] args) {
		// 정규표현식(regu Expression) = 정규식
		// String         regex
		//-문자열 속에 원하는 조검(패턴)과 일치하는 문자열을 찾아내기 위해서 사용된다.
		//- 미리 정의된 기호 
		//-자바 정규표현식과 관련 클래스 2개 밖에 없다.
		// String.matches(regex)
		//1) pattern 클래스 
		//2) Matcher 클래스 
		
		
		String [] data = {"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
                , "combat", "count", "date", "disc", "fx"};
		
		
		
		//1) data 배열에 들어있는 단어들 중에 
		//      c로 시작하는 단어를 모두 찾아서 출력 .
		//String regex ="c[a-zA-Z]*"; // C 시작 + 영문자 0이상 
		
		//String regex ="c[a-z]"; //c+ 소문자 1 개 ==(2문자)
		
		//String regex = "c\\w"; //  '\w'
		//String regex = "c[a-zA-Z0-9]";  // '\W'
		
		//String regex = ".*"; //  .모든문자 
		//String regex = "c.*t"; // 시작은 c 끝은 t 인 놈은 모두된다.
		//String regex = "c[0-9]";
		//=String regex = "c\\d"; //소문자 d 는 숫자를 뜻하고 
		
		//String regex = "c[^0-9]"; // [^  부정] 숫자는 아니여야 한다 
		//=String regex = "c\\D";   // 대문자 D 는 숫자가 아니여야 한다 
		
		//String regex ="(b|c).*"; // 두줄에 아무거나 와도된다
		//=String regex ="[bc].*"; // b가 오든지 c가 오든지 
		
		//String regex = "[bcd].{2}";//1개 
		//String regex = "[bcd].{2,3}";//2개 
		// String regex = "[bcd].+";    1개 이상
				// String regex = "[bcd].?";    1개 또는 0개
		
		//String regex = "[bcd].*";// b에서 d 까지 
		//=String regex = "[b-d].*";// "
		
		String regex = "[a-zA-Z&&[^b-d].*"; //알파벳 대,소문자 중에 bcd문자는 제외 + 모든 0~ 여러개
		
        //	    \\s 공백        \\S !공백
		
		Pattern p = Pattern.compile(regex);
		
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher( data[i]  );
			if( m.matches() ) {
				System.out.println( data[i] );
			}
		} // for 
		
		/*
		for (int i = 0; i < data.length; i++) {
			if (data[i].startsWith("C")) {
				System.out.println(data[i]);
				if( m.matches()) {
					System.out.println(data[i]);
				}
				
			}
		}
*/
	}

}
