
public class StringRev {
	
	static String StrRev(String in,int s)
	{
		String result=" ";
		String []st= in.split(" ");
		for(int i=0;i<st.length;i++)
		{
			result= result + new StringBuffer(st[i]).reverse().toString();
		}
		return result.substring(0, 1).toUpperCase()+result.substring(1);
	}
	public static void main(String[] args) {
		System.out.println(StrRev("Suyash Agrawal", 2));
	}
}
