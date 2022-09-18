package set;
import java.util.*;
public class LinkedHashSetprac1 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> l= new LinkedHashSet<>();
		l.add(10);
		l.add(20);
		l.add(40);
		l.remove(10);
		l.add(1 0);
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
