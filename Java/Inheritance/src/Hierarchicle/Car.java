package Hierarchicle;

public class Car extends Vehicle {
	int weels;
	String CarType;
	
	public static void main(String[] args) {
		Car c=new Car();
		c.brand="BMW";
		c.color="Red";
		c.CarType="Sports";
		c.weels=4;
		
		c.start();
		System.out.println(c.brand+" "+c.color+" "+c.CarType+" With "+c.weels+" weels");
		c.stop();
		
	}
}
