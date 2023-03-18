
public class EmptyBoxPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int r=1; r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if (r==1||c==1||r==5||c==5)
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
