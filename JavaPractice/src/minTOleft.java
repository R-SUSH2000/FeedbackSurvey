
public class minTOleft {
	public static void main(String[] args) {
		int ar[]= {5,4,3,2,1};int n=ar.length-1,z=0;
		int ans[]=new int[n];
		for(int i=n;i>=0;i--)
		{
			for(int j=i-1;j>=-1;j--)
			{
				if(j==-1)
				{
					ans[z]=-1;
				}
				else if(ar[i]>ar[j])
					{ans[z]=ar[j];
					z++;break;}
			}
		}
		for(int i=ans.length-1;i>=0;i--) {
			System.out.println(ans[i]+" ");
		}
	}

}
