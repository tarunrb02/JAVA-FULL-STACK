package stringExample;

public class Example {
	public static void main(String[] args) {
		//literal way
		String s1="java";
		String s2="Tarun";
		System.out.println(s1==s2);
		
		//as an object
		String s3=new String("java");
		String s4=new String("java");
		System.out.println(s3==s4);
		System.out.println(s3==s1);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		System.out.println(s3);
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s1));
		
		System.out.println(s1.hashCode());
		
	}

}
