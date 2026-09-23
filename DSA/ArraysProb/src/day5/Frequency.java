package day5;

import java.util.HashMap;

public class Frequency {
	public static void main(String[] args) {
		int[] a= {1,2,3,1,3,1};
//		
//		boolean[] visited=new boolean[a.length];
//		for(int i=0;i<a.length;i++) {
//			int count=0;
//			for(int j=0;j<a.length;j++) {
//				if(!visited[i] && a[i]==a[j]) {
//					count++;
//				}
//			}
//			System.out.println(a[i]+" count is " +count);
//		}
		HashMap<Integer, Integer > map = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			map.put(a[i],map.getOrDefault(a[i], 0)+1 );
		}

		for(Integer key: map.keySet()) {
			System.out.println(key+" count is "+map.get(key));
		}
	}
}
