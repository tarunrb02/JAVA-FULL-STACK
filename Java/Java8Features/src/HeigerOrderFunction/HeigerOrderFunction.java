package HeigerOrderFunction;

public class HeigerOrderFunction {
	
	static void printer(Calculator c) {
		int res=c.claculate(10,20);
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		printer((a,b)->a+b);
	}
}
