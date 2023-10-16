package days03;

import java.util.Calendar;

/**
 * @author 정하영
 * @date 2023. 7. 17. - 오전 11:31:24
 * @subjct
 * @contents
 */
public class Ex02 {
        public static void main(String[] args) {
        	// java.util.IllegalFormatConversionException: d != java.lang.String 컨버젼 잘못사용함
			//System.out.printf("%d\n", "홍길동");
		
           Calendar c = Calendar.getInstance();
           System.out.printf(" %1$tm %1$te,%1$tY", c);

	//%[argument_index$][flags][width]conversion
           
           System.out.printf("%1$c %1$c\n",'a');
           System.out.printf("%1x %1$x\n",30);
           
           System.out.printf("%(d\n", -123);
           System.out.printf("%,d\n", 1234567);
	}

}
