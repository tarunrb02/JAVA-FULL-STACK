package Jagged_Array;

import java.util.Arrays;

public class JaggedTranspose {
	
	private static int[][] transposeMat(int[][] arr) {
		int maxColName=0;
		for(int[] a: arr) {
			maxColName= Math.max(maxColName, a.length);
		}
		
		int[][] trns=new int[maxColName][arr.length];
		for(int i=0;i<trns.length;i++) {
			for(int j=0;j<trns[i].length;j++) {
				if (arr[j] != null && i < arr[j].length) {
					trns[i][j] = arr[j][i];
                } else {
                	trns[i][j] = 0; // Apply padding
                }
			}
		}
		return trns;
	}

	public static void main(String[] args) {
		int[][] arr= {
				{1, 2, 3, 4, 5},
				{6, 7, 8},
				{9, 10}
		};
		
		int[][] b= transposeMat(arr);
		for(int i=0;i<b.length;i++) {
			System.out.println(Arrays.toString(b[i]));

		}
	}
}

	
