package Sorting;

public class InsertionSort {
	
	int[] insertSort(int ar[])
	{
		for(int i=1;i<ar.length;i++)
		{
			int key= ar[i];
			int j=i-1;
			while(j>=0&&ar[j]>key)
			{
				 ar[j+1]=ar[j];
				 j--;			
			}
			ar[j+1]=key;
		}return ar;		
	}

	int[] InsertSortN(int ar[]) {
			for(int i=0;i<ar.length;i++)
			{
				int min=0;
				
			}
	}

}
