package RunTimePoly;

public class Car extends Vehicle {
	@Override
	void action(){
		System.out.println("Car driving");
	}
	
	public static void main(String[] args) {
		Vehicle v=new Car();
		v.action();
	}


}
