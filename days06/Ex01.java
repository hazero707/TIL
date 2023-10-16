package days06;

public class Ex01 {

	public static void main(String[] args) {
		// 복습
		int a=5,b=7, c=1;
		
		//math,max(),min()
		//int mac =Math,max(a,b);
		//max =Math.max(max,c);
		int max =Math.max( Math.max(a,b),c);
		int min =Math.min( Math.min(a,b),c);
		
		
		
		//삼항연산자
		//int max = a>b? (a>c ? a : c) :(b>c ? b>c);
		
		
		/*
		if(a>b) {
			if (a>c) {
				a
			} else {
				c
			} else {
				if (b>c) {
					b
				} else {

				}
			}
			
			
		}*/
		

	}

}
