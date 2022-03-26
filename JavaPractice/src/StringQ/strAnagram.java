package StringQ;
import java.util.Arrays;
public class strAnagram {
	
	public static void main(String[] args) {
		String s1="levis";
		String s2="evils";
		
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		s1=new String(a1);
		s2=new String(a2);
		
		System.out.println(s1.equals(s2));
	}
}