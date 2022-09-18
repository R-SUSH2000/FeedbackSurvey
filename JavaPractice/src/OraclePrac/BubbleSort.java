package OraclePrac;
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		int ar[]= {19,23,1,41,4};
		for(int i=0;i<ar.length;i++)
		{
			boolean swap=false;
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j+1]<ar[j])
				{	
					swap=true;
					int temp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=temp;
				}
			}
			if(swap==false)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(ar));
	}

}
