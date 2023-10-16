package days04;

public class Ex10_02 {

	public static void main(String[] args) {
		//0.0 *3 <=  Math.random*3  <1.0*3
		//1 <= (int) Math.random*3 +1  <4
		// 임의의 수 발생시키는 클래스.메서드
		for (int i =0 ; i <100; i++) {
			if (i <1 || i>4)
	    System.out.println(	(int)(Math.random()*3)+1 );
		}
	}

}
