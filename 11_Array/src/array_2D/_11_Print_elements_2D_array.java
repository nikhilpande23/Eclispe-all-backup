package array_2D;

public class _11_Print_elements_2D_array {
	public static void main(String[] args) {
		int a [] [] = {{10,20,30},{40,50,60}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
		}
	}

}
