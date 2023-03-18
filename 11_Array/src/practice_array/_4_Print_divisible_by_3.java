package practice_array;

import java.util.Scanner;

public class _4_Print_divisible_by_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n= sc.nextInt();
		
		int [] a= new int[n];
		
		System.out.println("Enter Array elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Result : elements divisble by 3");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
