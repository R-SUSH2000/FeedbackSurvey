package hashing;
import java.util.*;

public class HashMappingEle {
	
	public static void main(String[] args) {
		HashMap<String,Integer> m1= new HashMap<>();
		m1.put("ide", 30);
		m1.put("courses", 1);
		m1.put("good", 10);
		System.out.println(m1);
		System.out.println(m1.size());
		for(Map.Entry<String, Integer> e: m1.entrySet())
		{
			System.out.println(e.getKey()+"----->"+e.getValue());
		}
		if(m1.containsKey("ide"))
			System.out.println("Yes");
		if(m1.containsValue(100))
			System.out.println("Yes");
		else System.out.println("No");
		System.out.println("---------------------");
		LinkedHashMap<Integer,String> listmap= new LinkedHashMap<>();
		
		listmap.put(10,"Suyash");
		listmap.put(100,"AGG");
		listmap.put(2,"yash");
		listmap.remove(100);
		listmap.put(100,"Agrawal");
		System.out.println(listmap);
	}

}
