package days14;

//저축 관련 클래스 - static 키워드
public class Save {
	
	//필드 
	private String name = null ;// 예금주
	private int money = 0; //예금액
	
	//인스턴스가 생성될 때 마다 필드가 생성되지 않는다.
	//2. 클래스가 선언될 때 method 영역에 필드가 생성된다
	//   ( 객체를 생성하지 않아도 static 필드는 벌써 생성되어져 있다.)
	//3. 모든 인스턴스(객체)가 공유하는 필드된다. 
	//공유변수(필드), shared 병수, static 변수, 정적변수 , 클래스 변수
	private static double rate = 0.04; //이자율
	//생성자
	public Save() {}
	//Alt+shift +s
	//메서드
	public Save(String name, int money, double rate) {
		super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	//인스턴스 메서드 
	//static 메서드, 정적 메서드 
	public static double getRate() {
		return rate;
	}
	
	//Cannot use this in a static context    static 안에서 this 사용못함
	public static void setRate(double rate) {
		//3. 지역변수는 사용은 가능하다
		int n =10;
		
		//this.rate = rate;  //static 은 객체 생성 하지 않아도 사용할 수 있는데 this 는 그땐 사용못함 
	
		//2.인스턴스 변수 사용못함
		//Cannot make a static reference to the non-static field name 스테틱 안에서 사용못한다 
		//name = "홍길동";	
		
		//The assignment to variable rate has no effect  //Static 이 붙은 키워드는  .키워드 사용
		Save.rate = rate;
	}
	
	//메서드
	
	public void dispSave() {
		System.out.printf("> 예금주 : %s, 예금액:%d, 이자율:%.2f\n",this.name,this.money, this.rate );
	}

}// 필드 
