package days24;

import java.util.Enumeration;
import java.util.Properties;

public class Ex02 {

	public static void main(String[] args) {
		// [Properties 컬렉션클래스]
		//setProperty() , getProperty()
		// key "user.dir" 
		//                                  . 현재디렉토리
		//                                  .. 상위 디렉토리 
		// 자바프로젝트명이 기본폴더로 잡힘    ~~~~~\\javaPro =  기본폴더 
		// E:\\Class\SS19Class
	//	String userDir = System.getProperty("use.dir");
	//	System.out.println(userDir);
		
		
		Properties sysProps = System.getProperties();
		Enumeration<Object> en = sysProps.keys();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = System.getProperty(key);
			System.out.printf(" %s : %s\n", key, value);
			
		}
	}

}
