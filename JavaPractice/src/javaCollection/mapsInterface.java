package javaCollection;
import java.util.*;
public class mapsInterface {

	public static void main(String[] args) {
		Map<Integer,String> m1 = new TreeMap<>();
		m1.put(100,"GFG");
		m1.put(200,"Suyash");
		m1.put(50,"Agrawal");
		m1.replace(50, null);
		System.out.println(m1);
//		Set<Integer> KeySet();
//		Collection<Integer> Values();
		System.out.println();
		
	}

	

}
