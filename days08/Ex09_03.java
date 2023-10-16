package days08;



public class Ex09_03 {

	public static void main(String[] args) {
		// 로또 6개뽑을 배열 선언 및 생성
		//배열을 초기화 하지 않으면 int의 0으로 설정.(기억)
		
		int [] lotto = new int [6];
     
		
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
			//중복체크후 중복되지 않을때만
		if(isDuplicateLotto(lotto,lottoNumber, index))
			
		 if(!flag)lotto[index++]= lottoNumber;
		}
		
			
				
				
		
				}
					

		
		/*
	for (int i = 0; i < lotto.length; i++) {
			int lottoNumber = (int)(Math.random()*45)+1;
			lotto[i] =lottoNumber;
		}// for
		 */
		
	

	private static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i < index; i++) {
			if(lotto[i] ==lottoNumber) {
				return true;
			}
		}
		return false;
	}

	public static void dispLotte(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n", i,lotto[i]);
		} //for
		System.out.println();
	}

}
