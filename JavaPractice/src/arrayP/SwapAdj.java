package arrayP;

public class SwapAdj {

	public static void main(String[] args) {
		int []a = {1,2,3,4};int t;
		int []b=  {1,2,3,4,5};
		for(int i=0;i<a.length-1;i++) {
			if (i%2==0)
			{
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
		for(int n:a)
		{
			System.out.print(n+ " ");
		}

	}

}
