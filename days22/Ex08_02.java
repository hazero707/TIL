package days22;

import java.util.LinkedList;

public class Ex08_02 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
				list.add("김효영");
				list.add("이진현");
				list.add("김정주");
				
				System.out.println(list );
				
				list.addFirst("유희진");  // 가장 처음에 들어가짐 
				
				list.add(1, "임경재");
				
				System.out.println(list.size());

				System.out.println(list.contains("김동현"));  // 여기에 김동현씨가 있는가  (없으면 -1)
				System.out.println(list.indexOf("김동현")); // -1
				System.out.println(list.lastIndexOf("김동혐")); //-1 
				
				//김정주 -> 고경림 수정 
				int index = -1;
				if(( index= list.indexOf("김정주")) !=-1) {
					list.set(index,"고경림");
				}
				System.out.println(list);
				
				
				/*       비교      읽기          추가(삽입포함)/삭제    비고
				 * 1.ArrayList : 빠르다          느리다				순차적인 추가,삭제 더 빠르다  
				 * 2.LinkedList : 느리다         빠르다 			데이터 많으면 많을 수록 접근성은 떨어진다. 
				 */
	}

}
