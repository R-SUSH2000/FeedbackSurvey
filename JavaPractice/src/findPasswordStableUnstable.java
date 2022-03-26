 
public class findPasswordStableUnstable {
	
	
	public int[] hack(int ar[])
	{
		int an[] = null ;
		int temp=0,posi=0;;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
				posi++; 
			{
				for(int j=0;j<ar.length;j++)
					an[posi]=ar[i];
					break;
			}
		}return an;
	}
	

	public static void main(String[] args) {
		int arr[]= {1,23,4,31,-2,-2,-4,-9};
		findPasswordStableUnstable f=new findPasswordStableUnstable();
		int kas[]=f.hack(arr);
		for(int ele:kas)
		{
			System.out.println(ele);
		}

	}

}
