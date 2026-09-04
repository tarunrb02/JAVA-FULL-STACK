package Day1;

public class Switch {
	public static void main(String[] args) {
		int a=1;
//		switch(a) {
//		case 1: System.out.println("Mon"); break;
//		case 2: System.out.println("Tue"); break;
//		case 3: System.out.println("Wed"); break;
//		case 4: System.out.println("The"); break;
//		case 5: System.out.println("Fri"); break;
//		case 6: System.out.println("Sat"); break;
//		case 7: System.out.println("Sun"); break;
//		default: System.out.println("invalid entry");
//		}
		
		switch(a) {
		case 1-> System.out.println("Mon"); 
		case 2-> System.out.println("Tue");
		case 3-> System.out.println("Wed");
		case 4-> System.out.println("The");
		case 5-> System.out.println("Fri");
		case 6-> System.out.println("Sat");
		case 7-> System.out.println("Sun");
		default-> System.out.println("invalid entry");
		}
	}
}
