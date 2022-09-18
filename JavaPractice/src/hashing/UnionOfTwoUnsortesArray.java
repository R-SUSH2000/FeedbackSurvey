package hashing;
import java.util.HashSet;

public class UnionOfTwoUnsortesArray {
	public static void main(String[] args) {
	int a[] ={15,20,5,15};
	int b[] ={15,15,15,20,10};int res=0;
	HashSet<Integer> h=new HashSet<Integer>();
	for(int a1:a) {h.add(a1);}
	for(int i=0;i<b.length;i++)
	{
		if(h.contains(b[i]))
		{
			res++;
			h.remove(b[i]);
		}
	}
	System.out.println(res+h.size());
}
}
