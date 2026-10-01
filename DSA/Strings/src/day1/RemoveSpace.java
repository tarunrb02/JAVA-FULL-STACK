package day1;

public class RemoveSpace {
	public static void main(String[] args) {
		String s1="Ja  Va";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ')
				s2+=s1.charAt(i);
		}
		System.out.println(s2);
		
		
		StringBuffer str = new StringBuffer("ja va");
		
		for (int i = str.length() - 1; i >= 0; i--) {
		    if (str.charAt(i) == ' ')
		        str.deleteCharAt(i);
		}
		System.out.println(str);
	}
}
