package hashing;
import java.util.*;
public class SubArray {

	public static void main(String[] args) {
		int ar[]= {1,4,13,-3,4,-10,-3,5};
		int k=4;
		HashMap<Integer,Integer> m= new HashMap<>();
		for(int i=0;i<k;i++)
		{
			m.put(ar[i],m.getOrDefault(ar[i],0)+1);
			System.out.println(m.size());
		}
		for(int i=k;i<ar.length;i++)
		{
			if(m.get(ar[i-k])==1)
				m.remove(ar[i-k]);
			else
				m.put(ar[i], m.get(ar[i-k])-1);
			m.put(ar[i],m.getOrDefault(ar[i], 0)+1);
			System.out.println(m.size());
		}
		
		
	}

}
