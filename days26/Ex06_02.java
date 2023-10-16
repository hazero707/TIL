package days26;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author user
 * @date 2023. 8. 18.오후 12:22:37
 * @subject  [javaPro 모든 하위 폴더, 파일 목록정보 조회]
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		String currentDirectory = System.getProperty("user.dir");
		//E:\Class\Workspace\JavaClass\javaPro
		//System.out.println(currentDirectory);
		
		File parent = new File(currentDirectory);
	    //System.out.println(parent.isDirectory()); //true
		/*
		String [] list =parent.list();    
		//File [] list = parent.listFiles();  // 파일을 배열을 돌림 
	    for (int i = 0; i < list.length; i++) {
			//System.out.println(list[i]);
	    	File f = new File(parent,list[i]);
	    	
	    	System.out.printf("%s\t%s\t%d\n",f.isDirectory()?"[폴더]":"파일",f.getName(),f.length());
		} //
	    */
		
		//long -> LocalDateTime 
		String pattern ="yyyy-MM-dd a hh:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
	    File [] list = parent.listFiles();
	    for (int i = 0; i < list.length; i++) {
	
	       //list[i].canWrite() - false
	       // long list[i].lastModified();---> Date
	    	Date date = new Date(list[i].lastModified());
	    	String 수정날짜 = sdf.format(date);
	    	
	    	System.out.printf("%s\t%s\t%d\n"
	    			,list[i].isDirectory()?"[폴더]":"파일"
	    			,list[i].getName()
	    			,list[i].length());
	    	
			
		}

	}

}
