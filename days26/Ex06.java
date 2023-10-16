package days26;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		//[File 클래스]
		//1. 가장 많이 사용되는 입출력의 대상 - 파일 (중요) 
		//2. 파일 + 디렉토리 (폴더) 
		String pathname = ".\\src\\days26\\Ex01.java";
		//String pathname = "E:\Class\Workspace\JavaClass\javaPro\.\src\days26\Ex01.java"; // 절대경로 
		// 절대경로 확인필요 - 안됨 
		
		File file = new File(pathname);
		//file.isDirectory();
		//file.isFile();
		//file.islength();
		//file.isexists();
		
		//OS에서 사용하는 경로 구분자 
		System.out.println(File.pathSeparator);
		//OS에서 사용하는 이름 구분자 
	    System.out.println(File.separator); 
	    
	    //파일이름  Ex01.java 
	    String fileName = file.getName();
	   System.out.println(fileName);
	    
	   //확장자            .java
	   //확장자를 제외한 파일명 Ex01
	   int pos = fileName.indexOf(".");
	   System.out.println(fileName.substring(0,pos)); // 처음부터 포지션 까지 
	   System.out.println(fileName.substring(pos));  //포지션부터 끝까지 찾아오기 
	   
	   System.out.println(FileUtil.getExtension(fileName));
	   System.out.println(FileUtil.getBaseName(fileName));
	   
	   System.out.println("-".repeat(50));
	   //파일의 경로를 반환하는 메서드 String 
	   // . \src\days26\Ex01.java 
	   System.out.println( file.getPath());   //경로
	   System.out.println(file.getAbsolutePath());  //절대 경로
	   System.out.println(file.getCanonicalPath());  //표준경로 
	   
	   //       파일의  부모  디렉토리  
	   System.out.println(file.getParent());   //".\src\days26"
	   System.out.println(file.getParentFile()); // 객체 반환
	   //com.util.FileUtil.java 
	}

}
