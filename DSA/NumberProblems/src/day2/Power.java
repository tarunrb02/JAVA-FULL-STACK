package day2;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base number: ");
		int base=sc.nextInt();
		System.out.println("enter power number: ");
		int power=sc.nextInt();
		long result=1;
		for(int i=0;i<power;i++)
			result*=base;
		System.out.println(result);
		sc.close();
	}
}
