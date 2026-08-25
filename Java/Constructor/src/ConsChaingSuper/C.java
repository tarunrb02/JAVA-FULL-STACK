package ConsChaingSuper;

public class C extends B {
	C(){
		System.out.println("C class Constructor");		
	}
//	C(int a, int b){
//		
//	}
	public static void main(String[] args) {
		C c=new C();
		System.out.println(c.a);
	}
}
