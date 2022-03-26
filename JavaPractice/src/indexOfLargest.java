
public class indexOfLargest {
	
	 int largestIdx(int arr[])
	{
		int res=0;
		for(int i=0;i<=(arr.length-1);i++)
		{
			if(arr[i]>arr[res])
				res=i;
		}
		return res;
					
	}
	 
	public static void main(String[] args) 
	{
		int arr[]= {1,23,4342,13};
		indexOfLargest id= new indexOfLargest();
		int x=id.largestIdx(arr);
		System.out.println(x);

	}
}
