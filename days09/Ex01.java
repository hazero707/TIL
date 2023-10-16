package days09;

import java.util.Calendar;

/**
 * @author 
 * @date 2023. 7. 25. - 오전 10:10:51
 * @subjct 스위치 변수로 화폐카운트
 * @contents
 */
public class Ex01 {

	public static void main(String[] args) {
    //4
 int money = 123456760;
 int unit =50000;// 5만원/5=>1만원  
 boolean sw =false; //스위치 변수
 int count=0; //갯수
 while (unit >=1) {
	 count = money/unit; //갯수
	 System.out.printf("%d원 : %d개\n", unit, count);
	 money %=unit;
	//if(sw ==false) unit=unit/5;
	// else                    unit=unit/2;
	 unit /= !sw? 5:2;
	 sw =!sw;
	 
 }



	}
}

