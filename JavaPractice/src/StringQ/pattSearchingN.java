package StringQ;

public class pattSearchingN {
	void patt(String s1,String s2) {
		int i=s2.length(),j=s1.length();
		for(int k=0;k<i-j;k++)
		{
			int l;
			for(l=0;l<s2.length();l++)
			{
				if(s2.charAt(l)!=s1.charAt(k+l))
				{
					break;
				}
				if(k==l)
				{
					System.out.println(""+k);
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
