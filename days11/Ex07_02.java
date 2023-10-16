package days11;

/**
 * @author 정하영
 * @date 2023. 7. 27. - 오후 3:33:45
 * @subjct 다차원 배열은 배열의 배열이다.
 * @contents
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// 3차원 배열의 초기화
		int [][][] m =  {
				          {
				        	  
							  { 1,2,3,4}, 
							  { 5,6,7,8} 
					           
				          },
				          {
				        	  { 11,12,13,14}, 
							  { 15,16,17,18}   
				          }
						};
		
		dispM(m); // 3차원배열 m 출력하는 함수 
	} // main

	private static void dispM(int[][][] m) {
		
		for (int i = 0; i < m.length; i++) { // 면크기
			System.out.printf("[%d]면\n", i);
			for (int j = 0; j < m[i].length; j++) { // 행크기
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d ", i, j, k, m[i][j][k]);
				} // for
				System.out.println();
			} // for
			System.out.println();
		} // for
		
	}

}
