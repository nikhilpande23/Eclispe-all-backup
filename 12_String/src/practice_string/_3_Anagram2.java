package practice_string;
// my own logic, but not working for some of the input like cat / mat
public class _3_Anagram2 {
	public static void main(String[] args) {
		
		String s1 = "cat";
		String s2 = "act";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		sort(c1);
		sort(c2);

		if (s1.length()==s2.length()) {
			
			if (c1.length==c2.length) {
				
					for (int i = 0; i < c2.length; i++) {
						if (c1[i]==c2[i]) {
							System.out.println("Yes Anagram");
							break;
						}
						else {
							System.out.println("Not anagram, but length same");
							break;
						}									
				}
			}
		}
			if (c1.length!=c2.length) {
				System.out.println("Length not same, Not a Anagram");		
		}
	}
	public static void sort(char[] c)
	{	
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
