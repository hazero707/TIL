package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author user
 * @date 2023. 8. 17.오후 3:50:31
 * @subject 실행 파일 복사 
 * @content 바이트 스트림 
 *          file 
 */      //필기 전부 다시 
public class Ex07_05 {

	   public static void main(String[] args) {
		      // 파일 복사
		      String pathname = "C:\\Users\\user\\Pictures\\Saved Pictures";
		      String copyPathname = "C:\\Users\\user\\Documents\\Saved Pictures";
		      
		      // > 복사 처리 시간(ns) : 34022000(ns)
		      
		      fileCopy_byteStream(pathname, copyPathname);
		   }

		   private static boolean fileCopy_byteStream(String pathname, String copyPathname) {
		      long start = System.nanoTime();
		      
		      final int BUFFER_SIZE = 1024;
		      
		      try(FileInputStream fis = new FileInputStream(pathname);
		         FileOutputStream fos = new FileOutputStream(copyPathname, true))
		        {
		        	 int b;
		        	 while( ( b = fis.read()) !=-1) {
		        		 fos.write(b);
		        		
		        		 
		        	 }
		        	 
		        
		        
		         System.out.println("파일 복사 완료!!!");
		         
		         long end = System.nanoTime();
		         System.out.printf("> 복사 처리 시간(ns) : %d(ns)\n", end-start);
		         return true;
		         
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		      return false;
		   }
		}