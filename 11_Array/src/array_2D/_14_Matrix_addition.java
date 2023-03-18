package array_2D;

public class _14_Matrix_addition {
	
	public static void main(String[] args) {
		
		int a [] []= { {10,20,30}, {40,50,60}, {70,80,90}};
		int b [] []= { {10,20,10}, {10,30,20}, {10,10,00}};
		
		for (int i = 0; i < a[i].length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
