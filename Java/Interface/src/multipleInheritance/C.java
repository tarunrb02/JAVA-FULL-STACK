package multipleInheritance;

public class C implements A, B {

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("demo imlementaion");
		
	}
	
	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(B.a);
		C c=new C();
		c.demo();
		
	}
}
