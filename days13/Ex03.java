package days13;

public class Ex03 {

	public static void main(String[] args) {
		 //1) Tv 클래스 선언 = Tv.java
	      //2) Tv 객체 생성
	      Tv tv1 = null;
	      tv1 = new Tv();//
	      //클래스 사용할때 NullPointException 에러가 제일 많이 발생함
	      //java.lang.NullPointerException
	      
	      //         멤버를 가리킬 때 v시험 봄
	      //객체명.필드명 v
	      //객체명.메서드명(); v
	      tv1.power();
	      System.out.println("Tv : " + (tv1.power ? "ON" : "OFF"));
	      tv1.channelUp();
	      System.out.println("현재 채널 : " + tv1.channel);
	      tv1.power();
	      System.out.println("Tv : " + (tv1.power ? "ON" : "OFF"));
	      System.out.println(" end ");

	   }//main

}
