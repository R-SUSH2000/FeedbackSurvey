package StringQ;

public class subsequenceS2 {

	public static void main(String[] args) {
		String s1="ABCD";
		String s2="AD";
		int j=0;
		boolean c=true;
		for (int i=0;i<s1.length()&&j<s2.length();i++)
		{
			if (s1.charAt(i)==s2.charAt(j))
		{
			  j++;
		}
		}
		if (j==s2.length())
		{System.out.println(c);}
		

	}

}
