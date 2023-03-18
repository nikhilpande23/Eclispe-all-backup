package practice_string;
// convert upper to lower and vice versa
public class _7_Convert_upper_to_lower {
	public static void main(String[] args) {
		String s="helLO";
		char[] a=s.toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>='A'&& a[i]<='Z') {
				System.out.print((char)(a[i]+32));
			}
			else if (a[i]>='a' && a[i]<='z') {
				System.out.print((char)(a[i]-32));
			}
		}
	}

}
