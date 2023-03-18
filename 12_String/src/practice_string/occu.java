package practice_string;

public class occu {
	
	public static void main(String[] args) {
		
		String s = "nikhil";
		
		char[] c = s.toCharArray();
		boolean[] b = new boolean [c.length];
		
		
		for (int i = 0; i < b.length; i++) {
			
			if (b[i]==false) {
				int count=1;
				for (int j = i+1; j < b.length; j++) {
					if(c[i]==c[j]) {
						count++;
						b[j]=true;
					}
				}
			System.out.println(c[i]+" "+count);
			
			}
		}
	}
}

