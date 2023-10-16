package days10;



public class 복습 {
	public static void main(String[] args) {
		int n = 10;
		int share, reminder;
		
		char[] ch = {'a', 'b', 'c', 'd' ,'e', 'f'};
		String s= "";
	     char one;
		// 0123456789A(10)BCDEF(15)
		while (n!=10) {
			share = n /16;
			reminder = n%16;
			if (reminder>=10) {
				one=ch[reminder-10];
				
			} else {
				one=(char)(reminder+'0'); //7->'7'

			}
			s =one +s;
			n=share;
		
			 n = share;
		}
		System.out.printf("0x%s",s);
	}
}

