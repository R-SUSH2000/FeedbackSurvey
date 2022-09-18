package set;
import java.util.*;
public class PrintRepeatingEle {
	
	public static void main(String[] args) {
		int ar[]= {10,8,10,7,7,6};
		HashSet<Integer> h= new HashSet<Integer>();
		for(int i=0;i<=ar.length;i++)
		{
			if(h.contains(ar[i])==true)
			{
				System.out.println(ar[i]);
			}
			else 
				h.add(ar[i]);
		}
		 
//		for(int i=1;i<=ar.length;i++)
//		{ 
//			boolean flag=false;
//			for(int j=0;j<i;j++)
//			{
//				if(ar[i]==ar[j])
//					flag=true;
//					break;
//			}
//			if(flag==true)
//			{System.out.println(ar[i]);;}
//		}	
}
}
