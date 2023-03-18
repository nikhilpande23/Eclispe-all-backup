
public class ReverseStringSentense {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "india is my country";
		String [] a= s.split(" ");
	
	for (int i = 0; i < a.length; i++) {
		String rev="";
		for (int j = a[i].length()-1; j >=0; j--) {
			
				rev=rev+a[i].charAt(j);
			 
		}
		System.out.print(rev+" ");
	}
	}

}
