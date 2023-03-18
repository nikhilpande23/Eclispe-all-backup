package practice_string;

public class _9_String_swapping {
	public static void main(String[] args) {
		String x="abc";
		String y="xyz";
		
		x=x.concat(y); //abcxyz
		
		y=x.substring(0, x.length()-y.length()); //abc
		
		x=x.substring(y.length()); //xyz
		
		
		System.out.println(x);
		System.out.println(y);
	}

}
