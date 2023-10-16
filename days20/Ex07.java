package days20;

import java.text.DecimalFormat;

/**
 * @author user
 * @date 2023. 8. 9.오후 2:09:45
 * @subject  SimpleDate Format ***
 * 			 Decimal Format
 *  		 Choice Format
 *  		 Message Format
 *  
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// Decimal Format
		// 숫자        형식화 (내가 원하는 형식) 하는 클래스 
		//int money =3257600;
		double money =3257600.0;
		
		//출력형식 \3257600
		//[1]
		/*
		String strMoney = String.format("%,d",money);  // , 자동으로 3자리마다 출력  //3,257,600
		System.out.println(strMoney);
		*/
		
		//[2]
		//[패턴에 사용할 수 있는 기호]
		// 0 10진수  값이 없을 경우 0을 출력 .
		//#   10 진수 
		//#.##           9.1
		//0.00			9.10
		//-음수 부호
		// 단위 구분자
		// E 지수기호
		// ; 패턴구분자 
		//% 퍼센트
		// ' escape문자
		//\u00A4 통화기호
		String pattern = "\u00A4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		String strMoney = df.format(money);
		System.out.println(strMoney);
	}

}
