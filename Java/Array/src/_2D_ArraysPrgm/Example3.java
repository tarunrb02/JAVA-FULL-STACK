package _2D_ArraysPrgm;

import java.util.Arrays;

public class Example3 {
	static int sum(int[][] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum+=a[i][j];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[][] arr= {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println(sum(arr));
	}
}