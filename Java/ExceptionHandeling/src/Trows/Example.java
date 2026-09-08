package Trows;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ente your age: ");
		int age=sc.nextInt();
		try {
			if(age>=20)
				System.out.println("eligible");
			else
				throw new AgeInvalidException("you are not eligible");
		}catch (AgeInvalidException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
