
public class leftmostRepeating {

	
	int leftMost(String s) {
		int[] c= new int[26];
		for(int i=0;i<s.length();i++) {
			c[s.charAt(i)]++;
		}
		for (int i=0;i<s.length();i++)
		{
			if(c[s.charAt(i)]==1)
			{
				return i;
			}
		}return -1;
	}
	
	
	public static void main(String[] args) {
		String s1="geeksforgeeks";
		for(int i=0;i<s1.length();i++)
		{
			for( int j=i+1;j<s1.length();j++)
			{
				if (s1.charAt(i)==s1.charAt(j))
				{
					System.out.println(i);
					
				}
			}
		}
		System.out.println("-1");

	}

}
