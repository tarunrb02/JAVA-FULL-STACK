package list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list1=new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80,90));
		
		ArrayList list2=new ArrayList(Arrays.asList(90,80,70,60,50,40,30,20,10));
		
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println("----------------------------");
		
		list1.add(2,40);
		System.out.println(list1);
		System.out.println("----------------------------");
		
		list1.remove((Integer)40);
		System.out.println(list1);
		System.out.println("----------------------------");
		
//		list1.removeAll(list2);
		list1.removeAll(Arrays.asList(40));
		System.out.println(list1);
		System.out.println("----------------------------");
		
		
		System.out.println(list1.contains(50));
		System.out.println("----------------------------");
		
		System.out.println(list1.isEmpty());
		System.out.println("----------------------------");
		
//		for(int i=0;i<list1.size();i++)
//			System.out.println(list1.get(i));
		
		
		for(Object o:list1) 
			System.out.println(o);
		
	}
}
