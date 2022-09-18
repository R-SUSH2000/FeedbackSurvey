package OraclePrac;
import java.util.Arrays;
public class InsertionSort {

	public static void main(String[] args) {
		int ar[]= {20,5,40,60,10,30};
		for(int i=1;i<ar.length;i++)
		{
			int key=ar[i];
			int j=i-1;
			while(j>=0&&ar[i]>key)
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
		System.out.println(Arrays.toString(ar));

	}

}
