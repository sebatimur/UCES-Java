import java.util.ArrayList;
import java.util.ListIterator;

public class array {
	
	public static void main (String[] args)
	{
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		array1.add(10);
		array1.add(20);
		array1.add(30);
		array1.add(40);
		array1.add(50);

		ListIterator<Integer> itr = array1.listIterator();
		System.out.println("array1 in forward order");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("array1 in reverse order");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
