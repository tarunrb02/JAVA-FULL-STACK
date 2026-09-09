package day3;

public class StrongNo {
	static int factoril(int a) {
		int fact=1;
		for(int i=2;i<=a;i++)
			fact*=i;
		return fact;
	}
	
	public static void main(String[] args) {
		int a=145;
		int n=a;
		int res=0;
		while(n>0) {
			res+=factoril(n%10);
			n=n/10;
		}
		System.out.println(res==a);
	}
}
