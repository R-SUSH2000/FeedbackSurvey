package OraclePrac;

public class LeftRotateByOne {
		
	void rotateBY1(int ar[])
	{
		int tmep=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			ar[i-1]=ar[i];
		}
		ar[ar.length-1]=tmep;
	}
	void leftRotate(int ar[],int d)
	{
		int[] temp=new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i]=ar[i];
		}
		for(int i=d;i<ar.length;i++)
		{
			ar[i-d]=ar[i];
		}
		for(int i=0;i<d;i++)
		{
			ar[ar.length-d+i]=temp[i];
		}
	}
		public static void main(String[] args) {
			int ar[]= {1,2,34,5,4};
		}
		
}
