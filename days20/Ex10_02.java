package days20;

import java.text.MessageFormat;
import java.text.ParseException;

/**
 * @author user
 * @date 2023. 8. 9.오후 3:16:49
 * @subject  MessageFormat
 * @content  특정형식 <- 데이터(값) 출력 
 *           특정형식 -> 데이터(값) 읽기
 */

public class Ex10_02 {

	public static void main(String[] args) {
		
		String source ="이름:이준희,나이 :20살, 성별: true";
		String pattern = "이름:{0},나이 :{1}살, 성별: {2}"; //이름:이준희,나이 :20살, 성별: true
		
		//MessageFormat.format(pattern, args)   // 기억하기 편리함
		MessageFormat mf = new MessageFormat(pattern);
		try {
			Object [] objs = mf.parse(source);
			for (Object obj : objs) {
				System.out.println(obj);
				
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
