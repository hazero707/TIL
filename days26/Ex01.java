package days26;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author user
 * @date 2023. 8. 18.오전 9:01:36
 * @subject  Data[InputStream]/Data[OutputStream]
 * @content
 *          -기본형 8가지 읽기/쓰기 가능한 바이트 스트림 
 */
public class Ex01 {

	public static void main(String[] args) {
		String name ="이지현";
	    int kor = 87, eng=79, mat=40;
	    int tot = kor + eng + mat;
	    double avg = (double)tot/3;
	    boolean gender =true;
	    
	    //원하는 번호의 학생 정보를 student[.txt] 파일에 저장
	    //FileWriter 문자 파일 스트림 
	  //BufferedReader 문자 보조스트림 
	    
	    String fileName = ".\\src\\days26\\student.txt";
	    try (FileWriter out = new FileWriter(fileName,true);
	    		BufferedWriter bw = new BufferedWriter(out) ){
			
	    	String data = String.format(" %s,%d,%d,%d,%d,%f,%b\n", name, kor, eng, mat, tot, avg, gender);
	    	bw.append(data);
	    	bw.flush();
	    	System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
          System.out.println("end");
	}

}
