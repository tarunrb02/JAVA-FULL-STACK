package day6;

import java.util.Scanner;

public class XylemNumber {
	static boolean checkXylem(int n) {
		int num = Math.abs(n);
		if (num < 100) {
			return true;
		}
		int extremeSum =0;
		int meanSum =0;
		
		while(num>0) {
			if(num==Math.abs(n) || num<10 )
				extremeSum +=num%10;
			else
				meanSum +=num%10;
			num/=10;
		}
		return extremeSum ==meanSum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkXylem(n)?"Xylem Number":"Ployem Number");
		sc.close();
	}

}
