
public class removeDuplicateFromSort {
	
	int duplicate(int ar[])
	{
		int res=1; 
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]!=ar[res-1])
				ar[i]=ar[res];
				res++;
		}return res;
	}
	
	public static void main(String[] args) {
		int[] ar= {12,23,43,43,34};
		int n=ar.length,res=1;
		int[] temp=new int[n];
		temp[0]=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(temp[res-1]!=ar[i])
			{
				temp[res]=ar[i];
				res++;
			}
		}
		
	}

}
