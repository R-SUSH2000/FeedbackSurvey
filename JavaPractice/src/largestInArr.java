
public class largestInArr {
	
	int largest(int []ar)
	{
		int res=0;
		for (int i=1;i<ar.length;i++)
		{
			if(ar[i]>ar[res])
				res=i;
		}return res;
	}

	public static void main(String[] args) {
		int []ar = {1,23,43,10};
		largestInArr la= new largestInArr();
		int i=la.largest(ar);
		System.out.println(i);
	}

}
