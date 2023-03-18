
public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int count = 0;
		for (int i = 1; i<=n; i++)
		{
			if ( n%i==0)
			{
				count++;
			}
		}
		if ( count == 2)
		{
			System.out.print("number is Prime");
		}
		else
		{
			System.out.print("Number is Not Prime");
		}
	}
}
