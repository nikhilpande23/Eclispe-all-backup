package practice_string;
public class _912_Duplicate_words_count_scanner {
	
	public static void main(String[] args) {
		
		String s="nikhil navnath pande navnath ramesh pande";
		String [] a=s.split(" ");
		boolean [] b= new boolean[a.length];
		int duplicate=0;
		
		for (int i = 0; i < b.length; i++) {
			if (b[i]==false) {
				int count=1;
				for (int j = i+1; j < b.length; j++) {
					if (a[i].equals(a[j])) {
						count++;
						b[j]=true;
					}
				}
				if (count>1) {
					duplicate++;
				}
			}
			
		}
		System.out.println("Total Duplicate words "+duplicate);
		
	}
}
