package days23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		ArrayList<Integer> b = new ArrayList<>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		//1) a U b 합집합 1,2,3,4,5,6,7,8
		/*
		ArrayList<Integer> hab = new ArrayList<>();
		hab.addAll(a);
		Iterator<Integer> ir = b.iterator();
		while (ir.hasNext()) {
			integer i = ir.next();
			if (!a.contains(i)) {
				hab.add(i);
				
			}
			System.out.println(hab);
			*/
		HashSet<Integer> hab = new HashSet<>();
		hab.addAll(a);
		hab.addAll(b);
		System.out.println(hab);
		
	
		
		
		// a - b 차집합   1.2.3.
		//cha
		//ArrayList
		//HashSet
		/*
		HashSet<Integer> cha = new HashSet<Integer>(a);  // a를 다 집어넣음
		// cha.addAll(a);
		Iterator<Integer> ir = cha.iterator();
		while (ir.hasNext()) {
			Integer i = ir.next();
			//if (b.contains(i)) {cha.remove(i);    //iterator 중간에 제거 수정 추가 할수 없음 - 오류뜸 
				
			}//while
			//java.util.ConcurrentModificationException
		System.out.println(cha);
		*/
		
		
		HashSet<Integer> cha = new HashSet<Integer>();
		HashSet<Integer> kyo = new HashSet<Integer>();
		
		cha.addAll(a);
		cha.removeAll(b);
		
		
		kyo.addAll(a);
		kyo.removeAll(cha);
		/*
		Iterator<Integer> ir = a.iterator();
		while (ir.hasNext()) {
			Integer i = ir.next();
			if (!b.contains(i)) cha.add(i);    //iterator 중간에 제거 수정 추가 할수 없음 - 오류뜸 
			else kyo.add(i);
		}
		*/
		System.out.println(cha);
		System.out.println(kyo);
		
		
		
		

		
	
		// 3) a  b 교집합 4,5
		//kyo
		//
		
	}//main 

}//class

