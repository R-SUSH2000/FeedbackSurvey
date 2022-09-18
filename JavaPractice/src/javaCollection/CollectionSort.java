package javaCollection;
import java.util.*;

public class CollectionSort {

	public static void main(String[] args) {
		HashMap<String,String> m= new HashMap<>();
		m.put("zuyash","yash");
		m.put("Agrawal","AgSab");
		System.out.println(m);
		System.out.println(m.size());
		for(Map.Entry<String,String> e :m.entrySet())
		{System.out.println(e.getKey()+"-"+e.getValue());}
			if(m.containsKey("Suyash"))
				System.out.println("yes");
			else 
				System.out.println("No");
		m.remove("Suyash");
		
		for(Map.Entry<String,String> e :m.entrySet())
		{System.out.println(e.getKey()+"-"+e.getValue());}
	}
	
	    
}
