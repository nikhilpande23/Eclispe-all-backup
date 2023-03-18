package array_2D;

public class _13_Print_in_Diagonal_elements {
	public static void main(String[] args) {
		
		int a [] [] = {{10,20,30},{40,50,60},{70,80,90}};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i][i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i+j==2) {
					System.out.print(a[i][j]+" ");
				}
			}
		}
		
	}

}
