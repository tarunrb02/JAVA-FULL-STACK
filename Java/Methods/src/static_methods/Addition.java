package static_methods;

public class Addition {
	//return stmt and formal args
	public static int add(int a, int b) {
		return a+b;
	}
	
	//return stmt but no formal args
	public static int add2() {
		int a=10;
		int b=20;
		return a+b;
	}
	
	//no return stmt and no formal args
	public static void add3() {
		int a=10;
		int b=15;
		System.out.println(a+b);
	}
	
	//no return stmt and with formal args
	public static void add4(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		int res=add(12,9);
		System.out.println(res);
		System.out.println(add(10,3));
		
		System.out.println(add2());
		
		add3();
		add4(12,8);
	}
}
