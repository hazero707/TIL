package days19;

import java.util.Date;

/**
 * @author user
 * @date 2023. 8. 8.오후 4:18:36
 * @subject  달력그리기 - Date 클래스 
 * @content
 */
public class Ex13 {

	public static void main(String[] args) {
		int year = 2023;
		int month =6;
		
		
		int dayOfWeek = getDayOfWeek(year, month, 1);
		int lastDay = getLastDay(year, month);

		//System.out.println(dayOfWeek+"/"+lastDay);
		
		Date d = new Date( year -1900, month-1, 1); //2023.8.1
		int date =d.getDate()-dayOfWeek;
		d.setDate(date); //시작 날짜 
		//System.out.println(d.toLocaleString());
		
		for (int i = 0; i <= 42; i++) {
			
			//System.out.println(d.toLocaleString());
			
		
			int m =d.getMonth()+1;
			//년,월,일 이 같은지 확인해야함 
			
			//System.out.printf(m==month?"%d\t":"(%d)\t", d.getDate());
			if(i%7==0)System.out.println();
			date=d.getDate()+1;
			d.setDate(date);      //getDate 와 setDate차이 ?
			System.out.printf(m==month?"%d\t":"(%d)\t", d.getDate());
			
			
			}
			
		
		
		
		
		}
		
	

	private static int getLastDay(int year, int month) {
		Date d = new Date( year -1900, month, 1);
		int date =d.getDate()-1;
		d.setDate(date);  
		return d.getDate();
	}

	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date( year -1900, month-1, date);
		return d.getDay(); //0(일_)~6(토)
	}

}
