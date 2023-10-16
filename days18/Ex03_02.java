package days18;

//object 

public class Ex03_02 {

	public static void main(String[] args) {
		//주민등록번호가 같으면 동일한 사람(객체)이다.
		Person p1 =  new Person("111", "홍길동");
		Person p2 =  new Person("111", "홍길동");
		
		//3) Object.toString()
		//days18.Person@be11
		//패키지명, 클래스명 @해쉬코드의 16진수 값 
		System.out.println(p1.toString()); // Person [rrn=111
		System.out.println(p2.toString());
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
         // Person p2 = null;
		//Object-> equals() 메서드를 오버라이딩~
		//System.out.println(p1.equals(p2)); 
	}//main

}//class

//클레스의 객체가 복제(clone) 되도록 코딩  
class Person implements Cloneable{

	
	@Override
	public String toString() {
		
		return String.format("Person [rrn = %s, name=%s]", this.rrn, this.name);
	}

	String rrn;
	String name;
	
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}


	
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			Person p = (Person)obj; // 다운캐스팅
			return this.rrn.equals(p.rrn);
		}
		return false;
	}



	@Override
	public int hashCode() {
		return this.rrn.hashCode();  // 주민번호가 같으면 같은 객체라고 오버라이딩으로 출력 
	}


/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		return Objects.equals(name, other.name) && Objects.equals(rrn, other.rrn);
	}

	public int hashcode(){
		
	}


	//checked 예회


/*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		// return super.clone();
		
		Object obj = null;
		obj = super.clone();
		return obj;
	}
	*/
	
	//오버라이딩 조건(주의사항)  cf) 오버라이딩 조건에 안맞음 - Persond이 아니라 Object 여야함 
	//JDK1.5 공변반환타임(convariant return type) 추가  
	//오버라이딩 할때 조상 메서드의 반환 타입을 자식 클래스 타입으로 변경이 가능하다.
	@Override
	protected Person clone() {
		Person p = null;
		try {
			p = (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;

	}
	
}
	

	
	
