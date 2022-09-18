package OraclePrac;

public class LeaderInArr { 

	public static void main(String[] args) {
		int ar[]= {7,10,4,3,6,5,2}; 
		for(int i=0;i<ar.length;i++)
		{
			boolean f=false;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<=ar[j])
				{
					f=true;
					break;
				}
				if(f==false)
					System.out.print(ar[i]+"-");
			}
		}

	}

}
