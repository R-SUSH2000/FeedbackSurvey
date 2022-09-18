package MapInterfaces;
import java.util.*;
public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m= new HashMap<String,Integer>();
		m.put("Suyash", 123);
		m.put("yash", 3);
		m.put("ag", 13);
		System.out.println(m);
		System.out.println(m.get("ag"));
		System.out.println(m. containsKey("yash"));
		 
	}
	
}