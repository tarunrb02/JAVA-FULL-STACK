package ScannerEx;
import java.util.*;

public class Calculator {
	static int choice;
	static int addition(int a, int b){return a+b;}
	static int substract(int a,int b){return a-b;}
	static int multiplication(int a,int b){return a*b;}
	static int Division(int a,int b) {
		if(b==0) {
			System.out.println("can't divide by 0");
			return -1;
		}
		return a/b;
		}
	
	public static void main(String[] args) {
		System.out.println("menu:\n"
				+ "1. Addition\n"
				+ "2. Subtraction\n"
				+ "3. Multiplication\n"
				+ "4. Division\n"
				+ "5. Exit");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		while(choice!=5) {
			System.out.println("Enter a choice: ");
			choice=sc.nextInt();
			if(choice==5) {
				System.out.println("Program exited");
				sc.close();
				return;
			}
			else {
			System.out.println("Enter 1st number: ");
			int a=sc.nextInt();
			System.out.println("Enter 2nd number: ");
			int b=sc.nextInt();
		
			switch(choice) {
			case 1 -> System.out.println("Result "+addition(a, b));
			case 2 -> System.out.println("Result "+substract(a, b));
			case 3 -> System.out.println("Result "+multiplication(a, b));
			case 4 -> System.out.println("Result "+Division(a, b));
			default -> System.out.println("invalid choice");
			}
			}
		}
		
		sc.close();
	}
}
