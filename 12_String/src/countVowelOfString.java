
public class countVowelOfString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Nikhil";
		int count=0;
		char [] c= s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
			{
				count++;
			}
		}
		System.out.print(count);
	}

}
