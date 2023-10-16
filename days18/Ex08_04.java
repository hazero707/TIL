package days18;

public class Ex08_04 {

	public static void main(String[] args) {
		String s = "안녕하세요 홍길동입니다. 홍길도이고, 홍길둥입니다. 홍길.입니다.";

		//"홍길동" -> "hong.gildong"
		//String regex 정규표현식 
		//s = s.replaceFirst("홍길동", "hong.gildong");
		//s = s.replaceAll("홍길동", "hong.gildong");
		
		//s = s.replaceAll("홍길.", "hong.gildong");
		//s = s.replaceAll("홍길\\.", "hong.gildong");
		//s= s.replaceAll("홍길[가~힣]", "hong.gildong");
		
		//s = s.replace('홍', '강');
		
		//업캐스팅
		CharSequence target = new StringBuffer ("홍길동");
		s=s.replace("홍길도", "xyz");
		
		System.out.println(s);
		
		
	}//main

}//class
