package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class AgeSorting implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.e_age - o2.e_age;
	}
}

class NameSorting implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}

class EmailSorting implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.email.compareTo(o2.email);
	}
}

class DeptSorting implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.dept.compareTo(o2.dept);
	}
}

class SalarySorting implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.salary - o2.salary);
	}
}

class ContactNoSorting implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.contactNo - o2.contactNo);
	}
}

public class SortingCustomArraylist {
	static void display(ArrayList<Employee> list) {
		for (Employee e : list)
			System.out.println(e);
	}

	static void menu() {
		System.out.println("Different Sorting Options ");
		System.out.println("1: Sorting Based on Id (Natural Sorting)");
		System.out.println("2: Sorting Based on age");
		System.out.println("3: Sorting Based on name");
		System.out.println("4: Sorting Based on salary");
		System.out.println("5: Sorting Based on contactNo");
		System.out.println("6: Sorting Based on email");
		System.out.println("7: Sorting Based on dept");
		System.out.println("0: Exit");
		System.out.println();
		System.out.println("Enter the choies:");
	}

	public static void main(String[] args) {
		ArrayList<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(new Employee(5, 20, "Tarun", 60000.0, 999999999, "tarunrb123@gmail.com", "IT"));
		listOfEmployee.add(new Employee(1, 25, "Affan", 70000.0, 111111111, "affan25@gmail.com", "HR"));
		listOfEmployee.add(new Employee(3, 22, "Rohit", 50000.0, 444444444, "rohit23@gmail.com", "BD"));
		listOfEmployee.add(new Employee(2, 18, "Manoj", 55000.0, 333333333, "manoj13@gmail.com", "HR"));
		listOfEmployee.add(new Employee(4, 23, "Kunal", 65000.0, 888888888, "kunal3@gmail.com", "IT"));

		while (true) {
			menu();
			Scanner sc = new Scanner(System.in);
			int choise = sc.nextInt();

			switch (choise) {
			case 1: {
				System.out.println("================Before Sorting================");
				display(listOfEmployee);
				Collections.sort(listOfEmployee);
				System.out.println();
				System.out.println("================After Natural Sorting================");
				display(listOfEmployee);
				System.out.println();
				break;
			}
			case 2: {
				System.out.println("================Before Sorting================");
				display(listOfEmployee);
				Collections.sort(listOfEmployee, new AgeSorting());
				System.out.println();
				System.out.println("================After Custom Sorting Based on Age ================");
				display(listOfEmployee);
				System.out.println();
				break;
			}
			case 3: {
				System.out.println("================Before Sorting================");
				display(listOfEmployee);
				Collections.sort(listOfEmployee, new NameSorting());
				System.out.println();
				System.out.println("================After Custom Sorting Based on Name ================");
				display(listOfEmployee);
				System.out.println();
				break;
			}
			case 4: {
				System.out.println("================Before Sorting================");
				display(listOfEmployee);
				Collections.sort(listOfEmployee, new SalarySorting());
				System.out.println();
				System.out.println("================After Custom Sorting Based on Salary ================");
				display(listOfEmployee);
				break;
			}
			case 5: {
				System.out.println("================Before Sorting================");
				display(listOfEmployee);
				Collections.sort(listOfEmployee, new ContactNoSorting());
				System.out.println("================After Custom Sorting Based on ContactNo ================");
				display(listOfEmployee);
			}
			case 6: {
				System.out.println("================Before Sorting================");
				display(listOfEmployee);
				Collections.sort(listOfEmployee, new EmailSorting());
				System.out.println("================After Custom Sorting Based on Email ================");
				display(listOfEmployee);
				System.out.println();
				break;
			}
			case 7: {
				System.out.println("================Before Sorting================");
				display(listOfEmployee);
				Collections.sort(listOfEmployee, new DeptSorting());
				System.out.println();
				System.out.println("================After Custom Sorting Based on Dept ================");
				display(listOfEmployee);
				System.out.println();
				break;
			}
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Invaid option, Enter valid choise");
			}
		}

//		System.out.println("================Before Sorting================");
//		for(Employee e:listOfEmployee)
//			System.out.println(e);
//		
//		Collections.sort(listOfEmployee);
//		
//		System.out.println("================After Natural Sorting================");
//		for(Employee e:listOfEmployee)
//			System.out.println(e);
//		
//		Collections.sort(listOfEmployee,new AgeSorting());
//		
//		System.out.println("================After Custom Sorting Based on Age ================");
//		for(Employee e:listOfEmployee)
//			System.out.println(e);
//		
//		
//		Collections.sort(listOfEmployee,new NameSorting());
//		
//		System.out.println("================After Custom Sorting Based on Name ================");
//		for(Employee e:listOfEmployee)
//			System.out.println(e);
//		
//		
//		Collections.sort(listOfEmployee,new SalarySorting());
//		
//		System.out.println("================After Custom Sorting Based on Salary ================");
//		for(Employee e:listOfEmployee)
//			System.out.println(e);
//		
//		
//		Collections.sort(listOfEmployee,new ContactNoSorting());
//		
//		System.out.println("================After Custom Sorting Based on ContactNo ================");
//		for(Employee e:listOfEmployee)
//			System.out.println(e);
//		
//		
//		Collections.sort(listOfEmployee,new EmailSorting());
//		
//		System.out.println("================After Custom Sorting Based on Email ================");
//		for(Employee e:listOfEmployee)
//			System.out.println(e);
//		
//		Collections.sort(listOfEmployee,new DeptSorting());
//		System.out.println("================After Custom Sorting Based on Dept ================");
//		for(Employee e:listOfEmployee)
//			System.out.println(e);
//		
//		

	}

}
