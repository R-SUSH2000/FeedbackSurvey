
public class frequenciesInSortedArr {

	public static void main(String[] args) {
		int ar[]= {12,12,12,35,30,30};
		int c=0,i=0,j;
		for(i=0;i<ar.length;i++)
		{
			for(j=i+1;j<i;j++)
			{
				if(ar[i]==ar[j])
					{c++;}
			System.out.println(ar[i]+"-"+c);
			}
			System.out.println(ar[i]+"-"+c);
		}
	}

}
