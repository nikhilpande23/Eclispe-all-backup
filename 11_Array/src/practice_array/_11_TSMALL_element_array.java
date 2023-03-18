package practice_array;

public class _11_TSMALL_element_array {

	public static void main(String[] args) {
		int a[]= {10,2,5,3,8};
		
		int small=Integer.MAX_VALUE;
		int ssmall=Integer.MAX_VALUE;
		int tsmall=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<small) {
				tsmall=ssmall;
				ssmall=small;
				small=a[i];
			}
			else if (a[i]<ssmall && a[i] != small) {
				tsmall=ssmall;
				ssmall=a[i];
			}
			else if (a[i]<tsmall && a[i] != ssmall && a[i] != small) {
				tsmall=a[i];
			}
		}
		System.out.println("tsmall "+tsmall);
		System.out.println("ssmall "+ssmall);
		System.out.println("small "+small);
	}
}
