
package Constructor_Overloading;

public class Student {
	int id;
	String name;
	Student(){
		id=101;
		name="aman";
	}
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	Student(String name, int id){
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.id+" "+s1.name);
		
		Student s2=new Student(102, "Tarun");
		System.out.println(s2.id+" "+s2.name);
		
		Student s3=new Student("Arun",103);
		System.out.println(s3.id+" "+s3.name);
	}
	
}
