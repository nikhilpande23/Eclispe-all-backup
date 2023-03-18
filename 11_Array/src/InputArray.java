import java.util.Scanner;

public class InputArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // scanner calling stmnt
		System.out.print("Enter the size of array.");
		int n = sc.nextInt(); // to store input
		int a []= new int[n]; //array creation with new keyword ( IF SIZE KNOWN )
		 for (int i=0; i<a.length; i++)
		 {
			 System.out.print("Enter the elements of array");
			 a[i] = sc.nextInt(); 
		 }
		 
		 System.out.print("Following are the array elements");
		 for (int i=0; i<a.length; i++)
		 {
			 System.out.print(a[i]+" ");
		 }
		 		 
	}

}
