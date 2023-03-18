
public class PerfectNumber {

	public static void main(String[] args) {

		int n=496;
		int sum=0;
		
		for (int i = 1; i <n; i++) {
			if (n%i==0) {
				sum=sum+i;
			}
			else {
				
			}
		}
		
		if (n==sum) {
			System.out.println("perfect");
		}
		else {
			System.out.println("Not perfect");
		}
		
		
	}

}
