package MethedOverraiding;

public class Tester extends Employee {
	@Override
	void action() {
		System.out.println("he tests app ");
	}
	
	public static void main(String[] args) {
		Tester t=new Tester();
		t.action();
		
		Employee e=new Employee();
		e.action();
	}
}
