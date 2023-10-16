package days01;

import days13.Tv;

public class Ex06_TvTest {

	public static void main(String[] args) {
		
		//Tv 클래스를 패키지 외부에서 [상속],참조 확인
		// days 13.tv
		//days01.Ex06_TvTest
		
		//Tv cannot be resolved to a type
		//default Tv 클래스를 패키지 외부에서 [상속],참조 x   // 접근지정자 때문에 못씀
		
		// Tv tv1 = new Tv();
		 //System.out.println(tv1.power);
		// 다른 패키지에서도 사용하려면 public  pakage 붙이ㄴ다 ???
	}

}
