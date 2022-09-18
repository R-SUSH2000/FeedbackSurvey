package StringQ;
public class Pangram {
	static boolean isPanagram(String s)
	{
	 	int n=s.length();
	 	if (n<26)
	 		return false;
	 	boolean visited[]=new boolean[26];
	 	for(int i=0;i<n;i++)
	 	{
	 		char c=s.charAt(i);
	 		if(c>='a'&&c<='z')
	 		{
	 			visited[c-'a']=true;
	 		}
	 		if(c>='A'&&c<='Z')
	 		{ 
	 			visited[c-'A']=true;
	 		}
	 	}
	 	for(int i=0;i<26;i++)
	 	{
	 		if (visited[i]==false)
	 			return false;
	 	}
	 	return true;
	}
	
	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog ";
		boolean b=isPanagram(s);
		System.out.println(b);
	}

}
