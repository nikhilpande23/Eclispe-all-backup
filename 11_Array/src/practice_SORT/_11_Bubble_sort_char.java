package practice_SORT;

import java.util.Scanner;

public class _11_Bubble_sort_char {
	public static void main(String[] args) {
		
		
		char [] a= {'d','a','c','b','f','e'};
	
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
