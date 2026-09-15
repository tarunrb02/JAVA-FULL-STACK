package day5;

import java.util.Scanner;

public class MysteryNumber {

	public static int reverseNumber(int num) {
		int rev = 0;
		while (num != 0) {
			int last = num % 10;
			rev = rev * 10 + last;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();// 121
		System.out.println("Checking..........");
		boolean isMystery = false;
		for (int i = 1; i <= num; i++) {
			int rev = reverseNumber(i);
			if (i + rev == num) {
				System.out.println(
						"Given Number is Mystery Number Becasue : " + i + " + " + reverseNumber(i) + " -> " + num);
				isMystery = true;
				break;
			}
		}
		if (isMystery == false) {
			System.out.println("Given Number is not a mystery Number....");
		}

	}

}
