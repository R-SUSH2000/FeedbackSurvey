package OraclePrac;

public class ChkForSorted {

	public static void main(String[] args) {
		int ar[]= {15,24,4552,535,46};
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]>ar[i])
					System.out.println("N");
			}
		}
		System.out.println("T");
		}

}
