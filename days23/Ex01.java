package days23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

import days02.Ex15;

public class Ex01 {

	public static void main(String[] args) {
//		       [출력형식]  
//				1게임 : [09][14][18][27][34][36]
//				2게임 : [12][18][29][36][39][42]
//				3게임 : [09][14][20][24][27][35]
//				4게임 : [06][24][29][32][39][42]
//				5게임 : [02][11][23][42][44][45]  
		
		int n =5;
		/*
		LinkedHashSet lotto = new LinkedHashSet();
		//lotto.add(Object e);
		//Object -> 각자료형으로 다운케스팅 형변환 
		
		String lotto.add("홍길동"); //String
		double lotto.add(3.14); //double
		lotto.add(true); //boolean
		lotto.add('a'); //char
		lotto.add(100L); //long
		lotto.add(new Student()); // Student
		lotto.get(0);  x 
		*/
		ArrayList<LinkedHashSet<Integer>> lottos = new ArrayList<>();            // integer 값만 가지는 LinkedHashSet 객체 담아 6개 로또 번호 뽑겠다
		LinkedHashSet<Integer> lotto = null; // LindehasSET 에 integer 타입만 넣겠다. 제네릭은 기본형못씀 int x integer o
		int lottoNumber = -1;
		for (int i = 0; i < n; i++) {
			
			lotto = new LinkedHashSet<>(6);
			while (lotto.size()<6){
				lottoNumber = (int)(Math.random()*45) +1;
				lotto.add(lottoNumber);
			} //while
			
			lottos.add(lotto);  //lottos에 lotto에 발생한 객체를 add 함 
			
		}
		
		//출력 
	
		ArrayList<Integer> sList = null;
		Iterator<LinkedHashSet<Integer>> ir = lottos.iterator();    //반복자는 LinkedHashSet<Integer>를 가지고 있음 //set는 정렬안됨 
		int no =1;
		while (ir.hasNext()) {
			 lotto = ir.next();   // LinkedhashSET 임 
			 sList = new ArrayList<Integer>(lotto);// LinkedkhasSET 객체를 담아 ARRAYList 로 만듦 
			 Collections.sort(sList);  // sList 를  정렬
			 
			 
			 Iterator<Integer> ir2 = sList.iterator(); // Linkedhashset 안에 하나하나 를 얻어오려면 한번또 씀 
			 System.out.printf("%d게임 : ", no++);
			 while (ir2.hasNext()) {
				lottoNumber =  ir2.next();  //Integer -> int 오토 언박싱 ( 자동 형변환   래퍼클래스가 기본형 int 로 변형 ) 
				System.out.printf("[%02d]",lottoNumber);
				
			}//while
			 System.out.println();
			
		}
			
		}
		
		
		
		
		
		
		
		
		
		/*
		int gameNumber=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println(">게임 횟수 입력? ");
		gameNumber = scanner.nextInt();
		
		ArrayList lottos = new ArrayList();
		
		LinkedHashSet lotto = null;
		for (int i = 0; i < gameNumber; i++) {
			lotto = new LinkedHashSet();
			Ex15.fillLotto(lotto);
			lottos.add(lotto);
		}
		dispLottos(lottos);
	}

	private static void dispLottos(ArrayList lottos) {
		Iterator ir = lottos.iterator();
		while (ir.hasNext()) {
			LinkedHashSet lotto = (LinkedHashSet) ir.next();
			Ex15.dispLottos(lotto);
			
		}
		*/
		
	}


