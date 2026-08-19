package _2D_ArraysPrgm;

import java.util.Arrays;

public class Transepose {
	static int[][] transposeMat(int[][] b){
		int[][] trns=new int[b[0].length][b.length];
		for(int i=0;i<trns.length;i++) {
			for(int j=0;j<trns[i].length;j++) {
				trns[i][j]=b[j][i];
			}
		}
		return trns;
	}
	
	static void read(int[][] b){
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr= {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10,11,12},
				{13,14,15}
		};
		
//		read(arr);
		int[][] b= transposeMat(arr);
		for(int i=0;i<b.length;i++) {
			System.out.println(Arrays.toString(b[i]));
		}
		
	}
}
