package set;
import java.util.*;
public class DistinctEle {

	public static void main(String[] args) {
		int ar[]= {30,20,20,20,25,30};
//		for(int i=0 ;i<ar.length;i++)
//		{
//			boolean flag=false;
//			for(int j=0;j<i;j++)
//				if (ar[i]==ar[j])
//					{flag=true;
//						break;}
//			if (flag==false)
//			{
//				System.out.println(ar[i]);
//			}
//		
//		}
		HashSet<Integer> h=new HashSet<Integer>();
		for(int a=0;a<ar.length;a++)
		{	h.add(ar[a]);
			if(h.contains(ar[a])==true)
		}
		for(int a:h) {System.out.println(a);}	
//		Iterator it= h.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next()+" ");
//		}
	}
}
