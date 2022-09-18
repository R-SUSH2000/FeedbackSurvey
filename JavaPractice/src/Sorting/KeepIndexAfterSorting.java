package Sorting;
import java.util.*;
class numberMerge{
	int number,index;
	public numberMerge(int n,int i) {
		number=n;index=i;
	}
}
public class KeepIndexAfterSorting {
	
	void NumbM(int ar[]) {
		int n=ar.length;
		ArrayList<numberMerge> a1=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			a1.add(new numberMerge(ar[i],i));
		}
		Collections.sort(a1,(ai1,ai2)->(ai1.number-ai2.number));
		
	}
	public static void main(String[] args) {
		
	}
	
}

