package ConstructerChaing;

public class A {
	A(){
		System.out.println(1);
//		System.out.println();
		
	}
	
	A(int a){
		this();
		System.out.println(2);
		System.out.println(a);
	}
	
	A(int a, int b){
		this(a);
		System.out.println(3);
		
		System.out.println(a+" "+ b);
	}
	
	public static void main(String[] args) {
		A a=new A(10, 20);
	}

}
