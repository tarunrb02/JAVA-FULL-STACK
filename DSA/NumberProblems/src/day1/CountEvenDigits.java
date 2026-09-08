package day1;

import java.util.Scanner;

public class CountEvenDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int even_count=0;
		int odd_count=0;
		while (n>0) {
			if((n%10)%2==0)
				even_count++;
			else 
				odd_count++;
			n=n/10;
		}
		System.out.println(even_count);
		System.out.println(odd_count);
		sc.close();
	}
}
