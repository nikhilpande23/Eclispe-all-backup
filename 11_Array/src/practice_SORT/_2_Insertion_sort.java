package practice_SORT;

// By JENNY's youTube lecture

public class _2_Insertion_sort {
	public static void main(String[] args) {
		
		int a[]= {30,10,20,5};
		
		
		for (int i = 1; i < a.length; i++) {
			
			int temp=a[i];
			int j=i-1;
			
			while (j >= 0 && a[j] > temp) {
				
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		
		System.out.println("Insertion Sorted Array :");
		for (int i = 0; i < a.length; i++) {
			System.out.print( a[i] + " ");
		}
	}

}
