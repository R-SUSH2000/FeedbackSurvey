package javaCollection;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		
		List<Integer> a1= new ArrayList<Integer>();
		a1.add(10);
		a1.add(30);
		a1.add(90);  
		Collections.sort(a1);System.out.println(a1);
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println(a1);
}
}