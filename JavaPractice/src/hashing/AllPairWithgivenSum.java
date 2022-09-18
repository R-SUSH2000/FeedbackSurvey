package hashing;
import java.util.*;
class pair {
	 long first, second;  
	    public pair(long first, long second)  
	    {  
	        this.first = first;  
	        this.second = second;  
	    }  
}
public class AllPairWithgivenSum {

	public pair[] PairWithgivenSum(long a[], long b[], long n, long m, long x) {
		HashSet<Long> hs=new LinkedHashSet<Long>();
		for(long bl:b)
			{hs.add(bl);}
		Arrays.sort(a);
		ArrayList<pair> al=new ArrayList<pair>();
		for(int i=0;i<n;i++)
		{
			if(hs.contains(x-a[i]))
			{
				al.add(new pair(a[i],x-a[i]));
			}
		}
		pair[] ans=new pair[al.size()];
		for(int i=0;i<ans.length;i++)
		{
			ans[i]=al.get(i);
		}
		return ans;
} // 
}