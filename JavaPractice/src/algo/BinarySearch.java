package algo;

public class BinarySearch {

	static int BinarySeIteration(int []ar,int x)
	{
		int low =0,high=ar.length-1;
		while(high>=low)
		{
			int mid=(high+low)/2;
			if(ar[mid]==x)
				return mid;
			else if(ar[mid]>x)
				high=mid-1;
			else  
				low=mid+1;
		}
		return -1;
	}
	static int BinarySearchRec(int[]ar , int low ,int high,int x)
	{
		  if(low>high)
			  return -1;
		  int mid = (low+high)/2;
		  if (ar[mid]==x)
			  return mid;
		  else if (ar[mid]>x)
			  return BinarySearchRec(ar, low, mid-1, x);
		  else 
			  return BinarySearchRec(ar, mid+1, high, x);
	}
	
	
	public static void main(String[] args) {
		int[] ar= {10,20,30,40,50,60,70};
		int x=70;
		System.out.println(BinarySeIteration(ar, x));
	}

}
