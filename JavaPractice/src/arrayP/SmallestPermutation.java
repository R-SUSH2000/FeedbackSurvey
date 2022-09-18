package arrayP;

import java.util.Arrays;

public class SmallestPermutation {
	static long Permute(long x)
	{
		int n=(int)x;
		int i=0;
		int []ar=new int[4];
		while(n>0)
		{
			ar[i]=n%10;
			n=n/10;i++;
		}
		Arrays.sort(ar);
		int ans = 0;
	    // Traverse the array arr[]
	    for(int z = ar.length-1; z >=0 ; z--)
	    {
	        // Stores the count of digits of
	        // arr[i]
	        //int l = (int)Math.floor(Math.log10(ar[z]) + 1);
	        // Update ans
	        //ans = ans * (int)Math.pow(10, l);
	    	  a=ar[z]*10;
	        //Increment ans by arr[i]
	    	  ans =ans+a;
	    }
	    // Return the ans
	    return (long)ans;
	}
	public static void main(String[] args) {
		System.out.print(Permute(9569));
	}

}
