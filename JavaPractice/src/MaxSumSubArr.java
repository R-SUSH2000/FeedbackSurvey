public class MaxSumSubArr {

	public static void main(String[] args) {
		
		int ar[]= {2,3,-8,7,-1,2,3};
		//o(n2)
		int res = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			int curr=0;
			for (int j=i;j<ar.length;j++)
			{
				curr=curr+ar[j];
				res=Math.max(curr, res);
			}
		}System.out.println(res);
	}

}
