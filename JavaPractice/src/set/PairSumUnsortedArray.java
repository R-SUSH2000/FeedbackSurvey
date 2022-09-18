package set;
import java.util.*;
public class PairSumUnsortedArray {

	
	public static void main(String[] args) {
		int ar[]= {3,2,8,15,-8};
		int k=17;
		for (int i=0;i<ar.length;i++)
		{
			for(int j=i;j<ar.length;j++)
			{
				int sum =0;
				sum = ar[i]+ar[j];
				if(sum==k)
					System.out.println("true");
				
			}
		}
		int sumh=0;
		HashSet<Integer> a= new HashSet<>();
		for(int i=0;i<ar.length;i++)
		{
			if(a.contains(sumh-ar[i]))
			{
				System.out.println("True");
			}
			else a.add(ar[i]);
		}
	}

}
