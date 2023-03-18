
public class ProductOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product=1;
		int n=123;
		while(n != 0)
		{
			int d = n%10;
			n=n/10;
			product=product*d;
		}
		System.out.print(product);
	}
}
