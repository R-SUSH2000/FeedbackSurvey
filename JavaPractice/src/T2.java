import java.util.*;

public class T2 {

	public static void main (String args[])
	{
		int a[]= {10,23,342,90};
		int l=0;
		for (int i=0;i<a.length;i++) 
		{
		if(a[i]>a[l])
			l=i;
		}
		System.out.println(l);
	}
}
