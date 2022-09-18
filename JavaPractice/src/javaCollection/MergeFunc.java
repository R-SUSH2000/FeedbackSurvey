package javaCollection;

import java.util.Arrays;

public class MergeFunc {
	 
	int[] fullsort (int []ar,int low, int mid,int high)
	{
		int n1=mid-low+1,n2=high-mid;
		int left[]= new int[n1];
		int right[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			left[i]=ar[low+i];
		}
		for(int i=0;i<n1;i++)
		{
			right[i]=ar[n1+i];
		}
		int l=0,r=0,i=0;
		while (l<left.length&&r<right.length)
			{
				if(left[l]<=right[r])
					{ar[i]=left[l];l++;i++;}
				else {ar[i]=right[r];r++;i++;}
			} 
			while (l<left.length)
			{
				ar[i]=left[l];l++;i++;
			}
			while (r<right.length)
			{
				ar[i]=right[r];r++;i++;
			}
		return ar;
	}

	public static void main(String[] args) {
		int a[]= {10,15,20,40,8,11,55};
		MergeFunc f= new MergeFunc();
		int b[]= f.fullsort(a, 0, 3, 6);
		System.out.println(Arrays.toString(b));
	}
}
