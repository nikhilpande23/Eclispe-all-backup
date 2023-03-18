package practice_SEARCH;

import java.util.Scanner;

public class _1_Linear_search {
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element to search ");
		int n= sc.nextInt();
		
		int a [] = {8,10,1,4,3,2,3};		
		int search=n;
		
		boolean b=false;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==search) {
				System.out.println(search +" is Present at index : "+i);
				b=true;
//				break;
			}
		}
			if (b==false) 
			{
				System.out.println(search +" is Not present in Array");
			}
		}
		
	}
