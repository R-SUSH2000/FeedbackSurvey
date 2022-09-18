package StringQ;
import java.util.Arrays;
public class FindOneExtraCh {

	public char ExCh(String s1,String s2)
	{
		char a1[]= s1.toCharArray();
		Arrays.sort(a1);
		char a2[]= s2.toCharArray();
		Arrays.sort(a2);
		int n=s1.length();
		for(int i=0;i<n;i++)
		{
			if (a1[i]!=a2[i])
				return a2[i];
		}
		return a2[n];
	
	}
	
	public char ExCh2(String s1,String s2) //using character as index in an array 
	{
		int count[]= new int[26];
		int n=s1.length();
		for(int i=0;i<n;i++) {
			count[s1.charAt(i)-'a']--;
			count[s2.charAt(i)-'a']++;
		}
		count[s2.charAt(n)-'a']++;
		for(int i=0;i<n;i++)
		{
			if(count[i]!=0)
				return (char)(i+'a');
		}
		return 0;
	}
	
	
	public static void main(String[] args) {

	}

}
