package days18;

public class Ex07 {

	public static void main(String[] args) {
		//[객체로 부터 Class 객체를 얻어오는 3가지 방법]
		//1) 첫 번째 방법 : getClass() a메서드 

		/* 필기 다시 
		Card card = new Card("HEART",3);
		Class cls = card1.getClass();  
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		
		//2) 두번째 방법 : 모든 클래스명.class 클래스변수가 제공된다 
		Class cls = Card.class;
		System.out.println(cls);
		
			// => Class cls를 얻어와서 객체 생성
		try {
			Card card2 = (Card) cls.newInstance();
			System.out.println(cls);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		*/
		
		//3) 세번째 방법 : Class 클래스의 static메서드 - forName()
		String className = "days18.card";
		try {
			Class cls = Class.forName(className);  //위 문자열로부터 class 타입의 객체를 가져옴 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main

}//class

final class Card {
	String kind; // 카드 종류
	int num; // 카드 번호
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
	
