package day1;

public class ExtractLastDigit {
	public static void main(String[] args) {
		int n=123;
		System.out.println(n%10+" is extracted");
		n=n/10;
		System.out.println(n);
	}
}
