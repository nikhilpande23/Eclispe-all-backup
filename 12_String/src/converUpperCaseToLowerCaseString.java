
public class converUpperCaseToLowerCaseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="NikhilPande";
		char []c= s.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if(c[i]>='A'&&c[i]<='Z')
			{
				System.out.print((char) (c[i]+32) );
			}
			else if (c[i]>='a'&&c[i]<='z')
			{
				System.out.print((char)(c[i]-32));
			}
		}
	}
}
