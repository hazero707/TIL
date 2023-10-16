package days18;

public class Ex06 {

	public static void main(String[] args) {
		Person p1 = new Person("111","홍길동");
		//p1.clone();   복제 
		
			Person p1Clone;
			
			
			 p1Clone = p1.clone();  // 다움캐스팅 작업해야함 
			 System.out.println(p1.clone()); //공변반환타입 

			 /*
				try {
					p1Clone = (Person) p1.clone(); // 다운캐스팅
					System.out.println(p1Clone);
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				} 
				*/
			 /*
			 p1.notify(); 스레드 수업 
			 p1.notifyAll(); 스레드 수업
			 p1.wait(); 스레드 수업 
			 p1.wait(); 스레드 수업
			 p1.wait(0,0); 스레드 수업
			*/
			 //p1.finalize()   소멸자(생성자의 반대)  : 객체가 소멸될때 소멸자를 통하영 함 
	}

}
