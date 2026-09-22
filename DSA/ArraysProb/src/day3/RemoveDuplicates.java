package day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] a= {5,3,4,5,9,3};
		
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j])
//					a[j]=-1;
//			}
//		}
//		for(int i=0;i<a.length;i++)
//			if(a[i]!=-1)
//				System.out.print(a[i]+" ");
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<a.length;i++)
			set.add(a[i]);
		System.out.println(Arrays.toString(set.toArray()));
	}
}
