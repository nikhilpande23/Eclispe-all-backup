import java.util.ArrayList;

public class _1_ArrayList {
	
	public static void main(String[] args) {
		
		//south Indian
		ArrayList s= new ArrayList();
		s.add("idli");
		s.add("Dal vada");
		s.add("Mendu vada");
		System.out.println("south indian "+ s);
		
		//North Indian
		ArrayList n= new ArrayList();
		n.add("vada pav");
		n.add("Misal pav");
		n.add("vada ussal");
		System.out.println("North indian "+ n);
		
		//*****Add_Object*****
		s.add(0, "Uthappa");	System.out.println("Add south indian "+ s);
		
		//Add_ALL_Object
		s.addAll(n);	System.out.println("Direct Add All south indian "+ s); //directly add
		s.addAll(1, n); System.out.println("Index Add All south indian "+ s); //by index added
		
		//****SEARCHING******
		System.out.println("Search by contains object "+(n.contains("idli"))); //by contains - o/p will be TRUE or FALSE
		System.out.println("Search by contains ALL "+(s.containsAll(n))); //by contains ALL - 
		
		//****REMOVE*****
		s.remove(0);
		System.out.println("remove index 0 of south ind "+ s);
		
		
	}
	
	

}
