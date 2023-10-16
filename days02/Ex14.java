package days02;

/**
 * @author 정하영
 * @date 2023. 7. 14. - 오후 3:30:16
 * @subjct
 * @contents
 */
public class Ex14 {
	public static void main(String[] args) {
		//ㄴ. 실수계열 - float(4), [double(8)]
		float f ; // [000000000....] 32비트
		double d ; // 64비트[[0][000000000 11지수] [00000000000000...52자리] 잘릴수 있기에 오차가 있는 자료형
		
		//10 -> 0000 1010
		// -10 -> 2의 보수법 -> 1111 0110
		// 'A' ->65-> 0000000000 01000001
		// 9.1234567 실수
		//1001.000111111001010111....
		//1.XXX x 2^n 정규화
		//1.00100011111100110........ x2^3
		//모든 실수 자료형 double 기본으로 사용하자. - 빅데시몰(오차가 없는)
		float pi = 3.14f;
		//Type mismatch: cannot convert from double to float
		//float pi = (float) 3.14;
		//double pi = 3.14;
		//                                   접미사 l(long)/ f / d      
		
		System.out.printf("pi = %f", pi);
	}

}
