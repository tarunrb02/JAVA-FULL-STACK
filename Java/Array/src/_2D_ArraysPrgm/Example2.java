package _2D_ArraysPrgm;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and column size: ");
		int rsize=sc.nextInt();
		int csize=sc.nextInt();
		char[][] a=new char[rsize][csize];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.next().charAt(0);
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
