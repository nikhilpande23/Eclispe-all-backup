
public class BinarySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {10, 20, 30, 40, 50};
		int search =40;
		int li=0;
		int hi=a.length-1;
		int mi= (li+hi)/2;
		while(li <= hi)
		{
			if (search == a[mi])
			{
				System.out.print("Element is present at index "+mi);
				break;
			}
			else if (search < a[mi])
			{
				hi = mi-1;
			}
			else if (search > a[mi]) {
				li = mi + 1;
			}
			mi = (li+hi)/2;
		}
		
		
		
	}

}
