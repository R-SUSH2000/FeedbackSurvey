package javaCollection;
import java.util.Arrays;
public class MergeInSortedOr {
	
	void Merge(int a[],int b[])
	{
		int i=0,j=0;
		while(i<a.length&&j<b.length)
		{
			if (a[i]>=b[j]) 
			{System.out.println(b[j]);j++;}
			else 
			{System.out.println(a[i]);i++;}
		}
		while(i<a.length)
		{System.out.println(a[i]);i++;}
		while(j<b.length)
		{System.out.println(b[j]);j++;} 
	}
	
	public static void main(String[] args) {
		int a[]= {10,15,20};
		int b[]= {5,6,6,15};
		int len= a.length+b.length;
		int c[]= new int[len];
		for (int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length-1+i]=b[i];
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}
}