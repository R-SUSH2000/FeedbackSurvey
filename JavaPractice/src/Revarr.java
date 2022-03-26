public class Revarr {

	public static void main(String[] args) {
		int ar[]= {1,23,4,5};
		int j=ar.length;
		for(int i=0; i<j;i++)
		{
			ar[j-1]=ar[i];
			j =j-1;
		}
		for(int i=0;i<ar.length;i++)	
		{
			System.out.print(","+ar[i]);
		}
	}
}