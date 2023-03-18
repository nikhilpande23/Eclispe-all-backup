import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _2_access_objecs {
	public static void main(String[] args) {
		
		// creating ArrayList
		ArrayList a=new ArrayList(); {
			a.add(10);
			a.add('c');
			a.add("Hi");
			a.add(19.9);
			System.out.println("ArrayList :"+a);
			System.out.println("------------------------");
			
			//1. for each loop
			for (Object allobj : a) {
				System.out.println("for each loop :"+allobj);
			}
			System.out.println("------------------------");
	
			//2. get(int index)
			for (int i = 0; i < a.size(); i++) {
				System.out.println("get(int index) :"+a.get(i));
			}
			System.out.println("------------------------");
			
			//3, Iterator
			Iterator i=a.iterator();
			while (i.hasNext()) {
				System.out.println("Iterator - "+i.next());
			}
			System.out.println("------------------------");
			
			//4. List-Iterator
			ListIterator j=a.listIterator(); {
				while (j.hasNext()) {
					System.out.println("List Iterator next :"+j.next());		
				}
				System.out.println();
				
				while (j.hasPrevious()) {
					System.out.println("List Iterator previous :"+ j.previous());
				}
				System.out.println("------------------------");
			} 
		}
	}

}
