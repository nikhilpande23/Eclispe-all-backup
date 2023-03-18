package practice_string;

public class _910_Lexigraphical_order {
	public static void main(String[] args) {
		
		String [] a= {"bangkok", "japan", "manali", "kedarnath"};
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i].compareTo(a[j])>0) {
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
