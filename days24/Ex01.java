package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import days25.MemberVO;

import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
//		"1. Java 팀 구성.txt" 파일을 읽어와서
//		  
//		   Map 컬렉션 클래스 사용해서
//		      key : 1조, 2조, 3조
//		      value :  직위(급)과 이름을 저장하는 클래스를 선언하고
		//             MemverVO
//		               그 클래스 객체를 저장하는 컬렉션 클래스 사용   
//		   저장하고 출력하는 코딩을 하세요.    
//		1조
//		이경서, 신종혁(팀장), 이재영, 송해영 , 신기범, 이준희, 김성준 
//		2조
//		박민석(팀장), 유희진, 고경림, 임경재, 이지현 , 김정주, 김호영
//		3조
//		박정호(팀장), 이상문, 이주영, 정하영, 이동현, 주강민
		String fileName = ".\\src\\days19\\1. Java 팀 구성.txt";
		
		// 자바 IO ( Input , Output)
		//FileReader, BufferedReader(보조스트림)
		//FileWriter, BufferedWriter
		ArrayList<MemberVO>teamList = null;
		HashMap<String, ArrayList<MemberVO>> teamMap = new LinkedHashMap<>();
		
		String line = null;
		String teamName = null; //key
		MemberVO memberVO = null;
		
		try(FileReader reader = new FileReader(fileName);BufferedReader br = new BufferedReader(reader) ) {
			
			while ((line = br.readLine() ) !=null && !line.equals("")) {
				
				//if( line.equals("")) break;  //System.out.println("빈 공백~~~"); 
				
			 teamName = line; //key 
			 
			 line =br.readLine();  // ~~이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준 
			String [] tNames =  line.split("\\s*,\\s*");  // 구분자를 기중 으로 split 
			teamList = new ArrayList<MemberVO>();
			for (String tName : tNames) {
				
				if (tName.contains("(팀장)")) {
					tName = tName.replace("(팀장)", ""); // 팀장을 뗴ㅐ고 
					memberVO = new MemberVO(fileName, "팀원"); //
				} else {
					memberVO = new MemberVO(tName, "팀원");
				}
				teamList.add(memberVO); //value 값 
			}
			 teamMap.put(teamName, teamList) ;

			
			}//while    	
			
			//출력  
			dispTeamMember(teamMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
		
	
		}

	private static void dispTeamMember(HashMap<String, ArrayList<MemberVO>> teamMap) {
		Set<Entry<String, ArrayList<MemberVO>>> eset = teamMap.entrySet();
		Iterator<Entry<String, ArrayList<MemberVO>>> ir = eset.iterator();
		
		String teamName = null;
		ArrayList<MemberVO> teamList =null;
		int teamCount = 0;
		MemberVO teamLeaderVO = null; 
		String teamLeader =null;
				
		while (ir.hasNext()) {
			Entry<String, ArrayList<MemberVO>> entry = ir.next();
			teamName = entry.getKey();
			teamList = entry.getValue();
		teamCount = teamList.size();
			teamLeaderVO = teamList.get(0); 
			 teamName = teamLeaderVO.getName();
			System.out.printf("[%s(7명):이윤서]\n", teamName, teamCount);
			// 팀원들 출력 
			//teamList.subList(1, teamCount)
			Iterator<MemberVO> ir2 = teamList.iterator();
			int seq =1;
			
			if (ir2.hasNext()) ir2.hasNext(); //팀장을 읽어와서 버리겠다. 
			
			while (ir2.hasNext()) {
				MemberVO memberVO = ir2.next();
				System.out.printf("  [%d] %s\n", seq++,memberVO.getName());
				
			}
		}
	
}
}

////[1조(7명):이윤서]
//		1. 누구누구
//		2. 누구누구 
