package RunTimePoly;

public class Bike extends Vehicle{
	@Override
	void action(){
		System.out.println("Bike ridding");
	}
	
	public static void main(String[] args) {
		Vehicle v=new Bike();
		v.action();
	}

}
