
public class ArrayPrint2D {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][]= { {10,20,30},{40,50,60},{70,80,90} };
		for (int i=0;i<a.length;i++)
		{
			for (int r=0; r<a[i].length; r++)
			{
				System.out.print(a[i][r]+" ");
			}
			System.out.println();//print like matrices
		}
		
	}
}
