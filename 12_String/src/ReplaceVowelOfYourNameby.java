
public class ReplaceVowelOfYourNameby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nikihl";
		char [] c=s.toCharArray();
		
		for (int i = 0; i < c.length; i++) 
		{
			if (c[i]=='i') 
			{
				c[i]='%';
				
			}
			
		}
		s=new String(c);
		System.out.println(s);

	}

}
