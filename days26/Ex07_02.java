package days26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author user
 * @date 2023. 8. 18.오후 4:42:12
 * @subject  [직렬화 ] 객체를    스트림으로 만드는 것 
 * @content  [역직렬화] 스트림 -> 객체로 만드는 것 
 *             -객체를 직렬화해서 읽기/쓰기 할 수 있는 바이트 스트림 
 *             Object[InputStream]
 *             Object[OutputStream]
 *             -직렬화가 가능한 클래스로 만들기 위해서 단지 
 *              ㄴ Serializable 인터페이스르 구현만 하면 되다 
 */
public class Ex07_02 {

	public static void main(String[] args) {
		
		String pathname = ".\\src\\days26\\UserInfo.ser";
		try (
			FileInputStream out = new FileInputStream(pathname);
			ObjectInputStream ois = new ObjectInputStream(out);){
		
			//ois 스트림 -> UseInfo u1객체 (역직렬화)
			UserInfo u1 = (UserInfo) ois.readObject();
			UserInfo u2 = (UserInfo) ois.readObject();
			ArrayList<UserInfo > list =(ArrayList<UserInfo>) ois.readObject();
			
		    System.out.println(u1);
		    System.out.println(list);
			
			}
		 catch (Exception e) {
			e.printStackTrace();
		}
	}

}
