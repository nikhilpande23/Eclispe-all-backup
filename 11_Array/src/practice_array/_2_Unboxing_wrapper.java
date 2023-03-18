package practice_array;

// Non-primitive to primitive conversion

public class _2_Unboxing_wrapper {
	public static void main(String[] args) {
		//Auto
		Integer i=20;
		int a=i; 
		System.out.println("Direct "+a);
		
		// Manually
		int b=i.intValue();
		System.out.println("Explicit "+ b);
		
	}

}
