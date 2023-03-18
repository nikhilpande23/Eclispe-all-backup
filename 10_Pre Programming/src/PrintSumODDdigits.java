
public class PrintSumODDdigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=231097;
		while(n != 0)
		{
			int d = n%10;
			n = n/10;
			if ( d % 2 != 0)
			{
				sum=sum+d;
			}
		}
		System.out.print(sum);
	}


}
