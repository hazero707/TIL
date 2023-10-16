package days14;

public class Ex11 {

	public static void main(String[] args) {
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document("자바문서.txt");
		Document doc4 = new Document();
		Document doc5 = new Document();
	

	}//main

}//class

class Document{
	String fileName; //문서명을 나타내는 것 
	static int count =1; //문서 번호
	{
		count++;
		System.out.println("인스턴스 초기화 블럭 실행...");
	}
	public Document() {
		//Cannot refer to an instance field count while explicitly invoking a constructor 생산자를 명시적으로 호출할때 참조할수 없다 
		this( String.format("Noname%d.txt", count));
		
		//Constructor call must be the first statement in a constructor  첫번째로 쓰
		//this(fileName);
		
	}
	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf("문서 \"%s\" 가 생성되었습니다 .\n", this.fileName);
	
	}
}
