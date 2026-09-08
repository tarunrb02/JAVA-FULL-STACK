package day1;

import java.util.Scanner;

public class CountOf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int count=0;
		while (n>0) {
			count++;
			n=n/10;
		}
		System.out.println(count);
		sc.close();
		//sum even digits
		//sum add digits
		//find largest among 2
		//count even digits
		//count odd digits
	}

}
