package Encapsulation;

public class Driver {
	static void use() {
		Atm a= new Atm();
		a.diposit(10000);
			System.out.println(a.withdraw());
	}
	public static void main(String[] args) {
		use();
	}
}
