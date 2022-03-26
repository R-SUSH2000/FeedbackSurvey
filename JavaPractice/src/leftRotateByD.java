
public class leftRotateByD {

	public int[] leftRByDNaive1(int[] ar, int d)
	{
		int []d1= new int[d];
		for (int i=0;i<ar.length;i++)
		{
			d1[i]=ar[i];
		}
		for(int i=d;i<ar.length;i++)
		{
			ar[i-d]=ar[i];
		}
		for(int i=0;i<d;i++)
		{
			ar[(ar.length)-d+i]=d1[i];
		}
		return ar;
	}

	public int[] godLvlReversal(int[] ar, int d)
	{
		int  low=ar[0];
		int high=ar[ar.length-1];
		while(high>low)
		{
			
		}
		
	}
	
	public static void main(String[] args) {
		
	}

}
