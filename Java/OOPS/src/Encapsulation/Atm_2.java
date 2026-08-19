package Encapsulation;

public class Atm_2 {
	private long accountNo;
	private int pin;
	private int balance;
	
	public void setter(long accountNo, int pin, int balance) {
		if(countDig(accountNo)==10) 
			this.accountNo= accountNo;
		else
			System.out.println("Enter invalid account number");
		
		if(countDig(pin)==4)
			this.pin= pin;
		else
			System.out.println("Enter invalid PIN number");
		
		if(balance>=0)
			this.balance=balance;
		else
			System.out.println("balence is negative");
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int getPin() {
		return pin;
	}
	
	int countDig(long a) {
		int count=0;
		while(a>0) {
			a=a/10;
			count++;
		}
		return count;
	}
}
