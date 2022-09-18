package hashing;
import java.util.*;
public class FrequencyOfEle {

	public static void main(String[] args) {
		int []ar= {10,20,10,20,20};
		HashMap<Integer,Integer> m=new HashMap<>();
		for(int i=0;i<ar.length;i++)
		{
			m.put(ar[i], m.getOrDefault(ar[i],0)+1);
		}
		for(Map.Entry x:m.entrySet())  
		{
			System.out.println(x.getKey()+" -> "+x.getValue());
			
		}
	}
}
