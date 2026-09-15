package day5;

import java.util.Scanner;

public class TwistedPrimeNumber {

	public static int reverseNumber(int num) {
		System.out.println("Please wait while we are reversing......");
		int rev = 0;
		while (num != 0) {
			int last = num % 10;
			rev = rev * 10 + last;
			num = num / 10;
		}
		return rev;
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		System.out.println("Please wait checking -> ");
		if(isPrime(num)) {
			System.out.println("Given Number is PrimeNumber...");
			System.out.println("Now checking for twised PrimeNumber...");
			int rev = reverseNumber(num);
			System.out.println("Reversed of Given Number -> " + rev);
			if(isPrime(rev)) {
				System.out.println("Reverse Number is also a PrimeNumber");
				System.out.println("Hence , Given Number is Twisted PrimeNumber");
			}
		}
		else {
			System.out.println("Given Number is Not Prime Number , hence we can't check whether it is twistedprime or not");
		}

	}

}

