package practice_string;
// Correct output also by changing the input.
public class _3_Anagram {
	
public static void main(String[] args) {
	
	String s1="act";
	String s2="cat";
	if (s1.length()==s2.length()) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		sort(c1);
		sort(c2);
		boolean b=true;
		for (int i = 0; i < c2.length; i++) {
			if (c1[i]!=c2[i]) {
				System.out.println("Not anagram, but same length");
				b=false;
				break;
			}
		}
			if (b) {
				System.out.println("Yes anagram");
			}
		}
	
	else {
		System.out.println("Length not same. Not a anagram");
	}
}
	public static void sort(char [] c) {
	for (int i = 0; i < c.length; i++) {
		int min=i;
		for (int j = i+1; j < c.length; j++) {
			if (c[j]>c[i]) {
				min=j;
			}
			char temp=c[i];
			c[i]=c[min];
			c[min]=temp;
		}
	  }
	}
}
