package practice_string;

public class _1_Palindrome {
	public static void main(String[] args) {
		
		String s=" dad ";
		s=s.trim();
		String rev="";
		
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Yes, palindrome");
		}
		
		else {
			System.out.println("No Palindrome");
		}
		
		
	}

}
