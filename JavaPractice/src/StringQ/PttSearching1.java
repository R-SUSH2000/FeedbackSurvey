package StringQ;

public class PttSearching1 {
	
	static void PatSearch(String txt,String pat) //index of occurrance of pattern in the txt
	{
		int pos = txt.indexOf(pat);
		while(pos>0)
		{
			pos = txt.indexOf(pat, pos+1);
		}
	}
	
	static String Patt2(String s) //digits after decimal point 
	{
		int pos= s.indexOf('.');
		if(pos<0)
			return "";
		else
			return s.substring(pos+1);
	}
	  
	public static void main (String []args)
	{
		
	}
	

}
