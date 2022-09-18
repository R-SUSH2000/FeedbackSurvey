package hashing;
import java.util.*;

class UsingArray{
	
	void printfrequency(int ar[]) {
		for(int i=0;i<ar.length;i++)
		{
			boolean b=false;
			for(int j=0;j<i;j++)
			{	if(ar[j]==ar[i])
					{b=true; break;}
			}
			
			if(b=true) {continue;}
			int c=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
					c++;
			}
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10,5,20,5,10,5};int c=0;
		for(int i=0;i<ar.length;i++)
		{ for(int j=i+1;j<ar.length;j++)
			{ if (ar[i]==ar[j]){c++;} }
		}
	}
}
public class FrequencyOfElement {
	public static void main(String[] args) {
		int[] ar = {10,5,20,5,10,5};
		HashMap<Integer,Integer> m= new HashMap<>();
		for(int a:ar)
		{
//			m.put(a,)
		}
	}
}
