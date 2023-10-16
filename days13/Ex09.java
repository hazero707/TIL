package days13;

/**
 * @author user
 * 
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		// 클래스 복사
		
		//클래스 복제 
		       
		        // 얉은 복제
		        // 깉은 복제 
		Point p = new Point();
		//개체명, 필드명
		//객체명, 메서드명
		p.x =100;
		p.y =200;
		
		//클래스 복사 (동일한 인스턴스 참조)
		
		Point pccopy = p;
		pccopy.x =1;
		
		System.out.println(p.x);
		
		//클래스 복사 (동일한 인스턴스 참도)
		Point pclone = new Point();
		pclone.x=p.x;
		pclone.y=p.y;
		

	}

}
