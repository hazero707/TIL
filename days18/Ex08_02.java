package days18;

public class Ex08_02 {

	public static void main(String[] args) {
		// 암기
				String dir = System.getProperty("user.dir");
				System.out.println( dir );
				// "E:\Class\SS19Class\Workspace\JavaClass\javaPro"
				
				String sep = System.getProperty("file.separator")  ;  // "\\"
				
				String directory = "C:\\temp\\days09";
				String fileName = "Ex01.java";
				
				// char   directory.charAt(directory.length()-1) == '\\'
				// String directory.substring(directory.length()-1).equals("\\")
				
				String path ;
				if( directory.endsWith(sep) ) {
					path = directory + fileName;
				}else {
					path = directory + sep + fileName;
				} 
				
				System.out.println( path );
				//  "C:\\temp\\days09\\Ex01.java"
				 
			} // main

		} // class
