package practice_string;

import java.util.Scanner;

public class _911_Lexographical_Scanner {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String [] a=new String[n]; // creating array when size is known.
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.next();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i].compareTo(a[j])>0) {
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Answer: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
