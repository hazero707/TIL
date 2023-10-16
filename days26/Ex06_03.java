package days26;

import java.io.File;
import java.io.FilenameFilter;

import com.util.FileUtil;

public class Ex06_03 {

	public static void main(String[] args) {
		//days 폴더안에 java 파일 골라서 조회
		String pathname = ".\\src\\days26";
		File dir = new File(pathname);
		
		/*
		File [] list = dir.listFiles(new FilenameFilter() {			
			@Override
			public boolean accept(File dir, String name) {
				System.out.println(dir+"***"+name);
				return name.endsWith(".dat");
			}
		});
		
		*/
		//람다식 수정 
		File [] list = dir.listFiles((d,n)-> n.endsWith(".dat")); 
		for (File file : list) {
			System.out.println(file.getName());
		}
		
		/*[1]
		//String [] dir.list();
		File [] list = dir.listFiles();
		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				String fileName = list[i].getName();
				//.java
				if(fileName.endsWith(".dat")) {
					
				
				System.out.println(fileName);
				}
				//FileUtil.getExtension(fileName).equals(".java")
			}
			
		}
*/
	}

}
