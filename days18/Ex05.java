package days18;

public class Ex05 {
	public static void main(String[] args) {
		//Object.equals()
		//Object.hashCode()
		//Object.toString()
		//Object.getClass()-객체의 클래스를 정ㅇ보를 담고 있는 class 인스턴스를 반환하는 메서드 
		Person p1 = new Person("111","홍길동"); 
		Class cls = p1.getClass();   //class 는 예약어는 식별자로 사용 못함 // p1 이라는 객체에 답고 있는 함 수 
		// 를 돌려주는 함수  어떤 정보로 했는지 리턴해주는 함수 get class
		
		System.out.println(cls.getName());// days18.person 에 있는 네임
	    System.out.println(cls.getSimpleName());// 패키지는 제외한 순수한 클래스 가 출력
	}

}
