package Conditional;

public class largest_In_3 {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=15;
		System.out.println("Largest among 3");
		if(a>b && a>c) {
			System.out.println(a);
		}
		else if(b>c) {
			System.out.println(b);
		}
		else 
			System.out.println(c);
		
		System.out.println("end");
	}
}
