
public class Revar {
	
	int[] RemoveDupli(int[] ar) {
		int res=1; 
		for(int i=1;i<ar.length;i++)
		{
			if(ar[res]!=ar[res-1])
			{
				ar[res]=ar[i];
				res++;
			}
		}return ar;
	}

	public static void main(String[] args) {
		int []ar = {10,5,7,30,9};
		
		int low = 0,high=ar.length-1,c=-1;
		for(int i=1;i<(ar.length/2);i++)
		{
			while (low<high) {
			c=ar[low];
			ar[low]=ar[high];
			ar[high]=c;
			low++;high--;
			}
		}
		for (int a:ar) {
			System.out.println(a);}

	}

}
