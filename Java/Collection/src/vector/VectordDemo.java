package vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectordDemo {
	public static void main(String[] args) {
//		Vector<Integer> v = new Vector<>();  //default constructor
//		Vector<Integer> v = new Vector<>(20); //constructor with initial cap
//		Vector<Integer> v = new Vector<>(10,5); //constructor with initial cap and increment order
//		Vector<Integer> v = new Vector<>(Arrays.asList(10,20,30,40,50)); //constructor with initial cap and increment order
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		Vector<Integer> v = new Vector<>(list); //constructor with initial cap and increment order

//		v.add(10);
//		v.add(90);
//		v.add(80);
//		v.add(30);
//		v.add(40);
//		v.add(null);
//		v.add(90);
//		v.add(10);
//		v.add(20);
//		v.add(30);
//		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
	}
}
