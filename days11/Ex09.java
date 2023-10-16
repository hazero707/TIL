package days11;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] lotto = new int [6];
     
// days08.Ex09_03.java 로또 코딩 예제
		
		fillLotto(lotto); //1~45까지 채워넣는 함수
		//lotto 배열을 출력하는 dispLotte() 함수선언 + 호출
		
		dispLotte(lotto);
		
	}//main
	//중복되지 않는 로또번호로 배열을 채우도록 코딩
	//while 중복되지 않게 6개 배열을 다 채울때까지
	//index=0

	private static void fillLotto(int[] lotto) {
		int index = 0;
		int lottoNumber =(int)(Math.random()*45)+1 ;
		lotto[index++]= lottoNumber;
		boolean flag =false; //로또번호가 중복이 되면 true 할당.
		
		while (index <=5) {
			flag = false; //
			lottoNumber =(int)(Math.random()*45)+1 ;
			
		//	System.out.print(lottoNumber+''\n');
			//중복확인
			for (int i = 0; i < index; i++) {
				if(lotto[i] ==lottoNumber) {
					flag =true;
					break;
				}
			} //for
		 if(!flag)lotto[index++]= lottoNumber;
		}
		
			
				
				
		
				}
					

		
		/*
	for (int i = 0; i < lotto.length; i++) {
			int lottoNumber = (int)(Math.random()*45)+1;
			lotto[i] =lottoNumber;
		}// for
		 */
		
	

	public static void dispLotte(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n", i,lotto[i]);
		} //for
		System.out.println();
	}

	}


