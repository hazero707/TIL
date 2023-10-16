package days26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author user
 * @date 2023. 8. 18.오전 10:37:31
 * @subject Piped[Reader]/ Piped[Writer]
 * @content - 스레드 간에 데이터를 입/출력할 때 사용하느 스트림 
 *          -[Random  Access File]   //하나의 클래스로 읽기/쓰기 가능함 
 *            랜덤하게    +접근    + 파일 스트림 
 *            -파일의 어느 위치에나 [읽기/ 쓰기]가 가능한 장점이 있는 스트림.
 *            -DataOutput/ DataInput
 *             출력스트림        입력스트림 
 *             
 *             -seek( 위치 )
 *             -getFilePointer() 파일포인트 
 *            -readXXXX()
 *            -writeXXX()
 *            
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		String s ="I Love normal Java";
		String q = "javabook";
		
		String name=".\\src\\days26\\random.txt";
		String mode ="rw";  //read, write
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			
			long cp = raf.getFilePointer();
			raf.writeBytes(s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   //일시정지 + 엔터 계속
		System.out.println("> 엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available() );
	
	try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
		//임의의 위치로 이동 - 읽기/쓰기 
		raf.seek(7);
	
		raf.writeBytes(q);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("> 엔터치면 진행한다.");
	System.in.read();
	System.in.skip(System.in.available() );
	
	try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
		//임의의 위치로 이동 - 읽기/쓰기 
		raf.seek(2);
	 String line = raf.readLine();
	System.out.println(line);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("end");
}
}


