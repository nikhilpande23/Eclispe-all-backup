package array_2D;

public class _12_Print_in_RowColumn_format {
	public static void main(String[] args) {
		int a [] [] = {{10,20,30},{40,50,60},{70,80,90}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
