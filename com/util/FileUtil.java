package com.util;

import java.io.File;

public class FileUtil {
	
	public static String getFileName( File f) {  // 파일 객체에서 차일 얻어오는 
	      String fileName = f.getName();
	      return fileName;
	   }
	   
	   public static String getFileName( String pathname ) {  // 경로에서 파일 ...?
	      int idx =  pathname.lastIndexOf("\\");
	      String fileName =     pathname.substring(idx+1);      
	      return fileName;
	   }
	   public static String getExtension(String fileName) {  
		      int idx = fileName.lastIndexOf(".");
		      String ext =  fileName.substring(idx);
		      return ext;
		   }
	   public static String getBaseName(String fileName) {  //순수한 파일명만 가져올때 
		      int idx = fileName.lastIndexOf(".");
		      String baseName =  fileName.substring(0, idx);
		      return baseName;
		   }
}
