package MapInterfaces;

public class TreeSet {
	
	public static void main(String[] args) {
		java.util.TreeSet<String> a1 = new java.util.TreeSet<>();  
	        a1.add("Aman");
	        a1.add("Muj=kesh");
	        a1.add("Helo");
	        a1.add("GM");
	        a1.add("KK");
	        a1.add("DK");
	        
	        java.util.Iterator<String> t = a1.iterator();
	        while (t.hasNext())
	        {
	        	System.out.println(t.next()+" ");
	        }

	}

}
