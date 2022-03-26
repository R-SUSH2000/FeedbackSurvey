import java.util.*;
public class sliceArr {

	public static void main(String[] args) {
		
		int ar[]= {-12,23,2,-11,-132,12};
		int ca[]=new int[ar.length];
		int c=0;
		for(int i=0;i<ar.length;i++) {
		if (ar[i]>0)
		{
			ca[c]=ar[i];
			c++;
		}
		System.out.println(c);
		}
		for(int ele:ca)
		System.out.println(","+ele);
		
		Arrays.sort(ar);
		for(int ele:ar)
			System.out.print(";"+ele);
	}

}
