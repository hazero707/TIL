package days15;

//[정규직] 사원클래스
public class Regular extends Employee{
	
    
   //[Object] 멤버들도 상속.
   //[Employee]
   //필드 - name, addr, tel, hiredate
   //생성자 X
   //메서드 - dispEmpInfo(), @toString()
                              //@오버라이딩

	private int basePAY; // 기본급


	public Regular() {
		super();
		System.out.println("> Regular 디폴트 생성자 호출됨.");
	}
	
	public Regular(String name, String addr, String tel, String hiredate, int basePAY) {
		// The field Employee.name [is not visible] 접근지정자
				// this.name = name;  X
				// this.setName(name); O
		super(name, addr, tel, hiredate); //부모 상속된 필드 초기화 (부모의 default 생성자를 호출하겠다고) 
 		this.basePAY = basePAY;
		System.out.println("> Regular 5 생성자 호출됨.");
	}

	
	// getter setter
	public int getBasePAY() {
		return basePAY;
	}



	public void setBasePAY(int basePAY) {
		this.basePAY = basePAY;
	}



	public Regular(int basePAY) {
		super();
		this.basePAY = basePAY;
	}
	
	@Override
	public void dispEmpInfo() {
		super.dispEmpInfo();
		System.out.printf("기본급: %d\n ", this.basePAY );
		
		System.out.printf("주강민", "서울양천구", "010-3123-2311", "2021.03.21", 400000000);
	}
	

	@Override
	public String toString() {
		
		return super.toString()+ String.format(", 기본급: %d\n ", this.basePAY);
	}
	
 public int getPay() {
	 return this.basePAY;
 }
	
	
}
