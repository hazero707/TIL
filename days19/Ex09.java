package days19;

import java.io.FileReader;

public class Ex09 {

	public static void main(String[] args) {
		//days19. Ex01.java 파일을 읽어와서
		//알파벳 대소문자를 구분하지 않고 a~z 
		//배열에 저장 후 ### 막대그래프를 작성.
		//A(20) :######################
		//B(13) : #############
		// 상대경로 : .(현재디렉토리) == ~\javaPro
		//         ..(상위디렉토리) 
		String path = ".\\src\\days19\\Ex01.java"; // .은 현재 디렉토리 
		int [] counts = new int [26];
		//counts[0] 'a','a'
		try(FileReader fr= new FileReader(path)){
			int code ;
			char one;
			while ((code = fr.read() ) !=-1) {
				//System.out.println(code);
				one =(char)code;
				one = Character.toUpperCase(one);
				//'A' <= one&&one <='z'
				if(Character.isUpperCase(one)) {
					counts[one-'A']++; 
				}
				 //배열은 방이 0~25까지 있을텐데
				
			}//while
			
			//막대그래프
			for (int i = 0; i < counts.length; i++) {
				//System.out.printf("A(20) :######################");
				System.out.printf("%c(%d) :%s\n", counts[i],"#".repeat(counts[i]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
