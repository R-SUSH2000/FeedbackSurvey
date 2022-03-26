package StringQ;

public class revStr {

	public static void main(String[] args) {
		int ar[]= {2,3,11,6,4,8,1};
		int size= ar.length;
		int res=ar[1]-ar[0];
		for (int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				int temp=ar[j]-ar[i];
				if (temp>res)
				{
					res=temp;
				}
			}
		}System.out.println(res);
		}
		

}
          