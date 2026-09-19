package queue;

import java.util.LinkedList;
import java.util.ListIterator;

public class Example {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(null);
		ll.add(null);
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(10);
		ll.add(null);
		
		System.out.println(ll);
		
		ListIterator<Integer> lliterator = ll.listIterator();
		while(lliterator.hasNext())
			System.out.print(lliterator.next()+" ");
		
		System.out.println();
		System.out.println("--------Rverse order--------");
		
		while(lliterator.hasPrevious())
			System.out.print(lliterator.previous()+" ");
		
	}
}
