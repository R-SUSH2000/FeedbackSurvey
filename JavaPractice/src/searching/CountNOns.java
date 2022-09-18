package searching;

import java.util.Stack;

public class CountNOns {
	int countOns(int []ar,int n)
	{
		 int low=0,high=n-1;
		 while(low<=high)
		 {
			 int mid=(low+high)/2;
			 if (ar[mid]==0)
				 low=mid+1;
			 else if (mid==0||ar[mid-1]==0)
				 return n-mid;
			 else high=mid-1;
		 }
		 return 0;
	}
	
	public static void main(String[] args) {
		Stack<Integer> s= new Stack<Integer>();
		int[] ar= {123,4,131,421};
		for(int n:ar)
		{
			s.push(n);
		}
		System.out.println(s.pop());
	}
}
