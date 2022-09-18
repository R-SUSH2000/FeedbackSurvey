package Recursion;

public class PermutationOfString {

	String swapStr(String st,int i,int j) {
		char temp;
		char[] ar=st.toCharArray();
		temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		return String.valueOf(ar);
	}
	void permute(String str,int index) {
		if(index==(str.length()-1)) 
		{System.out.println(str);return ;}
		for(int j=index;j<str.length();j++)
		{
			str = swapStr(str,index,j);
			permute(str,index+1);
			str = swapStr(str,j,index);
		}
	}
	public static void main(String[] args) {
		String st="ABC";
		PermutationOfString s= new PermutationOfString();
		s.permute(st, 0);
	}
}
