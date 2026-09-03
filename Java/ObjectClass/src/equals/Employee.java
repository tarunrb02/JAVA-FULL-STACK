package equals;

public class Employee {
	int id;
	String name;
	
	Employee(int id, String name){
		this.name=name;
		this.id=id;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Employee) {
			Employee e= (Employee) o;
			if(this.id==e.id && this.name==e.name)
				return true;

		}
		return false;
	}
	
	public boolean equals(Employee e) {
		return (this.id==e.id && this.name.equals(e.name));
	}
	public static void main(String[] args) {
		Employee e1=new Employee(1, "Tarun");
		Employee e2=new Employee(1, "Tarun");
		System.out.println(e1.equals(e2));
	}

}
