package ParameterizedConstructor;

public class Student {
	int id;
	String name;
	Student(int id, String name){
		this.id=id;
		this.name=name;
		System.out.println("this is constructor");
		
	}
	
	public static void main(String[] args) {
		Student s1=new Student(1, "Tarun");
		Student s2=new Student(2, "Arun");
		Student s3=new Student(3, "Varun");
		
		System.out.println(s1.id+" "+ s1.name);
		System.out.println(s2.id+" "+ s2.name);
		System.out.println(s3.id+" "+ s3.name);
		}

}
