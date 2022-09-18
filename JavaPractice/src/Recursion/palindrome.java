package Recursion;

public class palindrome {
	
	public boolean pal(String s,int start,int end)
	{
		 if(start>=end)
			 return true;
		 return (s.charAt(start)==s.charAt(end)&&pal(s,start+1,end-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
