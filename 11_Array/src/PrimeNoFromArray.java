
public class PrimeNoFromArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		for (int i=0; i<a.length; i++)
		{
			int count = 0;
			for (int r=1; r <= a[i]; r++)
			{
				if (a[i] % r == 0)
				{
					count++;
				}
			}
		if (count == 2)
		{
			System.out.print ("Prime numbers : " + a[i]);
		}	
	}
  }

}
