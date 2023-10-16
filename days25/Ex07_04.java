package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex07_04 {

	public static void main(String[] args) {
		//파일 복사 
		String pathname = ".\\src\\days25\\Ex01.java";
		String copyPathname = ".\\src\\days\\Ex01_Copy.java";
		fileCopy_textStream02(pathname, copyPathname);
		

	}
	private static boolean fileCopy_textStream02(String pathname,String copyPathname) {
	long start = System.nanoTime();
     
	final int BUFFER_SIZE = 1024;
	
	try (FileReader fr = new FileReader(pathname);
	FileWriter fw = new FileWriter(copyPathname, true);
		//버퍼기능 + 보조스트림 사용해서 파일 복사 
		BufferedReader br = new BufferedReader(fr,BUFFER_SIZE);
		BufferedWriter bw = new BufferedWriter(fw,BUFFER_SIZE)
		){
		/*
			String line = null;
			int lineNumber =1;
			while ((line=br.readLine()) !=null) {
				System.out.printf("%d :%s\n", lineNumber++, line);
				bw.write(line);
				
			}
			*/
		 int code;
         while((code=fr.read()) != -1) {
            fw.write(code);
            System.out.println(code);
         }

		
		char [] cbuf = new char[BUFFER_SIZE];
		int readCharNumber=0;
		while ((readCharNumber = br.read(cbuf)) !=-1) {
			bw.write(cbuf,0,readCharNumber);
		}
		 System.out.println("파일복사 완료 ");
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n",(end-start));
			return true;
		

	
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	return false;
}
}