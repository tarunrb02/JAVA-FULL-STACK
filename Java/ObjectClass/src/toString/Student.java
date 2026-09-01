package toString;

public class Student {
	int id;
	String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		// we can override give custom implementation
		return id+" "+name;
	}

	public static void main(String[] args) {
		Student s=new Student(1,"Tarun");
		
		System.out.println(s);  //implicitly toString method is called
		System.out.println(s.toString());
	}
}
