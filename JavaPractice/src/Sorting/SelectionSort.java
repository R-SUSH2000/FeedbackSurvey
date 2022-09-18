package Sorting;

import java.util.Arrays;

public class SelectionSort {
	int[] Selec(int[] ar)
	{
		int temp[]= new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			int min=0;
			for(int j=1;j<ar.length;j++)
			{
				if(ar[j]<ar[min])
				{
					min=j;
				}
			}
			temp[i]=ar[min];
			ar[min]=Integer.MAX_VALUE;
			
		}
			for(int i=0;i<ar.length;i++)
				ar[i]=temp[i];
			return ar;
		} 

	int[] Improvedsel(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			int min=i;
			for(int j=1;j<ar.length;j++)
			{
				if(ar[min]>ar[j])
					min=j;
			}
			int temp=ar[min];
			ar[min]=ar[i];
			ar[i]=temp;
		}
		return ar;
	}
	
	int[] lowREV(int ar[]) {
		int temp[] = new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			int min =0; 
			for(int j=0;j<ar.length;j++)
			{
				if(ar[min]>ar[j])
					min=j;
			}
			temp[i]=ar[min];
			ar[min]=Integer.MAX_VALUE;
		}
		for (int i=0;i<ar.length;i++)
		{
			ar[i]=temp[i];
		}return ar;
	}

	int[] efficientSEL(int ar[]) {
		
		for(int i=0;i<ar.length;i++)
		{
			int min =i ;
			for(int j=i+1 ;j<ar.length;j++)
			{
				if(ar[min]>ar[j])
				{
					min=j;
				}
			}
			int temp=ar[min];
			ar[min]=ar[i];
			ar[i]=temp;
		}
		return ar;
	}
	
	public static void main(String[] args) {
		int ar[]= {5,2,144,4,200,0};
		SelectionSort sc= new SelectionSort();
		int []a=sc.Selec(ar);
		int []b=sc.Improvedsel(ar);
		int []c=sc.lowREV(ar);int []d=sc.efficientSEL(ar);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	}
	}



