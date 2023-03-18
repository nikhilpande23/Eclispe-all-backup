
public class DiagonalArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i][i]+" ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int r = 0; r < a[i].length; r++) {
				if (i+r==2) {
					 System.out.print(a[i][r]+" ");
					
				}
			}
		}
	}
}
