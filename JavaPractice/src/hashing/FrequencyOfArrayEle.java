package hashing;
import java.util.*;
public class FrequencyOfArrayEle {

	public static void main(String[] args) {
		int ar[]= {10,12,10,15,10,20,12,12};
		HashMap<Integer,Integer> map= new HashMap<Integer, Integer>();
		for(int i=0;i<ar.length;i++)
		{
			map.put(ar[i],(map.getOrDefault(ar[i],0)+1));
		}
		for(Map.Entry<Integer, Integer> e:h.entrySet())
		{
			
		}
		System.out.println(map);

	}

}
