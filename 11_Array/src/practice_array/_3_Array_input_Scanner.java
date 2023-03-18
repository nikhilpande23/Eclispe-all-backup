package practice_array;

import java.util.Scanner;

// Use scanner class & take input as a Array

public class _3_Array_input_Scanner {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
	
		int [] a= new int[n]; //we know size only.
		
		System.out.println("Enter element of Array in int datatype");
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array is : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
