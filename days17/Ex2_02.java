package days17;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author user
 * @date 2023. 8. 4.오후 5:19:35
 * @subject  파일 읽어서 출력 + try ~ catch finally 문 
 * @content   한문자
 *               한라인 
 */
public class Ex2_02 {
	public static void main(String[] args)  {
		String fileName = "C:\\Setup.log";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new  BufferedReader(fr); // 다형성, upcasting
			 
			String line = null;
			int lineNumber = 1;
			while(   (line = br.readLine()) != null    )  {
				System.out.printf("%d : %s\n", lineNumber++ , line);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {			 
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
					br.close();					
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // if
		}
		
		

	}

}
