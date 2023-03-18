package practice_array;

import java.util.Iterator;

public class _9_Reverse_array_elements {
	public static void main(String[] args) {
		int[]a= {10,2,5,3,8};
		
		for (int i = 0; i < a.length/2; i++) {
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
