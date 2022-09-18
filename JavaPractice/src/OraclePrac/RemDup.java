package OraclePrac;

import java.util.Arrays;

public class RemDup {

	public static void main(String[] args) {
		int ar[]= {123,123,4,31,31};
		int ans[]=new int[ar.length];
		ans[0]=ar[0];int s=1;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[s-1]!=ar[i])
			{
				ans[s]=ar[i];
				s++;
			}
		}
		System.out.println(Arrays.toString(ans)+" - "+s);

	}

}
