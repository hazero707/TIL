package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.Stream;

public class Ex08_02 {

	public static void main(String[] args) throws IOException {
		
		String source = "package days25;\r\n"
				+ "\r\n"
				+ "import javax.swing.text.StyledEditorKit.ForegroundAction;\r\n"
				+ "\r\n"
				+ "public class Ex03 {\r\n"
				+ "      //                   0     1     2   3    순서 x \r\n"
				+ "	// enum Direction { EAST, SOUTH, WEST, NORTH }\r\n"
				+ "	\r\n"
				+ "	//                  문법 에러.\r\n"
				+ "	// enum Direction { EAST=100, SOUTH=200, WEST, NORTH }\r\n"
				+ "		\r\n"
				+ "	// 왜? The constructor Ex03.Direction(int) is undefined\r\n"
				+ "	//               생성자(1) X\r\n"
				+ "	// enum Direction { EAST(100), SOUTH(200), WEST(300), NORTH(400) }\r\n"
				+ "	\r\n"
				+ "	enum Direction{\r\n"
				+ "		EAST(100,\"▶\"),SOUTH(200, \"▼\"),WEST(300,\"◀\"),NORTH(400,\"▲\");\r\n"
				+ " \r\n"
				+ "		private final int value;\r\n"
				+ "		private final String symbol;\r\n"
				+ "		\r\n"
				+ "		/*\r\n"
				+ "		Direction(int value) {\r\n"
				+ "		   this.value = value;\r\n"
				+ "		 \r\n"
				+ "		}\r\n"
				+ "		*/\r\n"
				+ "\r\n"
				+ "		Direction(int value, String symbol) {\r\n"
				+ "			this.value= value;\r\n"
				+ "			this.symbol = symbol;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public int getValue() {\r\n"
				+ "			return value;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public String getSymbol() {\r\n"
				+ "			return symbol;\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		//추상 메서드 선언 가능 \r\n"
				+ "		//abstract int test(int i ); \r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		// [열거형에 멤버(필드, 메서드, 생성자) 추가하기] \r\n"
				+ "\r\n"
				+ "		// [열거형 구조 이해 ]\r\n"
				+ "	\r\n"
				+ "	\r\n"
				+ "	/*\r\n"
				+ "	 * 1.  enum Direction { EAST, SOUTH, WEST, NORTH}\r\n"
				+ "	 * 2. 컴파일러가 클래스 변환 \r\n"
				+ "	 *    class Direction extends Enum{\r\n"
				+ "	 *     static final Direction EAST = new Direction(\"EAST:);\r\n"
				+ "	 *     static final Direction SOUTH = new Direction(\"SOUTH:);\r\n"
				+ "	 *     static final Direction WEST = new Direction(\"WEST:);\r\n"
				+ "	 *     static final Direction WEST = new Direction(\"NORTH:);\r\n"
				+ "	 *     \r\n"
				+ "	 *     private String name;\r\n"
				+ "	 *     private int ordinal\r\n"
				+ "	 *     public int ordinal(){\r\n"
				+ "	 *     \r\n"
				+ "	 *     private Dirction(String name){\r\n"
				+ "	 *     this.name = name;\r\n"
				+ "	 *     }\r\n"
				+ "	 *     }\r\n"
				+ "	 */\r\n"
				+ "\r\n"
				+ "	//열거형 orinal() 메서드에 z해서 열거형 상수를 사용하는데 \r\n"
				+ "	//상수값은 0,1,2,3  순서를 반환.\r\n"
				+ "	// 내가 원하는 정수값을 설정해서 사용할 수 있다. \r\n"
				+ "	 Direction [] dirArr = Direction.values();\r\n"
				+ "	 for(Direction dir : dirArr ) {\r\n"
				+ "		 System.out.println(dir.name()+\"/\"+ dir.ordinal()+\"/\"\r\n"
				+ "				 +dir.getSymbol()+\"/\"+ dir.getValue());\r\n"
				+ "	 }\r\n"
				+ "	 }\r\n"
				+ "}\r\n"
				+ "/*\r\n"
				+ "EAST/0/▶ / 100\r\n"
				+ "SOUTH/1/▼ / 200\r\n"
				+ "WEST/2/◀ / 300\r\n"
				+ "NORTH/3/▲ / 400\r\n"
				+ "*/";

		//[문제] source 문자열에서 [29번째 라인의] 문자열을 line29 변수에 
		//저장한 후 출력하는 코딩.
		
		
		/*//[1]
		String [] datas = source.split("\r\n");
	String line29 =	datas[28];
	String line29 = source.split("\r\n")[28];
	System.out.println(line29);
	System.out.println("end");
		*/
		
		//라인단위 처리할 수 있는 보조스트림 : BufferedReader
		//[source -> XXXReader 문자스트림] -> 보조스트림 
		//Stromg stromgReader/StromgWriter 
		
		//[2]
		/*
		StringReader sr = new StringReader(source);
		BufferedReader br = new BufferedReader(sr);
		
		//br.skip(20);  // 라인이 아니라 문자를 20개 스킵함 
		
		String line29 = null;
		int i =1;
		while (i++<=20)  br.readLine();
		line29 = br.readLine();
		
		System.out.println(line29);
		/*
		br.readLine();
		br.readLine();
		br.readLine();
		br.readLine();
		br.readLine();
		br.readLine();
		*/
		
		//[3]
		String [] datas = source.split("\r\n");
		String line29 = Stream.of(source.split("\r\n")).skip(20).findFirst().get();
		System.out.println(line29);
		
		System.out.println("end");
		
		
	}

}
