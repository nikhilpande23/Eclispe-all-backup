
public class NivenNumber {
	public static void main(String[] args) {
		
		int n = 18;
		int temp=n;
		int sum=0;
		while (n != 0)
		{
			int d=n % 10;
			n=n/10;
			sum=sum+d;
		}
		if (temp%sum==0)
		{
			System.out.print(temp + " Is Niven number");
		}
		else
		{
			System.out.print(temp + " Is Not Niven number");
		}
	}

}
