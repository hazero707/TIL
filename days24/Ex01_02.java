package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import days25.MemberVO;

public class Ex01_02 {

	public static void main(String[] args) {
//		"1. Java 팀 구성.txt" 파일을 읽어와서
//		  
//		   Map 컬렉션 클래스 사용해서
//		      key : 1조, 2조, 3조
//		      value :  직위(급)과 이름을 저장하는 클래스를 선언하고
		//             MemverVO
//		               그 클래스 객체를 저장하는 컬렉션 클래스 사용   
//		   저장하고 출력하는 코딩을 하세요.    
//		1조
//		이경서, 신종혁(팀장), 이재영, 송해영 , 신기범, 이준희, 김성준 
//		2조
//		박민석(팀장), 유희진, 고경림, 임경재, 이지현 , 김정주, 김호영
//		3조
//		박정호(팀장), 이상문, 이주영, 정하영, 이동현, 주강민
		String fileName = ".\\src\\days19\\1. Java 팀 구성.txt";
		
		// 자바 IO ( Input , Output)
		//FileReader, BufferedReader(보조스트림)
		//FileWriter, BufferedWriter
		ArrayList<MemberVO>teamList = null;
		HashMap<String, ArrayList<MemberVO>> teamMap = new HashMap<>();
		String content = "";
		StringBuilder sb = new StringBuilder();	
		String line = null;
		
		try(FileReader reader = new FileReader(fileName);BufferedReader br = new BufferedReader(reader) ) {
			
			while ((line = br.readLine() ) !=null) {
				//System.out.println(line);
				//content +=line;
				sb.append(line + "\r\n");
				
			}
			content = sb.toString();
	     	System.out.println(content);
	     	
	     	/*
	     	String pattern = 
	     			   "{0}\r\n{1}\r\n"
	     			+ "{2}\r\n{3}\r\n"
	     			+ "{4}\r\n{5}\r\n";
	     			
	     			*/
	     	String pattern = 
	                  "{0}\r\n{1}(팀장),{2}\r\n";

	     	MessageFormat mf = new MessageFormat(pattern);
	     	Object [] datas = mf.parse(content);
	     	
	     	System.out.println(datas[0]); //1조
	     	System.out.println(datas[2]); //2조
	     	System.out.println(datas[4]); //3조
	     	
	     	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
	
		}
	    

}

