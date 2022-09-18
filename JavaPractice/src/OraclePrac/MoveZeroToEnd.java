package OraclePrac;

import java.util.Arrays;

public class MoveZeroToEnd {
	static int[] Eff(int ar[])
	{
		int c=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				int temp=ar[i];
				ar[i]=ar[c];
				ar[c]=temp;
				c++;
			}
		}return ar;
	}

	public static void main(String[] args) {
		int ar[]= {8,5,0,10,0,12};
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[j]!=0)
					{
						int temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					}
				}
			}
		}System.out.println(Arrays.toString(ar));
		//System.out.println(Eff(ar));
	}

}
