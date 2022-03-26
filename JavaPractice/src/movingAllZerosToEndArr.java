
public class movingAllZerosToEndArr {

	public static void main (String args[])
	{
		int [] ar= {1,0,888,0,2666,0,2};
		for(int i=0;i<ar.length;i++)
		{
			if (ar[i]==0)
			{
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[j]!=0)
						{
							int temp=ar[i];
							ar[i]=ar[j];
							ar[j]=temp;
						}
				}
			}
		}
		for(int ele:ar)
		{
			System.out.print(","+ele);
		}
			
	}
}
