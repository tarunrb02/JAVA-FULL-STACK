package Hyrid_Inheritance;

public class Car extends Vehicle {
	String Model;
	
	public static void main(String[] args) {
		Car c= new Car();
		c.brand="BMW";
		c.color="red";
		c.Model="M5";
		
		c.start();
		System.out.println("Car Brand is "+c.brand+" and color is "+c.color+" and Model is "+c.Model);
		c.stop();
		
	}

}
