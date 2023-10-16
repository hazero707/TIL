package days23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		//Set : LinkedHashSet 컬렉션 클래스 
		// ㄴ   중복허용 x , 순서유지 o
		
		//List<Person> list = new ArrayList<Person>();
		
		//사람은 주민등록번호가 같으면 같은 객체 (사람) 중복x  
		Set<Person> s = new LinkedHashSet<Person>();   //set 은 중복을 허용하지 않는 특징이 있음 
		s.add( new Person("111111-1111111","김호영",23));  
		s.add( new Person("222222-2222222","박민석",23));
		s.add( new Person("333333-3333333","박정호",28));
		
		System.out.println(s.size());   // 3명 요소의 개수는 3명 
		
		s.add(new Person("222222-2222222","박민석",35));
		Iterator<Person> ir = s.iterator();
		while (ir.hasNext()) {
			Person p = ir.next();
			System.out.println(p);
		}
		

	}

}
class Person{
	
	String rrn;
	String name;
	int age;
	
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Person(String rrn, String name, int age) {
		super();
		this.rrn = rrn;
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + ", age=" + age + "]";
	}



	@Override
	public int hashCode() {
		return this.rrn.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;    // 필기 다시 
			return this.rrn.equals(p.rrn );
		}
				return false;
	}

	
	//hashcode()  rrn 오버라이딩
	//equals() rrn 오버라이딩  같은지 비료/ 함수 로 오버라이딩 해서 처리 
	
	
}
