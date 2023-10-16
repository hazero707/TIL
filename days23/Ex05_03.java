package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Ex05_03 {

	public static void main(String[] args) {
		
		int [] score = {80,95,50,85,45,65,10,100};
		
		//1) 75보다 큰 점수를 얻어와서 출력
		/*
		for (int i = 0; i < score.length; i++) {
			if (score[i]>75) System.out.println(score[i]);	
		}
		*/
		/*[1]
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);
		}//for 
		*/
		
		//[2]
		//int [] - > ArrayList -> TreeSet 변환
		//Arrays.asList(T..배열 ) T 클래스 X  int배열 
		//ArrayList<Integer> list =;
		
		//IntStream -> int x Integer Stream 변환 
		//Stream<Integer>
		ArrayList<Integer> list = (ArrayList<Integer>)
		Arrays.stream(score).boxed().collect(Collectors.toList()); 
		TreeSet<Integer> ts = new TreeSet<Integer>(list);
		
		//tailSet(값) 지정한 값보다 큰 값의 객체들을 반환
		//ts.tailSet(75, true)
		NavigableSet<Integer> ss = ts.tailSet(75, false);
		System.out.println(ss);
		
		//2) 50보다 작은 점수를 얻어와서 출력
		// headset 지정한 값보다 작은 값의 객체들을 반환 
		NavigableSet<Integer> ss2 =ts.headSet(50,false);
		System.out.println(ss2);
		
		
		//3) 50~75사이의 점수를 얻어와서 출력 
		/*
		NavigableSet<Integer> ss3 = ss.headSet(50, false);
		System.out.println(ss3);
		*/
		NavigableSet<Integer> ss3 =ts.subSet(50, false, 75, false);  //필기 확인 필요 
		System.out.println(ss3);
		

	}

}
