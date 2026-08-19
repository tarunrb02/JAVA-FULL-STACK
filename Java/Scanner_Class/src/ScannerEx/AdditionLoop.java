package ScannerEx;
import java.util.*;

public class AdditionLoop {
	
	static int add(int a, int b) {
		return a+b;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("Enter 2 number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(add(a,b));
	}
//	sc.close();
}
}
