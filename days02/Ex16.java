package days02;


/**
 * @author 정하영
 * @date 2023. 7. 14. - 오후 4:27:45
 * @subjct 형 변환
 * @contents
 */
public class Ex16 {
	
	public static void main(String[] args) {
		//1.자동 형변환 -2가지
		int i =10;      //      [][][][]
		
		long l =i;     // [][][][][][]
		System.out.println( l );
		float f = l;
		System.out.println(f);
		
		long L = l+i; // long + int +long
		//2.강제 형변환 
	// 3*(5+2)  ()최우선연산자
	// (변환하고자하는 타입) cast 연산자         캐스트강제형변환 
	    int a =20;
	    int b =3;
	    System.out.println( a/b ); //6.66666 몫 int/int => int
	    //                       ((double)a/b)           int/ double
	}

}
