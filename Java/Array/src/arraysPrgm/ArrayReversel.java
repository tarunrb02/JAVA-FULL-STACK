package arraysPrgm;

import java.util.Arrays;
public class ArrayReversel {
	static void accept(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		accept(a);
		System.out.println(Arrays.toString(a));
	}
}
