package list;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Collections;

public class ArrayListCustom {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(1, "tarun", "tarunrb@gamil.com"));
		list.add(new Student(4, "kunal", "kunal56@gamil.com"));
		list.add(new Student(2, "sagar", "sagar256@gamil.com"));
		list.add(new Student(3, "aman", "aman145@gamil.com"));
		list.add(new Student(6, "affan", "affan268@gamil.com"));
		list.add(new Student(5, "mani", "mani135@gamil.com"));

		

		Collections.sort(list);
		System.out.println("==========after sorting==========");
		for(Student s:list)
			System.out.println(s);

		
		Student s1 = new Student(2, "sagar", "sagar256@gamil.com");
		System.out.println("==========before==========");
		for(Student s:list)
			System.out.println(s);

		list.remove(s1);

		System.out.println("==========after==========");

		for(Student s:list)
			System.out.println(s);

		//		remove object based on properties of obj
		int n=5;
		Student found=null;
		//		int index=-1;
		//		for(int i=0;i<list.size();i++) {
		//			if(list.get(i).eid==n) {
		//				index=i;
		//			}
		//		}

		System.out.println("==========after==========");
		for(Student s:list) {
			if(s.eid==n) {
				System.out.println("Student found........");
				found=s;
				break;
			}
		}

		System.out.println(list.remove(found)?"Student removed sucessfully":"Student not found....");
		System.out.println("==========after removing based on eid==========");
		for(Student s:list)
			System.out.println(s);

		// based on name
		String name="aman";
		Student record=null;
		System.out.println("==========after==========");
		for(Student s:list) {
			if(s.name.equals(name)) {
				System.out.println("Student found........");
				record=s;
				break;
			}
		}

		System.out.println(list.remove(record)?"Student removed sucessfully":"Student not found....");
		System.out.println("==========after removing based on eid==========");
		for(Student s:list)
			System.out.println(s);

		// based on email
		String email="affan268@gamil.com";
		Student recordE=null;
		System.out.println("==========after==========");
		for(Student s:list) {
			if(s.email.equals(email)) {
				System.out.println("Student found........");
				recordE=s;
				break;
			}
		}

		System.out.println(list.remove(recordE)?"Student removed sucessfully":"Student not found....");
		System.out.println("==========after removing based on eid==========");
		for(Student s:list)
			System.out.println(s);
		
		
	}

}
