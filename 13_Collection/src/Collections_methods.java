import java.util.ArrayList;
import java.util.Collections;

public class Collections_methods {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(-25);
		a.add(0);
		a.add(100);
		a.add(-5);
		System.out.println("Before sorting :"+a);
		
		Collections.sort(a);
		System.out.println("After sorting_Asending:"+a);
		
		Collections.reverse(a);
		System.out.println("Reverse_Decending:"+a);
	}

}
