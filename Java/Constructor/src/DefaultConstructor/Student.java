package DefaultConstructor;

public class Student {
	String name;
	int id;
	
	public static void main(String[] args) {
		Student s=new Student();
		
		s.id=10;
		s.name="Vijay";
		System.out.println(s.id);
		System.out.println(s.name);
	}

}
