package practice_array;

public class _8_sum_all_Even_element {
	public static void main(String[] args) {
		
		int [] a= {10,3,5,2,8};
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of all elements : " + sum);
	}

}
