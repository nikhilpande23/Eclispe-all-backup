package practice_string;
//Find occurrence of each character

public class _2_Occurance_of_characters {
public static void main(String[] args) {
	
	String s = "maharashtra";
	char[] c = s.toCharArray();
	boolean[] b = new boolean[c.length];
	
	for (int i = 0; i < b.length; i++) {
		if (b[i]==false) {
			int count=1;
			for (int j = i+1; j < b.length; j++) {
				if (c[i]==c[j]) {
					count++;
					b[j]=true;
				}
			}
			System.out.println(c[i]+" "+count);
		}
	}
  }
}
