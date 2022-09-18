package algo;

public class FirstBin {

	static int SearchFRecc(int ar[],int low,int high,int x)
	{
		if (low>high)
			return -1;
		int mid = (low+high)/2;
		if(ar[mid]>x)
			return SearchFRecc(ar, low, mid-1, x);
		else if (ar[mid]<x)
			return SearchFRecc(ar, mid+1, high, x);
		else {
			if (ar[mid]==0|| ar[mid-1]!=ar[mid])
					return mid;
			else 
				return SearchFRecc(ar, low, mid-1, x);
		}
		
	}
	
	public static void main(String[] args) {
		int ar[]= {1,12,12,12,20,20,4};
		System.out.println(SearchFRecc(ar, 0, 6, 12 ));
	}

}
