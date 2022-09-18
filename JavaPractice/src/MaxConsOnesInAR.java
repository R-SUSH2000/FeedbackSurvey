
public class MaxConsOnesInAR {

	int MaxConsNav(boolean[] ar) {
		int res=0;
		for(int i=0;i<ar.length;i++) 
		{
			int c=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]==true)
					c++;
				else 
					break;
			}res=Math.max(c, res);
		}return res;
	}
	int maxConsecutiveOnes(boolean ar[])
	{
		int res=0,c=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]=false)
				c=0;
			else 
				c++;
			res=Math.max(c, res);
		}
		return res;
	}

	public static void main(String[] args) {
		
		MaxConsOnesInAR maxar= new MaxConsOnesInAR();

	}

}
