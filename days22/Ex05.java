package days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex05 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new person("박성호",23));
		list.add(new person("김성준",21));
		list.add(new person("주강민",21));
		list.add(new person("이경서",20));
		list.add(new person("이준희",20));
		list.add(new person("신기범",30));

		System.out.println(list);   //[person [name=박성호, age=23], person [name=김성준, age=21]........
		
		list.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				person p1=(person)o1;
				person p2=(person)o2;
				String p1Name = p1.getName();
				String p2Name = p2.getName();
				
				return p1Name.compareTo(p2Name);
			}
		});
		//반복자 출력
		Iterator ir = list.iterator();
		while(ir.hasNext()){
			person p =(person) ir.next();
			System.out.println(p);
		}
	}

}

class person {
	private String name;
	private int age;
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + "]";
	}
	
}