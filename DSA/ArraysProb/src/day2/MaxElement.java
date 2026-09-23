package day2;

public class MaxElement {
	public static void main(String[] args) {
		int[] a= {1,3,6,2,8};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}
}
