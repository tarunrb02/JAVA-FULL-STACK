package day6;

import java.util.Scanner;

public class HappyNumber {
	static int sumOfSqureOfDig(int n) {
		int ans=0;
		while(n>0) {
			ans+=(n%10)*(n%10);
			n/=10;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		while(n!=1 && n!=4) {
			n=sumOfSqureOfDig(n);
		}
		System.out.println(n==1?"Happy number":"Not happy Number");
	}
}
