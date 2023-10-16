package days10;

import java.util.Arrays;

public class Ex03_03 {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,};
		int [] arrCopy = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arrCopy));
	//필기필요
	
		int [] m =new int[3];
		m[0]=5;
		m[1]=3;
		m[2]=7;
		
		//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//m[3]=10;
		
		//m [1][2][3][4][5]
		//temp[[][][][]
		int index =3;
		
	
		if(index ==m.length) {
			
			int [] temp =new int [m.length +3];
			System.arraycopy(m, 1, temp, 4, 2); // m 배열에서 1째거를 temp방 4 번째에 2번복사
			System.arraycopy(m, 1, temp, 0, m.length);
			//Arrays 클래스 : 배열을 다루기 쉽도록 기능이 구현된 클래스
			m=temp;
			} //for
	
	m[3]=10;
System.out.println(Arrays.toString(m));

	}

}
