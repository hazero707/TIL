package days23;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Ex10_02 {

	public static void main(String[] args) {
		
		  String fileName = ".\\src\\com\\util\\jdbc.properties";
	      Properties p = new Properties();
	     
	      
	   
	      try(FileReader reader = new FileReader(fileName) ) {
	    	  
	    	  p.load(reader);  // 읽어올때 스는 메서드
	    	  
	    	  String className = p.getProperty("className")  ;        // 그안의 키값을 하나하나 읽어와서 실행     
		      String url = p.getProperty("url") ;                  
		      String user = p.getProperty("user");                                                                   
		      String password = p.getProperty("password") ; 
	    	  
	    	  System.out.println(className);
	    	  System.out.println(url);
	    	  System.out.println(user);
	    	  System.out.println(password);
	    	  
		
			
		} catch (Exception e) {
			System.out.println("Load End.");
			e.printStackTrace();
		}
	}

}
