package OraclePrac;

public class MergeSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,34,5,4};
		int br[]= {10,24,4,35,24};
		int i=0,j=0;
		while(i<ar.length&&j<br.length)
		{	if(ar[i]<=br[j])
			{
				System.out.print(ar[i]+"-");
				i++;
			}
			else 
			{
				System.out.print(br[j]+"-");
				j++;
			}
		}
		while(i<ar.length)
		{
			System.out.print(ar[i]+"-");i++;
		}
		while(j<br.length)
		{
			System.out.print(br[j]+"-");j++;
		}

	}

}
