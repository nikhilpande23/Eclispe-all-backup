package ff;
public class occ1 {
//	Occurace of each character.

	
	public static void main(String[] args) {
		
		String s = "nikhil";
		s=s.trim();
		
		char[] ca = s.toCharArray();
		boolean []b=new boolean[ca.length];
		for (int i = 0; i < b.length; i++) {
			
			if (b[i]==false) {
				int count=1;
				for (int j = i+1; j < b.length; j++) {
					if(ca[i]==ca[j]) {
						count++;
						b[j]=true;
					}
				}
				
				System.out.println(ca[i]+" "+count);
			}
		}
	}
}