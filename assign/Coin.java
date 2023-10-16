package assign;

public class Coin {
	public static void main(String[] args) {
	int money = 45484320;
	int restMoney = money;
	
	// 변수명 첫글자가 숫자가 될 수 없다.
	int count600 = 0;
	int count150 = 0;
	int count10 = 0;
	
	// 스탭 1
	count600 = restMoney/600;
	System.out.println("600원 : "+(restMoney/600)); // 180원 남음
	restMoney = restMoney%600;
	System.out.println("남은금액 : "+restMoney);
	
	// 스탭 2
	count150 = restMoney/150;
	System.out.println("150원 : "+(restMoney/150));
	restMoney = restMoney%150;
	System.out.println("남은금액 : "+restMoney);

	
	// 스탭 3
	count10 = restMoney/10;
	System.out.println("10원 : "+(restMoney/10));
	restMoney = restMoney%10;
	System.out.println("남은금액 : "+restMoney);
	
	// 마무리
	System.out.println("=====================");
	System.out.println(money+"의 최소동전 개수는?");
	System.out.println("600원 "+count600+"개");
	System.out.println("150원 "+count150+"개");
	System.out.println("10원 "+count10+"개");
	System.out.println("=====================");
}

}
