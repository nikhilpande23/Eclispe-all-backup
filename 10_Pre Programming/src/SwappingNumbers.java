
public class SwappingNumbers {
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		System.out.print("Before swapping ");
		System.out.print(a+" ");
		System.out.println(b);
		
//		int c=a+b;
		int temp=a;
		a=b;
		b=temp;
		System.out.print("after swapping  ");
		System.out.print(a+" ");
		System.out.print(b);
		
	}

}
