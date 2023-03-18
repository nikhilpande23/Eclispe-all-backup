package practice_array;

public class _10_Largest_element_Array {
	public static void main(String[] args) {
		int a[]= {10,2,5,30,8};
		
		int large=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>large) {
				large=a[i];
			}
		}
		System.out.println("Largest element : "+ large);
	}

}
