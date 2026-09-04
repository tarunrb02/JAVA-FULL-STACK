package stringExample;

import java.util.Arrays;

public class Example2 {
	public static void main(String[] args) {
		String s=new String("  Java  ");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('a', 2));
		System.out.println(s.lastIndexOf('a'));
		
		char[] a=s.toCharArray();
		System.out.println(Arrays.toString(a));
		System.out.println(s.length());
		System.out.println(s.trim());
		String s1=s.trim();
		System.out.println(s1.length());
		
		
		//Strings are immutable
		
		System.out.println(System.identityHashCode(s));
		s=s.concat("program");
		System.out.println(s);
//		System.out.println(s.hashCode());
		System.out.println(System.identityHashCode(s));
		
	}

}
