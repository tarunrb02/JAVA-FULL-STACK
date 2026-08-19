package non_static_methods;

public class Methods_CW {
	
	// sum of 2 nums
	static int add(int a, int b) {
		return a+b;
	}
	
	//id even or not
	static String isEven(int num) {
		if(num%2==0)
			return "even";
		return "odd";
	}
	
	//Square of number
	int findSquare(int num) {
		return num*num;
	}
	
	// Largest number
	static int largest_num(int a, int b) {
		return a>b?a:b;
	}
	
	//Area of circle
	double areaof(double r) {
		return 3.14*r*r;
	}
	
	public static void main(String[] args) {
		Methods_CW m=new Methods_CW();
		System.out.println(add(5,7));
		System.out.println(isEven(4));
		System.out.println(m.findSquare(5));
		System.out.println(largest_num(9,4));
		System.out.println(m.areaof(5.5));
		
	}
}
