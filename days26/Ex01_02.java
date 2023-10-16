package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author user
 * @date 2023. 8. 18.오전 9:01:36
 * @subject  Data[InputStream]/Data[OutputStream]
 * @content
 *          -기본형 8가지 읽기쓰기 가능한 바이트 스트림 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		String name ;
	    int kor , eng, mat;
	    int tot;
	    double avg ;
	    boolean gender ;
	    
	    //한학생 정보를 student[.txt] 파일에 저장
	    //FileWriter 문자 파일 스트림 
	    //BufferedReader 문자 보조스트림 
	    String fileName = ".\\src\\days26\\student.txt";
	    
	    try (FileReader in = new FileReader(fileName);
	    		BufferedReader br = new BufferedReader(in) ){
			String line = br.readLine();
	    	// 임경재,87,79,80,246,82.000000,true
			//String.split(",")
			//MesseageFormat 형식화 클래스 사용 
			String pattern = "{0},{1},{2},{3},{4},{5},{6}";
			MessageFormat mf = new MessageFormat(pattern);
			Object [] datas = mf.parse(line);
			
			
			
			
			/*[1]
			//String = Object
			//Type mismatch: cannot convert from Object to String
			name = (String) datas[0];
			//Object -> 기본형 int 로 바꿈 (잘안됨)
			//Object -> String -> int 
			kor = Integer.parseInt((String)datas[1]) ;
			eng = Integer.parseInt(datas[1].toString()) ;  //예외 발생
			mat = Integer.parseInt(String.valueOf(datas[2])) ; // "null"
			
			avg= Double.parseDouble(datas[5].toString());
			
			gender = Boolean.parseBoolean(datas[6].toString());
			gender = Boolean.parseBoolean(s[6]);
			System.out.printf("%s %d %d %d %f %b\n", name, kor, eng, mat, avg, gender);
			
			
			 
			System.out.printf( "%s %d\n",name,kor);
			*/
			
			//[2]
			//Object [] --> String [] 변환 
			String [] s = Arrays.asList(datas).toArray(new String[datas.length]);
			
			name = s[0];
			//Object -> 기본형 int 로 바꿈 (잘안됨)
			//Object -> String -> int 
			kor = Integer.parseInt(s[1]) ;
			eng = Integer.parseInt(s[2]) ;  //예외 발생
			mat = Integer.parseInt(s[3]) ; // "null"
			
			avg= Double.parseDouble(s[4]);
			
			gender = Boolean.parseBoolean(s[6]);
			System.out.printf("%s %d %d %d %f %b\n", name, kor, eng, mat, avg, gender);
			
			
			
			System.out.printf( "%s %d\n",name,kor);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();                                                     
		}
          System.out.println("end");
	}

}
