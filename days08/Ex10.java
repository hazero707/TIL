package days08;

public class Ex10 {

	public static void main(String[] args) {
		// 신용카드
		String card = "7655-8988-9234-5677";
		
		String regex ="-" ;
		String[] cardArr =card.split(regex);

		//0~3
		int index = (int) (Math.random()*4);
		cardArr[index] = "****";
		
		/*
		String printCard = System.format("%s-%s-%s-%s"
				,cardArr[0],cardArr[1],cardArr[2],cardArr[3] );
		System.out.println(printCard);
		*/
		String printCard = String.join("-", cardArr); //String.join () 함수 
		System.out.println(printCard);
		
		
		
		
		/*  
		 * 7655-****-9234-5677
		 * 7655-8988-9234-****
		 * ****-8988-9234-5677
		 * 7655-8988-****-5677
		 */
		
		
	}

}
