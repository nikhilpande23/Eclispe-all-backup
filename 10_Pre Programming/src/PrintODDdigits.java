
public class PrintODDdigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =231097;
		while ( n != 0)
		{
			int d= n%10;
			n=n/10;
			if (d%2 != 0)
			{
				System.out.print(d);
			}
		}
	}
}
