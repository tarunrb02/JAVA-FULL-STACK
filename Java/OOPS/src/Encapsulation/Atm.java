package Encapsulation;

public class Atm {
	private static int money;
	
	public void diposit(int money) {
		Atm.money=money;
	}
	
	public int withdraw() {
		return money;
	}
	public static void main(String[] args) {
//		Driver d=new Driver();
//		d.use();
		Driver.use();
		System.out.println(money);
	}

}
