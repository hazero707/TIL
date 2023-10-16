package days03;


/**
 * @author 정하영
 * @date 2023. 7. 17. - 오후 2:26:48
 * @subjct 단항연산자 (연산자 우선순위높음)  ++  --  +  -  ~(비트부정연산자) ! (cast)
 * @contents
 */
public class Ex05_05 {
	public static void main(String[] args) {
	System.out.println(   +3);  //양수
	System.out.println(   -3);   //음수
	
	//비트부정(틸드)연산자  0->1   1->0
	System.out.println( ~5); //-6
	//                  0000 0101
	//                   1111 1010

	//-1                 1111 1001
	//1의 보수          0000 0110
	//                        6
	//                       -6       (자바에서 비트연산자르 쓸일이 거의없음)
	
	      // [-10 음수 저장 방법 ? 2의 보수법]
	}

}
