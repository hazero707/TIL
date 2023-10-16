package days10;

public class Ex03_02 {

	public static void main(String[] args) {
		int [] m =new int[3];
		m[0]=5;
		m[1]=3;
		m[2]=7;
		
		//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//m[3]=10;
		int index =3;
		if(index ==m.length) {
			
			int [] temp =new int [m.length +3];
			for (int i = 0; i < m.length; i++) {
				temp[i]=m[i];
			} //for
			m=temp;
		}

	}

}
