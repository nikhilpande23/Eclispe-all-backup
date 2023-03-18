package practice_SEARCH;

public class _2_Binary_search {
	public static void main(String[] args) {
		int a [] = {8,10,1,87};	
		
		int search=1;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		
		while (li <= hi) {
			if (search==a[mi]) {
				System.out.println("Searching element present at index "+mi);
				break;
			}
			else if (search<a[mi]) {
				hi=mi-1;
			}
			else if (search > a[mi]) {
				li=mi+1;
			}
			mi=(li+hi)/2;
		}
	}

}

