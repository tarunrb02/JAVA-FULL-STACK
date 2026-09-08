package day1;

import java.util.Scanner;

public class SumEvenDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int even_sum=0;
		int odd_sum=0;
		while (n>0) {
			if((n%10)%2==0)
				even_sum+=n%10;
			else
				odd_sum+=n%10;
			n=n/10;
		}
		sc.close();
		System.out.println(even_sum);
		System.out.println(odd_sum);
	}
}
