package arraysPrgm;
//import java.util.*;

public class ReturningArray {
	
	static int returnArraySum() {
		int sum=0;
		int[] a= {10,20,30,40,50};
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
//		System.out.println(returnArray().toString());
//		int sum=0;
//		int[] b=returnArray();
//		System.out.println(Arrays.toString(b));
//		
//		System.out.println();
		System.out.println("sum is: "+ returnArraySum());
	}
}
