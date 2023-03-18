
public class PalindromeString {
	public static void main(String[] args) {
		
		String s = " Level";
		String rev = "";
					s=s.trim(); //If i/p have space. use it to remove space & then compare
		
		for (int i=s.length()-1; i>=0;i--)
		{
			rev=rev + s.charAt(i);
		}
		if (s.equalsIgnoreCase(rev))
		{
			System.out.print("Yes it is Palindrome");
		}
		else {
			System.out.print("Not a Palindrome");
		}
	}


}
