package Sorting;
import java.util.Arrays;
public class SelectionSortRE {

	public static void main(String[] args) {
		int ar[]= {10,5,8,20,18,2};
		for(int i=0;i<ar.length;i++)
		{
			int min=i; 
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[min]>ar[j])
					min=j;
			}
			int temp=ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
		}
		System.out.println(Arrays.toString(ar));
	}
}