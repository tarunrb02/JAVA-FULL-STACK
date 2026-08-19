package Method_Overloading;

public class Overload {
	static void details(int id, String name) {
		System.out.println(id+" "+name);
	}
	static String details(int id, String name, long phone_no) {
		return id+" "+name+" "+phone_no;
	}
	static void details(String id, String name, long phone_no) {
		System.out.println(id+" "+name+" "+phone_no);
	}
	static String details(String name, int id, long phone_no) {
		return id+" "+name+" "+phone_no;
	}
	
	public static void main(String[] args) {
		details(101,"Tarun");
		System.out.println(details(102,"Sagar", 9686968696L));
		details("103","Asif",86859868586L);
		System.out.println(details("Naveen",104,365267595L));
	}
}
