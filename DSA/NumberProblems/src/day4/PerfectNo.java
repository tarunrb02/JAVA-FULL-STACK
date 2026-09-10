package day4;

public class PerfectNo {
	//sum of all factor of digits == number
	public static void main(String[] args) {
		int n=6;
		int res=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				res+=i;
		}
		System.out.println(n==res);
	}
}
