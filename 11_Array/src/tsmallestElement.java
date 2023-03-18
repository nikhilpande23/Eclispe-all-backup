
public class tsmallestElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {4, 1, 0, 2, 4, 1}; //array creation
		 int small = Integer.MAX_VALUE;
		 int ssmall = Integer.MAX_VALUE;
		 int tsmall = Integer.MAX_VALUE;
		 
		 
		 for (int i=0; i<a.length;i++)
		 {
			 if (a[i]<small)
			 {
				 tsmall=ssmall;
				 ssmall=small;
				 small=a[i];
			 }
			 else if (a[i]<ssmall && a[i] != small)
			 {
				 tsmall = ssmall;
				 ssmall=a[i];
			 }
			 else if (a[i] < tsmall && a[i] != ssmall && a[i] != small)
			 {
				 tsmall = a[i];
			 }
		 }
		 	System.out.println("small "+small);
			System.out.println("ssmall "+ssmall);
			System.out.println("tsmall "+tsmall);
		 
		
	}

}
