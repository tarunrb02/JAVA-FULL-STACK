package non_static_methods;

public class Addition {
	//non Static  method with return type and formal arguments
	public int add1(int a, int b) {
		return a+b; 
	}
	
	//non Static  method with return type and no formal arguments
	public int add2() {
		return 10+20;
	}
	
	//non Static  method with no return type but with formal arguments
	public void add3(int a, int b) {
		System.out.println(a+b);
	}
	
	//non Static  method with no return type and no formal arguments
	public void add4() {
		System.out.println(4+16);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		System.out.println(a.add1(5, 9));
		System.out.println(a.add2());
		a.add3(15, 18);
		a.add4();
	}

}
