package day1;

public class OddIndexElement {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		for(int i=1;i<a.length;i+=2)
			System.out.print(a[i]+" ");
	}
}
