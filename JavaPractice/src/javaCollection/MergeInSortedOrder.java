package javaCollection;

import java.util.Arrays;

public class MergeInSortedOrder {

	static int[] Merge(int a[],int b[]) {
			int c[]=new int[a.length+b.length];
			int ai=0,bi=0,k=0;
			while(ai<a.length&&bi<b.length)
			{
				if(a[ai]>b[bi])
					c[k++]=b[bi++];
				else
					c[k++]=a[ai++];
			}
			while(ai<a.length)
			{c[k++]=a[ai++];}
			while(bi<b.length)
			{c[k++]=b[bi++];}
			return c;
	}
	
	public static void main(String[] args) {
		int a[] ={1,3,45};
		int b[] ={2,4,7,45,19};
		int c[]= Merge(a,b);
		for(int x:c)
		{System.out.print(x+" ");}
	}
	
	static int[] MergeInSort(int a[],int b[]) 
	{
		int c[]= new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
		}
		Arrays.sort(c);
		return c;
	}
}
