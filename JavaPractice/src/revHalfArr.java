
public class revHalfArr {

	public static void main(String[] args) {
		int []ar = {1,2,3,4,5,6,7};
		int s=ar.length;
		for(int i=(s/2);i<(s-1);i++)
		{
			int temp=ar[i];
			ar[i]=ar[s-1];
			ar[s-1]=temp;
		}
		for(int ele:ar)
		{
			System.out.print(","+ele);
		}

	}

}
