package NonStatic;

public class Book {
	double price=700;
	String name="Harry Potter";
	public static void main(String[] args) {
		double price=800;
		String name1="java";
		
		Book b1=new Book();
		
		System.out.println(b1.name + " - " + b1.price);
		System.out.println(name1 + " - " + price);
	}
}
