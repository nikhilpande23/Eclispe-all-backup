package ff;

public class PalindromORnot {
	
	public static void main(String[] args) {
		String s = "dad";
		String rev = "";	
		
		for (int i = 0; i < s.length(); i++) {
			rev = rev+s.charAt(i);
		}
		
		if (s.equals(rev)) {
			System.out.println("Yes Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
			
		}

}
