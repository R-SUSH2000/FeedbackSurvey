
public class reversingArr {

	
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		int l=0,h=(ar.length-1);
		while(l<h)
		{
			int temp=ar[l];
			ar[l]=ar[h];
			ar[h]=temp;
			l++;h--;
		}
		for (int i=0;i<ar.length;i++)
		{
			System.out.println(ar);
		}
		System.out.println();
//		int i,j;
//		for(i=0;i<ar.length;i++)
//		{
//			for(j=(ar.length-1);j==0;j--)
//			{
//				ar[j]=ar[i];
//			}
//		}
//		for(elemnets:arr)
//		{
//			System.out.println(elements);
//		}
	}
	

}
