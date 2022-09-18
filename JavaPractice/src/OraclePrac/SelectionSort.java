package OraclePrac;
import java.util.Arrays;
public class SelectionSort {
	
	static void Selects(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			int min=0;
			for(int j=1;j<ar.length;j++)
			{
				if(ar[j]<ar[min])
				{
					min=j;
					int temp=ar[j];
					ar[j]=ar[min];
					ar[min]=temp;
				}
			}
		}System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int ar[]= {123,214,3,30,1};
		int[] temp=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			int min=0;
			for(int j=1;j<ar.length;j++)
			{
				if(ar[j]<ar[min]) 
				{min=j;}
			}
			temp[i]=ar[min]; 
			ar[min]=Integer.MAX_VALUE;	
		}
		for(int x=0;x<temp.length;x++)
		{ar[x]=temp[x];}
		Selects(ar);
		//System.out.println(Arrays.toString(temp));
		
	}
}
