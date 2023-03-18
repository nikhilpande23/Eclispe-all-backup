
public class SwappingWithoutExrtaVariable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.print("without swapping");
		System.out.print("a " +a);
		System.out.print("b " +b);
		System.out.print("After swapping");
		a=a+b;
		b=a-b;
		System.out.print("b "+b);
		a=a-b;
		System.out.print("a "+a);
	}


}
