package days20;

import java.text.ChoiceFormat;

/**
 * @author user
 * @date 2023. 8. 9.오후 2:50:09
 * @subject  형식화 클래스 - ChoiceFormat
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		//1)특정 범위에 속하는 값을 문자열로 변화해 준다.
		//2) 불연속적인 범위의 값을 처리하는데 
		//  if문,switch문을 대신해서 사용할 수 있다.
		// -> 복잡한 처리를 간단한 코딩으로 처리할 수 있다. 
		//예) 국어점수 -> 수,우,미,야,가  출력 
		//        if switch문 사용 처리...
		//        ChoiceFormat 클래스 사용 처리.
		
		
		String newPattern = "0#가|60#양|70#미|80#우|90#수"; 
		ChoiceFormat cf = new ChoiceFormat(newPattern);
		
		
		
		/*
		double[] limits = {0,60,70,80,90};  
		//작은 값 부터
		String[] formats= {"가", "양","미","우","수"};
		//반환할 문자열
		ChoiceFormat cf = new ChoiceFormat(limits,formats);
		
		int[] kors = {100, 67,23,99};
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d ->등금\n", kors[i], cf.format(kors[i]));
		}
		*/
		

	}

}
