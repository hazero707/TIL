package days25;

import java.io.File;
import java.io.FileReader;

/**
 * @author user
 * @date 2023. 8. 17.오후 2:19:31
 * @subject  스트림 
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		
		/*
		String parent = ".\\src\\days25";
		String child="Ex01.java";
		File f = new File(parent,child);
	*/
	
		//상대경로 
		String pathname = ".\\src\\days25\\Ex01.java";   //   경로 자바 에서는 \\
		//File 클래스 : 파일 , 폴더 (디렉토리) 를 다루는 클래스 
		//         다루다?  생성 , 이름변경 , 삭제, 정보 얻어오기 등등 할 수 있는 클래스 
		File f = new File(pathname);
		
		//파일크기               //파일인지 폴더인지 체크할때 쓰는 메서드 
	    System.out.println(f.isDirectory()); //false   폴더니?
	    System.out.println(f.isFile());  //true   파일이니?
	    
	    System.out.println(f.length()); //3759 파일의 크기를 나타냄 (단위는 바이트)
	    
	    long fileLength = f.length();
	    System.out.printf(">파일 크기는 : %d(bytes)\n",fileLength);
	    
	    try (FileReader fr = new FileReader(f)){
	    	/*
	    	fr.read();
	    	fr.read(char[], cbuf);
	    	fr.read(CharBuffer target);
	    	fr.read(cbuf, int offset, int length);
	    	*/
	    	int code ;
	    	
	    	//랑니단위로 처리하는 보조스트림을 사용하면 라인번호를 앞에 붙일 때 더 코딩이 편해질거다/
	    	while ((code = fr.read()) !=-1) {
	    		System.out.printf("%c",(char)code);	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
