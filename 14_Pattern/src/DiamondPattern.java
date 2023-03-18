
public class DiamondPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int r=1; r<=5; r++)
		{
			for ( int c=1; c <= 5; c++ )
			{
				if (r==3 || c==3)
				{
					System.out.print("* ");
				}
				else if (r==2 && c==2 || r==2 && c==4 || r==4 && c==4 || r==4 && c==2)
				{
					System.out.print("* ");
				}
				else
				{
					 System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
