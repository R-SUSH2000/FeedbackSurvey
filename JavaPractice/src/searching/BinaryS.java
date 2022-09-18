package searching;

public class BinaryS {
	int BinarySc(int []ar,int low , int high,int k)
	{
		int mid=(low+high)/2;	
		if(low>high) return -1;
		if(ar[mid]>k)
			return BinarySc(ar, low, mid-1, k);
		else if (ar[mid]<k) 
			return BinarySc(ar, mid+1, high, k);
		else 
			{
			if(ar[mid]==0||ar[mid-1]!=ar[mid])
				return mid; 
			else 
			return BinarySc(ar, low, high, k);
			}
		}
}
