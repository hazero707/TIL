package days09;

public class Ex03 {

	public static void main(String[] args) {
		// [주민등록번호] RRN
		//주민등록번호(住民登錄番號, 영어: Resident Registration Number, RRN)
		//2.생년월일
		//   나이
		//   성별 , 세기, 내국인/외국인
		//   검증번호
		String rrn ="890123-1700001";
		
		String birthday =getBirth(rrn);
		
		System.out.println(birthday);

	}
	//t성별을 가져오는 함수
	public static int getGender(String rrn) {
		//return Integer.parseInt(rrn.subString(7,8));
	return rrn.charAt(7)-'0';       //'1'  문자 1을 읽어오는것   '0' 48
	}
//생일을 가져오는 함수
	private static String getBirth(String rrn) {
		// rrn ="890123-1700001"
		String year = rrn.substring(0,2);      //어디서부터 어디까찌 잃겠따
		String month = rrn.substring(2,4);      //어디서부터 어디까찌 잃겠따
		String day = rrn.substring(4,6);      //어디서부터 어디까찌 잃겠따
				//System.out.printf("%s.%s.%s\n",year,month,day);
				//"1989.01,23"
		        //1800, 1900, 2000
		int ㅅ = getGender(rrn); 
		
		int centry = 1800;
		switch (ㅅ) {
		case 1: case 2: case 5: case 6:
		  centry =19;                                  //string 을 int 로 바꿀시 centry 1900 바꾸고, %s 는 %d 로 변경해줘야 오류안뜸
			break;
		case 3: case 4: case 7: case 8:
		  centry =20;
			break;
		case 9: case 0:
			centry =18;
			break;
		}
		year =centry +year;
		String birthday =String.format("%s,%s,%s", year, month, day);
		return birthday;
	}

}
