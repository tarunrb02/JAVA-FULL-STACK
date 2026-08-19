package DefaultConstructor;

public class NonParameterized {
	int id;
	String name;
	
	NonParameterized(){
		System.out.println("this is NonParameterized Constructor");
	}

	public static void main(String[] args) {
		NonParameterized a= new NonParameterized();
		a.id=10;
		a.name="Tarun";
		NonParameterized b= new NonParameterized();
		System.out.println(b.id+" "+b.name);
		b.id=20;
		b.name="Sagar";
		System.out.println(a.id+" "+a.name);
		System.out.println(b.id+" "+b.name);
		
	}
}
