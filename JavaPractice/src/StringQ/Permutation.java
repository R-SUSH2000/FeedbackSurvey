package StringQ;
import java.util.*;
public class Permutation {
	public String SwapStr(String str,int i,int j) {
		char []st=str.toCharArray();
		char sh;
		sh =st[i];
		st[i]=st[j];
		st[j]=sh;
		return st.toString();
	}
	
	public void permute(String str,int st,int end)
	{
		if(st==end-1)
		{
			System.out.println(str);
		}
			
		for(int i=st;i<end;i++)
		{
			str= SwapStr(str,st,i);
			permute(str, st+1, end);
			str=SwapStr(str,st, i);
		}
		
	}

	public static void main(String[] args) {
		String str="ABC";
		permute(str);
	}
}
