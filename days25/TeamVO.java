package days25;

//~ vo = Value Object   (클래스 명 뒤에  VO 붙이면 value Object )
//DTO, DAO , VO
//       값 읽기/쓰기 객체  
public class TeamVO {

	
	private String name; //팀명 1조, 2조, 3조
	private int totalNumber; //팀 총인원수 
	private String leaderName; //팀장명
	//private MemberVO leader;

	public TeamVO(String name, int totalNumber, String leaderName) {
		super();
		this.name = name;
		this.totalNumber = totalNumber;
		this.leaderName = leaderName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	
	public TeamVO() {
		super();
		
	}
	@Override
	public String toString() {
		return String.format("[%s(%d명)-%s]", this.name, this.totalNumber, this.leaderName);
	}
	
	@Override
	public int hashCode() {		
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		TeamVO vo = (TeamVO)obj;
		return super.equals(vo.name);
	}
	

	
	
	
}
