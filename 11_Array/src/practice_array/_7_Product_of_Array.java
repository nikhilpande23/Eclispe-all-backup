package practice_array;

public class _7_Product_of_Array {
public static void main(String[] args) {
		
		int []a= {10,3,5,2,8};
	
		int product=1;
		for (int i = 0; i < a.length; i++) {
			product=product*a[i];
		}
		System.out.println("Product of all : " + product);
	}

}
