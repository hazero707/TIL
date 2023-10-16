package days18;

public class Ex09 {

	public static void main(String[] args) {
		
		//        StringBuffer, String Builder 클래스 
		// 멀티스레드    안전 o         안전x
		//동기화 커리      o             x
		
		//위의 두 클래스는 언제 사용하는가?  String 특징은 변경불가능한 클래스 
		//불가능한 클래스. 변경가능한 클래스(삽입,수정, 삭제 ,추가)
		// 객체 수만 클만큼 라인이 제공되고 있다. 
		String sql = "SELECT ";; 
        sql += "a.ano ";
        sql += " ";
        sql += ", a.user_id as userId ";
        sql += " ";
        sql += ", b.user_name as userName ";
        sql += " ";
        sql += ", a.rno ";
        sql += " ";
        sql += ", c.rname ";
        sql += " ";
        sql += ", DATE_FORMAT(a.sd,'%Y-%m-%d') as sd ";
        sql += " ";
        sql += ", DATE_FORMAT(a.ed,'%Y-%m-%d') as ed ";
        sql += " ";
        sql += ", DATE_FORMAT(a.rd,'%Y-%m-%d %T') as rd ";
        sql += " ";
        sql += ", DATE_FORMAT(a.check_in,'%Y-%m-%d %T') as checkIn ";
        sql += " ";
        sql += ", DATE_FORMAT(a.check_out,'%Y-%m-%d %T') as checkOut ";
        sql += " ";
        sql += "-- , a.sign_yn as signYn ";
        sql += " ";
        sql += ", d.code_name as signYn ";
        sql += " ";
        sql += "-- , a.cancel_yn as cancelYn ";
        sql += " ";
        sql += ", e.code_name as cancelYn ";
        sql += " ";
        sql += "FROM tb_reservation a left outer join tb_user b on a.user_id = b.user_id ";
        sql += " ";
        sql += "left outer join tb_rooms c on a.rno = c.rno ";
        sql += " ";
        sql += "left outer join tb_code d on a.sign_yn = d.code_cd ";
        sql += " ";
        sql += "left outer join tb_code e on a.cancel_yn = e.code_cd ";
        
        System.out.println( sql );
	
	
	
	}

}
