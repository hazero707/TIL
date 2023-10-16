package days23; // 클래스라면 반드시 1개의 페키지 

import java.util.HashMap;  //import 구문 없으면 풀네임 사용해야함 
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 
 * @date 2023. 8. 14. - 오후 4:33:39
 * @subject
 * @content
 */
public class Ex08 {
	// phoneBook필드가 선언 되어있음 
	//static 정적 필드   , 그냥 클래스명으로 접근할수 있음 
	//HashMap<String, HashMap<String, String>>  자료형 collecton class 타입 -/ hashmap 항상 key value 필요 
	//             key값      value  key     value(값으 ㄴ;hashmap)
   static HashMap<String, HashMap<String, String>> phoneBook = new HashMap<>(); //전역  변수 선언 
        //          친구     3사람 이름과 연락처                                               
   public static void main(String[] args) {   //메인함수부터 처리과정 보기 
      

      String groupName, name, tel;
        
      addPhoneNo( "친구","이자바","010-1111-1111" );    // key 값은 아마 번호가 되야함 
      addPhoneNo( "친구","김자바","010-2222-2222" );
      addPhoneNo( "친구","김자바","010-3333-3333" );

      addPhoneNo( "회사","이대리","010-4444-4444" );
      addPhoneNo( "회사","김대리","010-5555-5555" );
      addPhoneNo( "회사","박대리","010-6666-6666" );

      addPhoneNo( "동아리","김동아","010-7777-7777" );

      addPhoneNo( null, "세탁소","010-8888-8888" );  // 기타
      addPhoneNo( null, "PC방","010-9999-8888" );    // 기타


      printList();  //연락처 정보 출력하겟다. 

   } // main

   private static void printList() { 

	   // entry 를 두번 씀 
      Set<Entry<String, HashMap<String, String>>> es   = phoneBook.entrySet(); // Entryset을 사용하여 모든 key 와 value 값 꺼냄
      Iterator<Entry<String, HashMap<String, String>>> ir = es.iterator();
  
      while (ir.hasNext()) {
         Entry<String, HashMap<String, String>> entry = 
               (Entry<String, HashMap<String, String>>) ir   .next();

         String groupName = entry.getKey();
         HashMap<String, String> groupMap = entry.getValue();
         System.out.printf("* %s [%d]\n",  groupName, groupMap.size() );

         Iterator<Entry<String, String>>  ir2 = groupMap.entrySet().iterator();
         while (ir2.hasNext()) {
            Entry<String, String> entry2 = (Entry<String, String>) ir2.next();
            String name  = entry2.getKey();
            String tel = entry2.getValue();
            System.out.printf("\t%s : %s\n", name, tel);
         }
      }
   }

                                                                    
   private static void addPhoneNo(String groupName, String name, String tel) {
                                  //첫
      groupName = (  groupName == null ? "기타" : groupName  );  // 그룹명이 null 이면 기타 아니면 그룹명
      
      addGroup(  groupName );   //그룹이 없다면 key 값을 생성해 줘야함  // add 친구 ㅊ니구라는 그룹 생성 

      HashMap<String, String>  group = phoneBook.get(groupName);
      group.put(name, tel);    // name key 값 전화번호가 value 값으로 설정함 
   }

   private static void addGroup(String groupName) {  // 

      if (     !phoneBook.containsKey(groupName)   ) {
         phoneBook.put(groupName, new HashMap<String, String>());
      }

   }

} // class 
