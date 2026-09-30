package day6;

import java.util.Scanner;

public class Accesing {
	public static void main(String[] args) {
		int[][] a=new int[3][4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++)
				a[i][j]=sc.nextInt();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
