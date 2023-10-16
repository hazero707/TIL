package days17;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author user
 * @date 2023. 8. 4.오후 5:19:35
 * @subject  파일 읽어서 출력. + try~catch~finally 문
 * @content  한 문자 <- int fr.read()
 *           한 라인  BufferedReader 
 */
public class Ex2_03 {

	public static void main(String[] args)  {
		String fileName = "C:\\Setup.log"; 
		/*
		try ( Scanner scanner = new Scanner(System.in)) {
			
		} catch (Exception e) {
			// TODO: handle exception
		} // catch
		*/
		
		try ( FileReader  fr = new FileReader(fileName);
			  BufferedReader br = new  BufferedReader(fr);
			){ 
			 
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
		} 
		

	}

}
