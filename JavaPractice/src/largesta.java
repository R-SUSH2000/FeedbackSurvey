
public class largesta {
	
	int largest (int ar[])
	{
		int lar=ar[0];
		for (int i=0;i<ar.length;i++)
		{
			if(lar<ar[i])
			{
				lar=ar[i];
			}
		}
		return lar;
	}

	int secondLargest(int []ar)
	{
		int lar=largest(ar);
		int res=-1;
		for (int i=0;i<ar.length;i++)
		{
			if(ar[i]!=lar)
			{
				if(res==-1)
				{
					 res=i;
				}
				else if(ar[i]>ar[res])
			}
		}
	}
	public static void main(String[] args) {
		
		
	}

}
 