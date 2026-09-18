package stack;

import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(20);
		s.push(40);
		s.push(10);
		s.push(30);
		s.push(90);
		System.out.println(s);
		s.pop();
		for(Integer i:s)
			System.out.print(i+" ");
		
		System.out.println();
		System.out.println("----------------------");
		System.out.println(s.peek());
		System.out.println(s.search(100));
		System.out.println(s.isEmpty());
	}
}
