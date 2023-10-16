package days12;


/**
 * @author 
 * @date 2023. 7. 28. - 오후 2:45:22
 * @subjct "가변배열 설명"
 * @contents 가변배열/ 행마다 길이가 다른 배열 
 */
public class Ex05_02 {

	public static void main(String[] args) {
		String [][] names =new String[3][30];
		names[0] = new String[25];
		names[1] = new String[30];
		names[2] = new String[30];
		
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.println("[]");
			} //for
			System.out.println();
		} //for

	}

}
