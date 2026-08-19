package Method_Overloading;

public class Pizza {
	static void topings(String a) {
		System.out.println("Extra topings "+a+" added");
	}
	static void topings(String a, String b) {
		System.out.println("Extra topings "+a+", "+ b+" added");
	}
	static void topings(String a, String b,String c) {
		System.out.println("Extra topings "+a+", "+ b+", "+ c+" added");
	}
	static void topings(String a, String b,String c,String d) {
		System.out.println("Extra topings "+a+", "+ b+", "+ c+", "+ d+" added");
	}
	
	public static void main(String[] args) {
		topings("cheess");
		topings("cheess","corn");
		topings("cheess","corn","capsicum");
		topings("cheess","corn","capsicum","chicken");
		
		
	}
}
