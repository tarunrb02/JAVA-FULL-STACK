package day2;

public class AddChar {
	public static void main(String[] args) {
		String s="java";
		String s1="";
		int index=2;
		for(int i=0;i<s.length();i++) {
//			if(i==index)
//				s1+="a"+s.charAt(i);
//			else
//				s1+=s.charAt(i);
			s1+=(i==index)?("a"+s.charAt(i)):s.charAt(i);
		}
		System.out.println(s1);
	}
}
