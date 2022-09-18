package hashing;
import java.util.*;

public class HashSetInJava {
	public static void main(String[] args) {
		 HashSet<String> h1=new HashSet<String>();
		 h1.add("s");
		 h1.add("u");
		 h1.add("y");
		 System.out.println(h1);
		 System.out.println(h1.contains("u"));
		 Iterator<String> i= h1.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next()+"" );
		 }
	}
	
}
