package days19;

import java.io.FileReader;

public class Ex09_02 {

	public static void main(String[] args) {
		
		String path = ".\\src\\days19\\Ex01.java"; // .은 현재 디렉토리 
		//int [] 대 counts = new int [26];
		//int [] 소 counts = new int [26];
		//0행 : 대문자, 1행: 소문자 
		int[][]counts = new int[2][26];
		//counts[0] 'a','a'
		try(FileReader fr= new FileReader(path)){
			int code ;
			char one;
			while ((code = fr.read() ) !=-1) {
				//System.out.println(code);
				one =(char)code;
			
				if(Character.isUpperCase(one)) {
					counts[0][one-'A']++;
				}else if(Character.isUpperCase(one)) {
					
				}
				 //배열은 방이 0~25까지 있을텐데
			}//while
			
			//막대그래프
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("[%c]문자\n", i==0? '대':'소');
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf("%c(%d) :%s\n", i==0? j+'A':j+'a', counts[i][j],"#".repeat(counts[i][j]));
				}
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
