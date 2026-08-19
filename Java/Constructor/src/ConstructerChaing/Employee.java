package ConstructerChaing;

public class Employee {
	int id;
	String name;
	int age;
	
	Employee(){
		System.out.println(1);
//		System.out.println();
		
	}
	
	Employee(int id){
		this();
		this.id=id;
		System.out.println(2);
		System.out.println(id);
	}
	
	Employee(int id, String name){
		this(id);
		this.id=id;
		this.name=name;
		System.out.println(3);
		
		System.out.println(id+" "+ name);
	}
	Employee(int id, String name, int age){
		this(id, name);
		this.id=id;
		this.name=name;
		this.age=age;
		System.out.println(4);
		System.out.println(id+" "+ name+ " "+ age);
	}
	
	public static void main(String[] args) {
		Employee a=new Employee(101,"tarun",13);
	}

}
