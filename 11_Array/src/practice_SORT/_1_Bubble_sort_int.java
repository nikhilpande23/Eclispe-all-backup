package practice_SORT;

// Bubble sort by int datatype.
import java.util.Scanner;

public class _1_Bubble_sort_int {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n= sc.nextInt();
		
		int [] a=new int [n];
		
		System.out.println("Enter the elements of an Array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
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
