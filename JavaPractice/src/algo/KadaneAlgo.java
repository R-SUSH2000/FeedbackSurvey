package algo;

public class KadaneAlgo {

	public static void main(String[] args) {
		int ar[]= {-5,4,6,-3,4,-1};int maxsum =Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			int sum =0;
			for(int j=i;j<ar.length;j++)
			{
				sum= sum+ar[j];
				//System.out.print(sum+"-");
				maxsum=Math.max(maxsum, sum);
			}
			
		}
		System.out.println(maxsum);
		
	}
}
