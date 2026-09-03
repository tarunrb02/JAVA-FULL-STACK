package hashCode;

import java.util.Objects;

public class Student extends Object {
	int id;
	String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	
	public static void main(String[] args) {
		Student s1=new Student(1,"tarun");
		Student s2=new Student(1,"tarun");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
