
public class SpecialNumber {
	public static void main(String[] args) {

		int n =19;
		int sum=0;
		int multi=1;
		int temp=n;
		
		while(n != 0)
		{
			int d = n%10;
			n=n/10;
			sum=sum+d;
			multi=multi*d;
		}
		int res=sum+multi;
		if (res==temp)
		{
			System.out.print("It is special number");
		}
		else 
		{
			System.out.print("Not a special number");
		}
	}

}
