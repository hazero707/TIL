package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author user
 * @date 2023. 8. 9.오후 12:42:36
 * @subject  add() /set () /roll () 차이점 정리 
 * @content  내일 시험 - 달력 그리고 캘린더 가져와 캘린더 개체로 요일 만들고 , 마지막날짜 ,c.add로 시험봄 
 */
public class Ex06_02 {

	public static void main(String[] args) {
		//2023. 8 
		Calendar c = new GregorianCalendar(2023,8-1,1);
		//하루 전 
		/*
		c.set(Calendar.DATE,0); //7.31  완전새로운 날짜를 원할 때 씀
		c.set(Calendar.DATE,-1); //7.30
		/c.set(Calendar.DATE, 5);
		//c.set(Calendar.DATE, 11);
		//c.set(Calendar.DATE, 32);
		*/
		
		//c.add(Calendar.DATE, -1); //  날짜에서 증가감소를 할때 씀 
		//c.add(Calendar.DATE, 1);//  필기 다시
		
		//c.roll(Calendar.DATE, -1);  x
		System.out.println(Ex05.getPatternDate(c, "yyyy-MM-dd")); 
	}

}
