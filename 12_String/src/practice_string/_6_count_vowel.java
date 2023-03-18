package practice_string;
//count the vowels present in the string

public class _6_count_vowel {
	public static void main(String[] args) {
		
		String s="Apple Califronia"; // a e i o u - vowels
		
		char[] a=s.toCharArray();
		
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]=='a'|| a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'
					|| a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') {
				count++;
			}		
		}
		System.out.println("Total vowel in string : "+ count);
	}
}
