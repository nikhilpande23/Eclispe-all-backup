package practice_string;

public class _4_Reverse_String_by_word {
	
	public static void main(String[] args) {
		String s="Nikhil Navnath Pande";
		String[] a = s.split(" ");
		
		for (int i = 0; i < a.length; i++) {
			String rev="";
			for (int j = a[i].length()-1; j >=0 ; j--) {
				rev=rev+a[i].charAt(j);
			}
			System.out.print(rev+" ");
		}
		for (int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
	}	
}
