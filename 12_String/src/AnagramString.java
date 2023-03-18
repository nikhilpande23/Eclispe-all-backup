
public class AnagramString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="cat";
		String s2="act";
		
		if (s1.length()==s2.length())
		{
			char [] c1= s1.toCharArray ();
			char []c2=s2.toCharArray();
			sort(c1);
			sort(c2);
			boolean b=true;
			for (int i = 0; i < c2.length; i++) {
				if(c1[i]!=c2[i])
				{
					System.out.print("Not anagram, but same length");
					b=false;
					break;
				}
			}
			if (b)
			{
				System.out.print("Yes anagram");
			}
		}
		else
		{
			System.out.print("Length not same. Not anagram");
		}
			
		}
		public static void sort (char[]c)
		{
			//selection sort
			for (int i = 0; i < c.length; i++) {
				int min=i;
				for (int r = i+1; r < c.length; r++) {
					if (c[r]>c[i])
					{
						min=r;
					}
					char temp=c[i];
					c[i]=c[min];
					c[min]=temp;
				}
			}
		}
}
