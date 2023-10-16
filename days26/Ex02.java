package days26;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author user
 * @date 2023. 8. 18.오전 9:01:36
 * @subject  Data[InputStream]/Data[OutputStream]
 * @content
 *          -기본형 8가지 읽기/쓰기 가능한 바이트 스트림   보조스트림
 */
public class Ex02 {

	public static void main(String[] args) {
		String name ="이지현";
	    int kor = 87, eng=79, mat=40;
	    int tot = kor + eng + mat;
	    double avg = (double)tot/3;
	    boolean gender =true;
	    
	    //원하는 번호의 학생 정보를 student[.txt] 파일에 저장
	    //FileWriter 문자 파일 스트림 
	  //BufferedReader 문자 보조스트림 
	    
	    String fileName = ".\\src\\days26\\student.dat";  // .dat -> data를 나타냄  /  .ini 초기설정파일이 들어가있는 파일 
	    try (FileOutputStream out = new FileOutputStream(fileName, true);DataOutputStream dos = new DataOutputStream(out) ){
		dos.writeUTF(name);
		dos.writeInt(kor);
		dos.writeInt(eng);
		dos.writeInt(mat);
		dos.writeInt(tot);
		dos.writeDouble(avg);
		dos.writeBoolean(gender);
	    	
		dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
          System.out.println("end");
	}

}
