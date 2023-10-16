package days20;

import java.util.Date;

public class Ex03 {
// 필기다시 
	public static void main(String[] args) {
		// 개강일(2023.7.13 9:00:00)
				Date sday = new Date(2023-1900,7-1, 13,  9, 0, 0);
				//System.out.println( sday.toLocaleString());
				
				Date today = new Date();
				//System.out.println( today.toLocaleString());
				
				dispDiffDays(sday,today);
				
				// 11:03 수업 시작~ 
				/*
				System.out.println( sday.getTime()  ); // 1689206400000
				System.out.println( today.getTime()  );// 1691546628586		
				long diff = today.getTime() - sday.getTime();
				*/
				/*
				System.out.println( diff +"ms");
				System.out.println( diff/1000 +"s");
				System.out.println( diff/(1000*60) +"m");
				System.out.println( diff/(1000*60*60) +"h");
				System.out.println( diff/(1000*60*60*24) +"d");
				*/
				
				// ??일 ??시간 ??분 ??초 ???밀리세컨드
			} // main

			public static void dispDiffDays(Date sday, Date eday) {
				long diff = eday.getTime() - sday.getTime();
				long 몫 = diff/(1000*60*60*24);
				System.out.printf("%dd-", 몫);
				diff %= (1000*60*60*24);
				
				몫 = diff/(1000*60*60);
				System.out.printf("%dh-", 몫);
				diff %=(1000*60*60);
				
				몫 = diff/(1000*60);
				System.out.printf("%dm-", 몫);
				diff %=(1000*60);
				
				몫 = diff/(1000);
				System.out.printf("%ds-", 몫);
				diff %=(1000);
				
				몫 = diff/1;
				System.out.printf("%dms\n", 몫);
				
				try {
					Thread.sleep(10);// 10ms
				} catch (InterruptedException e) { 
					e.printStackTrace();
				} 
				
			//dispDiffDays(sday, new Date());
				
	
	}

}
