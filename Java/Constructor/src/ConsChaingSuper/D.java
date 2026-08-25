package ConsChaingSuper;

public class D extends A {
	D(){
		super(10);
		System.out.println("C class Constructor");		
	}
//	C(int a, int b){
//		
//	}
	public static void main(String[] args) {
		D d=new D();
		System.out.println(d.a);
	}

}
