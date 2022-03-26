public class moveZerosToEnd {

	public int[] move(int []ar) {
		int c=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				int temp=ar[i];
				ar[i]=ar[c];
				ar[c]=temp;
				c++;
			}
		}return ar;
		
	}
	public static void main(String[] args) {
		

	}  

}
