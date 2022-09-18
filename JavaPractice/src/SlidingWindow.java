
public class SlidingWindow {
	
	boolean subArrayOfSum(int ar[],int sum)
	{
		int sumx=ar[0],start=0,i;
		for(i=1;i<ar.length;i++)
		{
			while(sumx>sum && start<i-1)
			{
				sumx-=ar[start]; start++;
			}
			
			if(sumx==sum) {int p=}
			
			if(i<ar.length) {sumx+=ar[i];}
		}
		
		
	}
	
	
	
			
	static int windowSlide(int[] ar,int k)
	{
		int sum=0,maxSum=0;
		for(int i=0;i<k;i++)
		{
			sum = sum + ar[i];
		}
		for(int i=k;i<ar.length;i++)
		{
			sum+=(ar[i]-ar[i-k]);
			maxSum=Math.max(maxSum,sum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		 int []ar= {1,8,30,-5,20,7};int k=3;
		 System.out.println(windowSlide(ar,k));
		 int max_sum=Integer.MIN_VALUE;
		 for(int i=0;i+k-1<ar.length;i++)
		 { 
			 int sum=0;
			 for(int j=i;j<=k;j++)
				 
				 sum=sum+ar[j];
		 }
	}
}
