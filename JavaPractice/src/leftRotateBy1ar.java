
public class leftRotateBy1ar {

	public int[] lRotate(int []ar) {
		int c=ar.length;
		int temp=ar[0];
		for(int i=1;i<c;i++)
		{
			ar[i-1]=ar[i];
		}
		ar[c-1]=temp;
		return ar;
		
	}
	public static void main(String[] args) {
		int ar[]= {12,3,24,5};
		leftRotateBy1ar lf = new leftRotateBy1ar();
		int arr[]=lf.lRotate(ar);
		for(int ele:arr)
		{System.out.print(" "+ele);}

	}

}
