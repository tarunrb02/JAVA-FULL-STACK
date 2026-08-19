package While;

public class Example2 {
	public static void main(String[] args) {
		int a=10;
		if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		System.out.println();
		
		int i=1;
		while(i<=5) {
			System.out.println(i*2);
			i++;
		}
		
		System.out.println();
		for(int j=0;j<5;j++)
			System.out.println(j*2+1);
	}
}
