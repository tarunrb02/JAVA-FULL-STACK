package _2D_ArraysPrgm;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		int[][] a=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");			}
			System.out.println();
		}
		sc.close();
	}
}
