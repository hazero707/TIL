package days13;

public class Ex03_02 {

	public static void main(String[] args) {
		
		// 배열 에러
		// int [] m = new int[2];//m[0] m[1]
		//NullpointException  v시험
		int[]m = null;
		//ArrayIndexOutBoundsException
		m[2]=100;
		System.out.println(m[2]);

	}

}
