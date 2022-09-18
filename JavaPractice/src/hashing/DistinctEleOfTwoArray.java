package hashing;
import java.util.HashSet;
public class DistinctEleOfTwoArray {
	

	
	public static void main(String[] args) {
		int a[]= {10,15,20,15,30,30,5};
		int b[]= {30,5,30,80};int c=0;
		HashSet<Integer> s=new HashSet<Integer>();
		for(int i:a) {s.add(i);}
		for(int i=0;i<b.length;i++)
		{
			if(s.contains(b[i]))
			{
				c++;
				s.remove(b[i]);
			} 
		}
		System.out.println(c);
	}

}
