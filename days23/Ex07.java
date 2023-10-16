package days23;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex07 {

	public static void main(String[] args) {
		//days20.Ex01.java 파일 읽어서 
		//HashMap 저장 - key + value
		//             'a'     10
		//             'b'     15
		// 'a' 10       ##########
		//'0'~'9'  'A'~'Z' 'a'~'z'
		String fileName = ".\\src\\days20\\Ex01.java";
		int code = -1;
		char one = '\u0000';
		HashMap<Character,Integer>hmap = new HashMap<>();


		try (FileReader fr = new FileReader(fileName)){

			while ((code = fr.read()) !=-1) {
				one = (char)code;
				//System.out.println(one);
				//읽어온 문자(key)가 hmap에 존재한다면 
				//value값을 1 증가시키고 
				//존재하지 않으면 새로 엔트리를 추가.


				if (hmap.containsKey(one)) {
					int value = hmap.get(one);
					hmap.put(one , value+1);
				}else {
					hmap.put(one, 1);

					/*	
				}//if
				hmap.put(one, hmap.getOrDefault(one, 0)+1);  // 값이 존재하면 one  존재하지 않으면 뒤에 값

					 */
				} //else
				//key value
				// 'A'(20) ############3
				Set<Entry<Character, Integer>> eset = hmap.entrySet();
				Iterator<Entry<Character, Integer>> ir = eset.iterator();
				while(ir.hasNext()) {
					Entry<Character, Integer>entry = ir.next();
					char key = entry.getKey();   //character -> 언박싱 char
					int value = entry.getValue();  // Integer -> int 언박싱 
					System.out.printf("'%c'(%d)\n",key, value, "#".repeat(value));
				}

			} //while
		} catch (Exception e) {
			e.printStackTrace();
		}



	}
}

