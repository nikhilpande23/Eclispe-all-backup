
public class BubbleSortOfChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a [] = {'x', 'z', 'a', 'y', 'c', 'b'}; // array creation
		
		for (int i=0; i<a.length; i++)
		{
			for (int r=i+1; r<a.length; r++)
			{
				if (a[i]>a[r])
				{
					char temp = a[i];
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
