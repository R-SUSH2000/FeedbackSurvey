public class Sortarr {

	public static void main(String args[]) 
	{
		int ar[]= {4,2,7,3};
		int temp=0;
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if (ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for (int ele:ar)
		{System.out.println(ele);}
	}
}
