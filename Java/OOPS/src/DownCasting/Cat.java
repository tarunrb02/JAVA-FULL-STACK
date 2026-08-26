package DownCasting;

public class Cat extends Animal {
	void sound() {
		System.out.println("Maow");
	}
	
	public static void main(String[] args) {
		Animal a=new Cat(); // up casting
//		a.name="tom"; but we can't access child members
		Cat c=(Cat) a;  // down casting
		c.name="tom";
		c.sound();
		
	}
}
