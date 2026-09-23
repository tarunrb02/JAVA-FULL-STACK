package day5;

import java.util.HashMap;

public class NonOccurence {
	public static void main(String[] args) {
		int[] a= {1,2,3,1,1};
		
//		for(int i=0;i<a.length;i++) {
//			int count=0;
//			for(int j=0;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					count++;
//				}
//			}
//			if(count==1)
//				System.out.println(a[i]);
//		}
		
		HashMap<Integer, Integer > map = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			map.put(a[i],map.getOrDefault(a[i], 0)+1 );
		}

		for(Integer key: map.keySet()) {
			if(map.get(key)==1)
				System.out.println(key);
		}
	}
}
