package days15;

//영업직 사원 클래스  최종(마지막) 클래스 
//final class 자식 클래스를 가질 수 없는 최종 클래스 

public class SalesMan extends Regular{

	//필드 - name , addr , tel , hiredate, basePAY
	//생성자 X
	// 메서드 - @dispEmpInfo(), @toString(), getPay()
	private int sales; //판매량
	private int comm;// 커미션 
	
	//생성자
	public SalesMan() {
		super();
		System.out.println("> salesMan 디폴트 생성자 호출됨");
	}


	public SalesMan(String name, String addr, String tel, String hiredate, int basePAY, int sales, int comm) {
		super(name, addr, tel, hiredate, basePAY);
		this.sales = sales;
		this.comm=comm;
		System.out.println(">SalesMan 7 생성자 호출됨.");
	
	}
	@Override
	public void dispEmpInfo() {
		
		System.out.printf("사원명 :%s, 주소 : %s 기본급: %d, 판매량 :%d, 커미션:%d\n ", this.getName(), this.getAddr(), this.getTel(), this.getHiredate(), this.getBasePAY(),this.sales, this.comm ); // 필기 다시 

		
	}
	

	
	@Override
 public int getPay() {
	 return super.getPay() +this.sales*this.comm;
 }
	
	
	
	
}
/*
The type Child cannot subclass the final class sales man 
class Child extends SalesMan

*/