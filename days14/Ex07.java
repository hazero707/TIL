package days14;



/**
 * @author user
 *        [static 키워드]
 *        필드 앞에 
 *        메서드 앞에
 *        클래스 앞에
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		
		//[우리반]-> 기업은행 -> 보통예금
		// Save 클래스 선언 : 저축 
		// 인스턴스 변수 -객체명.필드, 객체명.메서드
		//클래스 변수 - 클래스명.static필드
		
		//1. rate 이자율 왜 static 필드로 선언했나요?
		//== static 필드, 변수 어제 사용하나요?  -> 객체(인스턴스)가 생성될때마다 
		//필드가 필요할때 
		
		//2. 정적(static) 메서드 언제 사용하나요?
		//static 필드를 사용하기위해서 static 메서드를 만듦
		//2) 
		
		//The field Save.rate [is not visible ] 접근지정자 문제 
		System.out.println( Save.getRate());
		
		
		
		System.out.println();
		
		
		Save s1 = new Save("주강민", 1000,0.04);
		Save s2 = new Save("정하영", 1500,0.04);
		Save s3 = new Save("임경재", 34500,0.04);
		Save s4 = new Save("이지현", 5000,0.04);
		Save s5 = new Save("이준희", 21000,0.04);
		
		//Save.setRate(0.08);
		
				s1.setRate(0.06);
		
		s1.dispSave();
		s2.dispSave();
		s3.dispSave();
		s4.dispSave();
		s5.dispSave();
		
		/*
		//클래스 배열 선언
	   Save [] ss = new Save[5];
	   ss[0] = new Save("주강민", 1000,0.04);
	   ss[1]= new Save("정하영", 1500,0.04);
	   ss[2]=new Save("임경재", 34500,0.04);
	   ss[3]=new Save("이지현", 5000,0.04);
	   ss[4]=new Save("이준희", 21000,0.04);
	   
	   //클래스 배열 초기화 
	   Save [] ss= {
			   new Save("주강민", 1000,0.04),
			    new Save("정하영", 1500,0.04),
			   new Save("임경재", 34500,0.04),
			   new Save("이지현", 5000,0.04),
			   new Save("이준희", 21000,0.04),
			   
	   };
	   for (int i = 0; i < ss.length; i++) {
		   ss[i].dispSave();
		*/
		   
	}
	//for
	   	//[파악] 모든 사람의 이자율(rate) sms ehddlfgkf rjfkrh...
	   //Save 객체가 생성될 때 마다 rate ( 8byte) 필드는 x
	   //Save 클래스 당 1개만 rate 
	}


