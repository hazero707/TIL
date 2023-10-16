package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex06_02 {

	public static void main(String[] args) {
	
		//2)ArrayList -> String[] 변환  *시험
		ArrayList list = new ArrayList();
		list.add("신종혁");
		list.add("고경림");
		list.add("이재영");
		
		/*
		String [] nameArr= new String[list.size()];
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
	       String name = (String) ir.next();
	       nameArr[index++] =name;
			
		}
		System.out.println(Arrays.toString(nameArr));
		*/
		
		//[2] Object [] -> String [] 형변환
		//String [] nameArr = (String[])	list.toArray( new String[list.size()]);
		//System.out.println(Arrays.toString(nameArr));
		
		

	}

}
