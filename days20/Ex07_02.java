package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex07_02 {

	public static void main(String[] args) {
		String strMoney = "1,234,567";
		int money;
		
		//[2] 
		String pattern = "\u00A4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		//strMoney = df.format(money);
		try {
			Number num = df.parse(strMoney);
			money = num.intValue();
			System.out.println(money);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
		//int money = 123456;
		//System.out.println(money);
		//[1]
		strMoney = strMoney.replaceAll(",", "");
		System.out.println(strMoney); //1234567
		money = Integer.parseInt(strMoney);
		System.out.println(money);
	}

}
