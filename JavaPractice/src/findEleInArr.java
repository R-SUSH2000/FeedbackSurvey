
public class findEleInArr {
	
	int findEle(int []ar,int x )
	{
		for (int i=0;i<ar.length;i++)
		{
			if(ar[i]==x)
			{return i;}
		}
		return -1;
	}

	public static void main(String args[])
	{
		int []ar= {12,32,12,323,2};
		findEleInArr f= new findEleInArr();
		int e=f.findEle(ar, 32);
		System.out.println(e);
	}
}
