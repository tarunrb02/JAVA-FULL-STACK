package day2;

public class RemoveFirstLastChar {
	public static void main(String[] args) {
		String s="Google";
		String s1="";
		for(int i=1;i<s.length()-1;i++)
			s1+=s.charAt(i);
		System.out.println(s1);
		
		System.out.println(s.substring(1, s.length()-1));
		
		//StringBuffer
		StringBuffer str = new StringBuffer("Google");
		System.out.println(str.substring(1, str.length()-1));
		str.deleteCharAt(0);
		str.deleteCharAt(str.length()-1);
		System.out.println(str);
	}
}
