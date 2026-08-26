package Upcasting;

public class Dog extends Animal {
	void sound() {
		System.out.println("Bark");
	}

	public static void main(String[] args) {
		Animal a=new Dog(); // up casting
		//		a.name="tom"; but we can't access child members
		if(a instanceof Dog) {

			Dog d=(Dog) a;  // down casting
			d.name="tommy";
			d.sound();
			System.out.println(d.name);
		}
		else 
		{
			Cat c=(Cat) a;
			c.name="tom";
			c.sound();
			System.out.println(c.name);
		}
	}

}
