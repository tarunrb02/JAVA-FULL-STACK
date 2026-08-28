package CompileTimePoly;

public class Addition {
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(1,2);
		a.add(1,2,3);
	}
}
