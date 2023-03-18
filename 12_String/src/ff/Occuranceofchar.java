package ff;

public class Occuranceofchar {

	public static void main(String[] args) {

		String s = "harshada";
		
		char[] ca = s.toCharArray();
		boolean[] b = new boolean[ca.length];
		
		for (int i = 0; i < ca.length; i++) {
			
			if (b[i]==false) {
				
				int count = 1;
				
				for (int j = i+1; j < ca.length; j++) {
					
					if (ca[i]==ca[j]) {
						count++;
						b[j]=true;
					}
				}
				
				System.out.println(ca[i]+ " "+count);
			}
		}
		
	}

}
