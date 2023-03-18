
public class TripletArrayProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {10,20,30,40,50};
		int product = 90;
		for (int i=0; i<a.length; i++)
		{
			for (int r = i+1; r<a.length; r++)
			{
				for (int k=r+1; k<a.length; k++)
				{
					if (a[i] + a[r] + a[k] == product )
					{
						System.out.print(a[i] +" "+ a[r] + " " + a[k]);
					}
				}
			}
		}
	}

}
