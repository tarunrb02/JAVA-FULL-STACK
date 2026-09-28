package treeSet;

import java.util.TreeSet;
class Student implements Comparable<Student>{

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class Example {
	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<>();
		ts.add(50);
		ts.add(60);
//		ts.add(new Student());  heterogeneous data is allowed
		ts.add(10);
		ts.add(30);
		ts.add(80);
//		ts.add(null); // null are allowed
		
		System.out.println(ts);
	}
}
