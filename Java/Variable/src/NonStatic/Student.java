package NonStatic;

public class Student {
	int id=101;
	String name="Sagar";
	public static void main(String[] args) {
//		System.out.println(id); we can't use non static members inside static methods
		
		Student s= new Student();
		System.out.println(s.id);
		System.out.println(s.name);
	}
}
