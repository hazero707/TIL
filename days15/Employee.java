package days15;

//[사원 클래스]
// 모든 사원들이 공통적으로 가져야할 멤버(필드, 메서드)를 구현한 클래스 
//

//추상메서드 



public class Employee {
	
	//필드
	private String name; //사원명
	private String addr; //주소 
	private String tel; //연락처 
	private String hiredate; //입사일자 
	
	//생성자


	public Employee() {
		System.out.println("> Employee 디폴트 생성자 호출됨.");
	}

	
	
	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	
	
	//메서드
	// 사원들의 정보를 출력하는 메서드
	public void dispEmpInfo() {
		System.out.printf("사원명 :%s, 주소 : %s, 연락처 : %s, 입사일자: %s\n", this.name, this.addr,  this.tel, this.hiredate);
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("사원명 :%s, 주소 : %s, 연락처 : %s, 입사일자: %s", this.name, this.addr,  this.tel, this.hiredate);
	}

	public int getpay() {
		return 0; 
		
		
		
		
	}



	public int getPay() {
		// TODO Auto-generated method stub
		return 0;
	}
}//class
