package practice_string;

import java.util.Iterator;

public class _8_combine {
	public static void main(String[] args) {
//	---	------------------------------------------------------------------
	String s="meet me at the clock tower";  // m%%t #e AT th% ##o## TOWER
	String[] a=s.split(" ");
//	----------------------------------------------------------------------
	for (int i = 0; i < a.length; i++) {
		if (i%3==0)
		{
			System.out.print(v(a[i])+" ");
		}
		if(i%3==1)
		{
			System.out.print(co(a[i])+" ");
		}
		if(i%3==2)
		{
			System.out.print(casechange(a[i])+" ");
		}
	}
}
//	-----------------------------------------------------------------------
	public static String v(String s)
	{
		char [] c=s.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||
				c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
			{
				c[i]='%';
			}
		}
		return new String (c);
	}
//	----------------------------------------------------------------------
	
	public static String co(String s) {
		char [] c=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]!='a'&&c[i]!='e'&&c[i]!='i'&&c[i]!='o'&&c[i]!='u'&&
					c[i]!='A'&&c[i]!='E'&&c[i]!='I'&&c[i]!='O'&&c[i]!='U')
				{
				c[i]='#';
				}
		}
		return new String (c);
	}
//	---------------------------------------------------------------------
	public static String casechange(String s) {
		char [] c=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i]>='a'&&c[i]<='z') {
			c[i]=(char)(c[i]-32);
			}
			
		}
		return new String (c);
	}
//	---------------------------------------------------------------------
}
