package lamdaExpresion;

public class Driver1 {
	public static void main(String[] args) {
		// no return type with no parameters
		A a1=()->{
			System.out.println("hello");
		};
		a1.add();
		
//		// no return type with parameters
		B b1=(int a, int b)->{
			System.out.println("Res-> "+(a+b));
		};
		b1.calculate(10, 20);
		
		B b2=(a, b)->{
			System.out.println("Res-> "+(a-b));
		};
		b2.calculate(20, 10);
		
		B b3=(var a, var b)->{
			System.out.println("Res-> "+(a*b));
		};
		b3.calculate(10, 20);
		
		
		// with return type & without parameters
		
		C c1=()-> {
			return 10;  //explicit return
		};
		System.out.println(c1.calculate());
		
		C c2=()-> 10;
		System.out.println(c2.calculate());
		
		// with return type & with parameters
		
		D d1=(a, b)->a+b;
		System.out.println(d1.calculate(10,20));
		
		D d2=(a, b)->{
			return a+b;
		};
		System.out.println(d2.calculate(10,20));
	}
}
