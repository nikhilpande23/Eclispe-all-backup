package practice_string;

public class occ {
	
	public static void main(String[] args) {
		
		
		String s = "India is my country";
		
		
		int ttl = s.length();
		
		String aftRem = s.replace("i", "");
		int ttlaft = aftRem.length();
		
		int finLegt = ttl-ttlaft;
		
		
		System.out.println(finLegt);
	}

}
