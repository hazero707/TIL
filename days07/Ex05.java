package days07;

/**
 * @author f
 * @date 2023. 7. 21. - 오전 11:29:43
 * @subjct 
 * @contents
 */
public class Ex05 {

	public static void main(String[] args) {
		// [정규표현식]
		//2. 우편번호 000-000
		/*
		String zipCode2 = "123-456";
		String zipCode2 = "12345";
		String zipCode2 = "123456";
		String zipCode2 = "123-a45";
		String zipCode2 = "123-3456";
		*/
		String [] zipCodes = {"123-456", "12345","123456","123-a45","123-3456"};
		boolean flag;
		String regex = "\\{3}-\\d{3}|\\d{5}";
for (int i = 0; i < zipCodes.length; i++) {
	flag = zipCodes[i].matches(regex);
	System.out.printf("%s-%s 우편번호\n"
			, zipCodes[i] ,
			flag?  "올바른" : "잘못된");
	
} //for
}
		
		
		/*
		//1. 주민등록번호 000000-0000000
		String rrn=  "123456-1234567";           
		// a를 넣으면 잘못된 주민번호 형식이라 뜸
		//주민번호 resident registration number
		String regex = "[0-9]{6}-\\d{7}";
		//숫자 [0-9]    \d
		//반목횟수 ? (0,1) +(1,여러)  *(0,여러)
		//              {n}     {n,m}    {n,}
		if(rrn.matches(regex)) {
			System.out.println("올바른 주민등록번호 형식");
		} else {
			System.out.println("잘못된 주민등록번호 형식");
		}
		*/
		
	}


