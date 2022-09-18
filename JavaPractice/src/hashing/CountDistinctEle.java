package hashing;
import java.util.*;
public class CountDistinctEle {
	public static void main(String[] args) {
		int ar[]= {10,10,10,10,};int c=0;
		HashSet<Integer> map= new HashSet<Integer>();
		for(int i=0;i<ar.length;i++)
		{
			if(map.contains(ar[i])==false)
			{
				map.add(ar[i]);
				c++;
			}
		}
		System.out.println(c);
	}
}
