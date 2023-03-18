package practice_array;

import java.util.Iterator;
import java.util.Scanner;

public class _5_Print_ODD_elements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n= sc.nextInt();
		
		int a[]=new int[n]; // Remember we know size so creating Array ## mandatory
		
		System.out.println("Enter elements of Array");
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println("ODD element : "+ a[i]);
			}
		}
	}
}
