package day4;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		//		System.out.print(a+" "+b+" ");
		int n=5;			
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			int tem=a+b;
			a=b;
			b=tem;
		}
	}
}
