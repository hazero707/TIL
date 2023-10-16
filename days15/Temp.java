package days15;

//임시직 사원 클래스 
public class Temp extends Employee{
 //필드 - name ,addr, tel , hiredate
	//생성자 x
	//메서드 - dispEmInfo(), @toString(), getter, setter
	private int days;  //근무일수 
	private int payOfDay; //하루일당
	
	//생성자
	public Temp() {
		super();
		System.out.println("> Temp 디폴트 생성자 호출됨");
	}
	public Temp(String name, String addr, String tel, String hiredate, int days, int payOfDay) {
		super(name, addr, tel, hiredate);
		this.days = days;
		this.payOfDay = payOfDay;
		System.out.println("> Temp6 생성자 호출됨");
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getPay() {
		 return this.days * this.payOfDay;
	}
	@Override
	public void dispEmpInfo() {
		System.out.printf("사원명 :%s, 주소 : %s, 연락처 : %s, 입사일자: %s\n", this.getName(), this.getAddr(),  this.getTel(), 
				this.getHiredate(), this.days,  this.payOfDay);
	}

}
