package day6;

public class unComman {
	public static void main(String[] args) {
		int[] a= {1,6,8,3,4};
		int[] b= {1,5,7,3,4,9};
		
		for(int i=0;i<a.length;i++) {
			boolean uniqe=false;
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j])
					uniqe=true;
			}
			if(!uniqe)
				System.out.println(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			boolean uniqe=false;
			for (int j = 0; j < a.length; j++) {
				if(b[i]==a[j])
					uniqe=true;
			}
			if(!uniqe)
				System.out.println(b[i]);
		}
	}
}
