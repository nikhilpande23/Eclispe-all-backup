import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Map {
	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList<>();
		al.add(1);
		al.add(1, "name");
		
//		System.out.println(al.get(1));			1)
		
//		for (Object object : al) {				2)
//			System.out.println(object);
//		}
//		
		
//		Iterator it = al.iterator();			3)
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
//		ListIterator it = al.listIterator();	4)
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		while (it.hasPrevious()) {
//			System.out.println(it.previous());
//		}

//		List to Set
		HashSet h = new HashSet (al);
		System.out.println("List to Set " + h);
		
//		Set to list
		ArrayList a = new ArrayList<>(h);
		System.out.println("Set to list "+ a);
		
//		Map to list
		HashMap m = new HashMap<>();
		m.put("key1", "val1");
		m.put("key2", 22);
		
		Set es = m.entrySet();
		
		ArrayList al2 = new ArrayList<>(es);
		System.out.println("Map to list " + al2);
		
//		ArrayList to Array
		Object[] i = al.toArray();
		for (int j = 0; j < i.length; j++) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
