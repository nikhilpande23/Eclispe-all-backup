
public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {30, 10, 60, 20, 50, 40}; // array creation
		
		for (int i=0; i<a.length; i++)
		{
			for (int r=i+1; r<a.length; r++)
			{
				if (a[i]>a[r])
				{
					int temp = a[i];
					a[i] = a[r];
					a[r] = temp;
				}
			}
		}
		
		for (int i=0; i<a.length; i++)
		{
		System.out.print(a[i]+" ");
		}
		
	}
}
