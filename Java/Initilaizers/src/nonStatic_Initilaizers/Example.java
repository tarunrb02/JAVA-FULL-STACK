package nonStatic_Initilaizers;

public class Example {
	//non-static block
	{
		System.out.println("Wellcome i am 1st non-static intilaizer");
	}
	
//	Constructor
	Example(){
		System.out.println(" I am Constructor");
	}
	
	//non-static block
	{
		System.out.println("Wellcome i am 2nd non-static intilaizer");
	}
	
	//static block
	static {
		System.out.println("I am Static initializer");
	}
	public static void main(String[] args) {
		System.out.println("Hi");		
		System.out.println("before object creation");
		
		Example a=new Example();
		
		System.out.println("After object creation");
		
//		Example b=new Example();
	}

}
