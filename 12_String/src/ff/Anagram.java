package ff;

public class Anagram {

	public static void main(String[] args) {
		String s1="act";
		String s2 = "cat";
		
		if (s1.length() == s2.length()) 
		{
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			sort(c1);
			sort(c2);
			
			boolean b = true;
			
			for (int i = 0; i < c2.length; i++) 
			{
				
				if (c1[i] != c2[i])
				{
					System.out.println("Not an Anagram...");
					b=false;
					break;
				}
			}
			
			if(b) {
				System.out.println("Yes Anagarm...");
			}
			
		}
		
		else {
			System.out.println("lenghth not same! No Anagram...");
		}

	}
	
	public static void sort(char [] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if (c[i]>c[j]) {
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
	}

}
