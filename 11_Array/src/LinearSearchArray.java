
public class LinearSearchArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] a= {10,50, 30, 40, 20};
	int search=20;
	boolean b = false;
	
	for (int i = 0; i < a.length; i++) {
		if (a[i]==search)
		{
			 System.out.println(i);
			 b=true;
			 break;
		}	
		}
		if (b=false)
		{
			System.out.println("Not found");
		}
	}

}
