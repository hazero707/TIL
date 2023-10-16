package days19;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n =6;
				
				String [] answer = Solution.solution(my_str,n);
		
		System.out.println(Arrays.toString(answer));

	}

}
class Solution{


	public static String[] solution(String my_str, int n) {
		int answerLength =(int) Math.ceil((double)my_str.length()/n);  //2.xxx 
		
		String[] answer = new String[answerLength];
		
		/*
		String a = my_str.substring(0,6); // 0번째에서 6번째까지 substring
		System.out.println(a);
		
		 a = my_str.substring(6,12);
			System.out.println(a);
			
			 a = my_str.substring(12,16);
				System.out.println(a);
				*/
		int beginIndex=0, endIndex;
		String str=null;
		int my_strLength = my_str.length();
		int index=0;
		while (index !=answerLength) {
			endIndex = beginIndex +n;
			if(endIndex>my_str.length()) endIndex = my_str.length();
			str = my_str.substring(beginIndex, endIndex);
			beginIndex = endIndex;
			answer[index++] = str;
			
			
			
		}
		 return answer;
		 
		 /* try- catch 예외처리고 푸는 방법 
		 int i = 0, idx = 0;
		 try {
		    for (             ; i < my_strLength ; i+=n, idx++) {
		        answer[idx] =   my_str.substring(i, i+n );
		      } 
		 } catch (Exception e) {
		    answer[idx] =   my_str.substring(i);
		 }
		 */
	}
}