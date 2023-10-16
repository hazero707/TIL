package days06;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex01_03 {

	public static void main(String[] args) {
		//10개 정수 배열-> 가장 큰값 (람다식과 스트림)
		//int []m = new Random().ints(5,6).limit(10).toArray();
		
		int max = new Random().ints(5,16).limit(10).max().getAsInt();
		System.out.println(max);
		
		
		
		
		// 1.jdk 1.5 제네릭
		//2.jdk 1.8 람다식과 스트림
		//optionalInt[7]
		
		
		int a=5, b=7, c=1;
		
//      [1]
//		System.out.println(IntStream.of(a,b,c).max());
//		
//		int max =InStream.of(a,b,c,).max().getAsint();
//		System.out.println(max);
//		
//		[2]

//      System.out:: println(m);
//      IntStream.of(a,b,c).max().ifPresent(System.out::println);

	}

}
