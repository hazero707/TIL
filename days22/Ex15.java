package days22;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 * @author user
 * @date 2023. 8. 11.오후 4:33:50
 * @subject 
 * @content  
 */
public class Ex15 {

	
		public static void main(String[] args) {
			// HashSet lotto = new HashSet();
			LinkedHashSet lotto = new LinkedHashSet();		
			fillLotto(lotto);
			dispLotto(lotto); 
		} // main

		public static void dispLotto(HashSet lotto) {
			 Iterator ir = lotto.iterator();
			 while (ir.hasNext()) {
				int n = (int) ir.next();
				System.out.printf("[%d]", n);			
			} // while
			 System.out.println();
		}

		public static void fillLotto(HashSet lotto) {
			Random rnd = new Random();
			while ( lotto.size() < 6 ) {
				int n = rnd.nextInt(45) + 1; 
				lotto.add(n);
			} // while
		}
}
