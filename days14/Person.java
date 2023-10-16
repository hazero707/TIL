package days14;

public class Person {
	
	private String name;
	private int age;
	private boolean gender;
	
	//Alt + Shift + S context menu  
	
	
	public Person(boolean b) {
		gender = b;
	}
	public Person(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	//getter, setter 선언
	public void setAge(int n) {
		if(0<=n && n<+130) {
		age = n;
		}else {
			//강제로 예외(오류)를 발생
			//[예외처리] throw 문 - 강제로 예외 던지다
			throw new RuntimeException("Person.age 0~100 실행오류!!!");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	//필드를 
	
//	public boolean isGender() {
//		return gender;
//	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public char[] isGender() {
		// TODO Auto-generated method stub
		return null;
	}
		

}//class
