package days25;

//~ vo = Value Object   (클래스 명 뒤에  VO 붙이면 value Object )
//DTO, DAO , VO
//       값 읽기/쓰기 객체  
public class MemberVO {

	private String name;
	private String position;  // 팀장, 팀원
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MemberVO(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", position=" + position + "]";
	}
	
	
	
}
