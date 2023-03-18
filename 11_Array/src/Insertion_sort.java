
public class Insertion_sort {
public static void main(String[] args) {
		
		int a[]= {30,10,20,5};
		
		
		for (int i = 1; i < a.length; i++) {
			
			int temp=a[i];
			int j=i;
			
			while (j > 0 && a[j-1] > temp) {
				
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		
		System.out.println("Insertion Sorted Array :");
		for (int i = 0; i < a.length; i++) {
			System.out.print( a[i] + " ");
		}
	}


}
