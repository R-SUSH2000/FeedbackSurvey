package StringQ;

public class palindromeChk {
	
	boolean revChk(String s)
	{
		int begin=0;
		int end=s.length()-1;
		while(end>begin)
		{
			if(s.charAt(begin)!=s.charAt(end))
				return false;
			begin++;
			end--;
		}
		return true;
		
	}
	 

	public static void main(String[] args) {
		String str="nayan";
		StringBuilder rev=new StringBuilder(str);
		rev.reverse();
		boolean i=str.equals(rev.toString());
		System.out.println(i);
	}

}
