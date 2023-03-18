
public class DuplicateWordSring {
	public static void main(String[] args) {
		
		String s="java is a programming language it is a high level language";
		String [] str= s.split(" ");
		boolean []b= new boolean[str.length];
		int duplicate=0;
		for (int i = 0; i < str.length; i++) {
			if (b[i] == false) {
				int count=1;
				 for (int r = i+1; r < str.length; r++) {
					if (str[i].equals(str[r])) {
						count++;
						b[r]= true;
					}
				}
				 if (count > 1) {
					duplicate++;
				}
			}
		}
		System.out.println(duplicate);
	}
}
