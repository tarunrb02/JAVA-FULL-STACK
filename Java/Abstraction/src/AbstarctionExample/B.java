package AbstarctionExample;

public class B extends A {

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("B claas method overriden");
	}

	public static void main(String[] args) {
		B b=new B();
		b.method1();
		b.method2();
	}
}
