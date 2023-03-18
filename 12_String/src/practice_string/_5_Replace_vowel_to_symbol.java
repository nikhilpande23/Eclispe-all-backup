package practice_string;

public class _5_Replace_vowel_to_symbol {
	public static void main(String[] args) {
		String s="apple";
		char[] a=s.toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]=='a'|| a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'
					|| a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') {
				a[i]='%';
			}
			System.out.print(a[i]);
		}
	}

}
