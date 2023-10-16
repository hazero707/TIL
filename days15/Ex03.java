package days15;

import days13.Tv;

/**
 * @author user
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		ctv.channel =11;
		ctv.channelDown();
		System.out.println(ctv.channel);
		ctv.dispCaption("Hello world~");
		ctv.caption = true; //자막 on
		ctv.dispCaption("Hi~");

	}//main

}//class

//자막 + 기존 Tv클래스class CaptionTv extends Tv{
class CaptionTv extends Tv{
	boolean caption; // 자막 기능 on(true)/off(false)
	
	void dispCaption(String text) {
		if(this.caption) {
			System.out.println(text);
			
		}
	}
}