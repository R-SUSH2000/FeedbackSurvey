package arrayP;

public class TrappingRainWaterPrb {

	int getWater(int []ar)
	{
		int res=0;
		for(int i=1;i<(ar.length-1);i++)
		{
			int lmax=ar[i];
			for(int j=0;j<i;j++)
			{
				lmax = Math.max(lmax, ar[j]);
			}
			int rmax=ar[i];
			for(int j=0;j<ar.length;j++)
			{
				rmax = Math.max(rmax, ar[j]);
			}
			res= res + (Math.min(lmax, rmax)-ar[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		int []ar= {3,0,1,2,5};
		TrappingRainWaterPrb tp= new TrappingRainWaterPrb();
		int p=tp.getWater(ar);
		System.out.println(p);
	}

}
