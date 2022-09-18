
public class chkSorting {
	
	int[] remove(int[] ar)
	{
		int res=0;
		for (int i=1;i<ar.length;i++)
		{
			if(ar[res]==ar[res-1])
			{
				
			}
		}
	}
	
	int[] rev(int[] ar)
	{
		int n = ar.length;
		int low= 0, high =n-1;
		while (high>low)
			{int x;
			x=ar[low];
			ar[low]=ar[high];
			ar[high]=x;
			low++;
			high--;
			}
		return ar;
	}
	
	boolean inSorted(int []ar)
	{
		for(int i=1;i<ar.length;i++)
		{
			if (ar[i]>ar[i-1])
				return false;
		}return true;
	}

	public static void main(String[] args) {
		int ar[]= {10,20,90,239};
		for (int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
				if (ar[i]>ar[j])
					System.out.println("false");
		}
	}

}
