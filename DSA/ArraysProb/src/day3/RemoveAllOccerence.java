package day3;

import java.util.Arrays;

public class RemoveAllOccerence {
	public static void main(String[] args) {
		int[] a = { 5, 3, 4, 5, 9, 3 };
		int target = 5;
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != target) {
				a[index] = a[i];
				index++;
			}
		}
		while(index<a.length) {
			a[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(a));
	}
}
