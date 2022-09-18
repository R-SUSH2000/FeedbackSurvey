package Sorting;
import java.util.*;
public class BubbleSort {

	public static void main(String args[]) {
		int ar[]= {2,8,4,5,0};
		for (int i=0;i<ar.length-1;i++)
		{
			boolean swapped= false;
			for(int j=0;j<ar.length-i -1;j++)
			{if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;	
					swapped = true;
				}
			}
			if (swapped==false) {break;}
		}System.out.println(Arrays.toString(ar));
	}
}
