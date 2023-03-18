
public class PalindromeOrNot {
	public static void main(String[] args) {
		
		int n = 121;
		int temp=n;
		int rev = 0;
		
		while (n != 0)
		{
			int d =n%10;
			n = n/10;
			rev = rev*10+d;
		}
		System.out.println(rev);
		if (temp==rev)
		{
			System.out.print("Yes. Palindrome");
		}
		else
		{
			System.out.print("Not.Palindrome");
		}
	}

}
