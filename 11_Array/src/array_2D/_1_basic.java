package array_2D;

public class _1_basic {
	public static void main(String[] args) {
		 int [][]a= {{30,20,10},{40,60,50}};
		 System.out.println("Array by Array Literal ");
		 System.out.println(a);
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 System.out.println(a[1][1]);
		 
		 System.out.println("-----------------------------");
		 
		 System.out.println("Array by new Keyword ");
		 
//		 (use when same inner size array required)
		 int [] [] b = new int [3] [2]; // 3 Outer Array & 2 Inner Array 
		 
		 
//		 (use when different inner size array required)	 
		 int [] [] c = new int [4][];
		 c[0]=new int [2];
		 c[1]=new int [3];
		 c[2]=new int [6];
	}
	

}
