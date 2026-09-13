package list;

import java.util.Objects;

public class Student {
	int eid;
	String name;
	String email;
	public Student(int eid, String name, String email) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [eid=" + eid + ", name=" + name + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(eid), email, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return eid == other.eid && Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}
	
	

}
