package practice_array;

public class _6_Sum_all_elements {
	public static void main(String[] args) {
		
		int []a= {10,3,5,2,8};
	
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of all : " + sum);
	}
	

}