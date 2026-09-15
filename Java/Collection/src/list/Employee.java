package list;

public class Employee implements Comparable<Employee> {
	int eid;
	int e_age;
	String name;
	double salary;
	long contactNo;
	String email;
	String dept;
	
	public Employee(int eid, int e_age, String name, double salary, long contactNo, String email, String dept) {
		super();
		this.eid = eid;
		this.e_age = e_age;
		this.name = name;
		this.salary = salary;
		this.contactNo = contactNo;
		this.email = email;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", e_age=" + e_age + ", name=" + name + ", salary=" + salary + ", contactNo="
				+ contactNo + ", email=" + email + ", dept=" + dept + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.eid-o.eid;
	}


	
	
	
}
