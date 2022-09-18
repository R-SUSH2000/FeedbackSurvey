package set;
import java.util.*;
public class CommonInTwoArray {

	public static void main(String[] args) {
		int ar[]= {10,15,20,25,30,50};
		int br[]= {30,5,15,80};
		
		for(int i=0;i<ar.length;i++)
		{
			boolean f=false;
			for(int j=0;j<br.length;j++)
			{
				if(ar[i]==br[j])
					{f=true;
					break;}
			}
			if (f==false)
			{
				System.out.println(ar[i]+"");
			}
		}
		
		
		
		HashSet<Integer> m=new HashSet<>();
		HashSet<Integer> p=new HashSet<>();
		for (int a:ar) {m.add(a);}
		for (int a:br) {p.add(a);}
		m.retainAll(p);
		Iterator it=m.iterator();
		while(it.hasNext()) {System.out.println(it.next());}
	}

}
