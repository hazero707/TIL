package days26;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author user
 * @date 2023. 8. 18.오전 9:01:36
 * @subject  Data[InputStream]/Data[OutputStream]
 * @content
 *          -기본형 8가지 읽기/쓰기 가능한 바이트 스트림   보조스트림
 */
public class Ex02_02 {  //안됨 확인필요 

	public static void main(String[] args) {
		String name ;
	    int kor , eng, mat;
	    int tot;
	    double avg ;
	    boolean gender ;
	    
	    //원하는 번호의 학생 정보를 student[.txt] 파일에 저장
	    //FileWriter 문자 파일 스트림 
	  //BufferedReader 문자 보조스트림 
	    
	    String fileName = ".\\src\\days26\\student.dat";  // .dat -> data를 나타냄  /  .ini 초기설정파일이 들어가있는 파일 
	    try (FileInputStream in = new FileInputStream(fileName);
	    		DataInputStream dis = new DataInputStream(in)){
		name = dis.readUTF();
		kor = dis.readInt();
		eng = dis.readInt();
		mat = dis.readInt();
		tot = dis.readInt();
		avg = dis.readDouble();
		gender = dis.readBoolean();
		
		System.out.printf(" %s,%d,%d,%d,%d,%f,%b\n", name, kor, eng, mat, tot, avg, gender);
	    	
	    	
		} catch (Exception e) {
			e.printStackTrace();
		}
          System.out.println("end");
	}



}
