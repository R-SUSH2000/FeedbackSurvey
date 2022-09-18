package set;
import java.util.*;
public class HashSetPrac1 {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		HashSet<String> h= new HashSet<String>();
		h.add("Suyash");
		h.add("Yash");
		h.add("Agrawal"); 
		System.out.println(h);
		System.out.println(h.contains("Agrawal"));
		System.out.println(h.size());
		for(String s:h) {
			System.out.print(s+" ");
		}
		Iterator i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
	}

}
