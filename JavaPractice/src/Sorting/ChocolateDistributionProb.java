package Sorting;
import java.util.Arrays;
public class ChocolateDistributionProb {
	
	static int ChocolateDistribution(int ar[],int m) {
		if(m>ar.length)
		{return Integer.MAX_VALUE;}
		Arrays.sort(ar);
		int res=ar[m-1]-ar[0];
		for(int i=1;(i+m-1)<ar.length;i++)
		{
			res=Math.min(res,ar[i+m-1]-ar[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		int ar[]= {7,3,2,4,9,12,56};
		System.out.println(ChocolateDistribution(ar, 3));

	}

}
