package other;

public class DigitSeperateOfNumber {
	public static void main(String[] args) {
		
		int n =231097;
		while (n != 0)
		{
			int d = n%10;
			System.out.print(d);
			n=n/10;
		}
	}

}
