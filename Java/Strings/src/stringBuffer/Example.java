package stringBuffer;

public class Example {
	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("Java");
		System.out.println(s.append(" programing"));
		System.out.println(s);
		System.out.println(s.capacity()+"  "+s.length());
		
		StringBuffer s1= new StringBuffer(50);
//		s1 = s1+"tarun"; //we can't concatenate String with StringBuilder
//		s1=s1+s;
		s1.append("Sagar");
		System.out.println(s1.capacity()+"  "+s1.length());
		
	}
}
