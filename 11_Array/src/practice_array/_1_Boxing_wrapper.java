package practice_array;

// Boxing - Primitive to non-primitive conversion.

public class _1_Boxing_wrapper {
	public static void main(String[] args) {
		
//		AutoBoxing
		int a=10; //primitive
		Integer i=a; // Integer is Non-primitive _ AutoBoxing done
		
		System.out.println("Direct "+ i);
		System.out.println("toString "+ i.toString());
		
	System.out.println("------------------------");	
	
//		Manually Boxing
		Integer i1 = Integer.valueOf(20); // boxing
		System.out.println("Direct "+i1);
		System.out.println("toString "+i1.toString());
		
	}

}
