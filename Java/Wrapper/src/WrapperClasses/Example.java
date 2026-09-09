package WrapperClasses;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter boolean value");
		String a=sc.next();
		System.out.println("enter integer value");
		String i=sc.next();
		boolean b=Boolean.parseBoolean(a);
		System.out.println(b);
		
		try {
			int g=Integer.parseInt(i);
			System.out.println(g);
		}catch (Exception e) {
			System.out.println("please enter currect data "+e.getMessage());
			// TODO: handle exception
		}
	}
}
