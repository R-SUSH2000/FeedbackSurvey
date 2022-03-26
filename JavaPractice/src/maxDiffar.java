
public class maxDiffar {

	int maxxDiff(int []ar)
	{
		int min=ar[0];
		int res=ar[1]-ar[0];
		for(int i=0;i<ar.length;i++)
		{
			res=Math.max(res, ar[i]-min);
			min=Math.min(min, ar[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		int ar[]= {2,3,11,6,4,8,1};
		int size= ar.length;
		int res=ar[1]-ar[0];
		for (int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{res= Math.max(res,ar[j]-ar[i]);}
		}System.out.println(res);
		}
	}

