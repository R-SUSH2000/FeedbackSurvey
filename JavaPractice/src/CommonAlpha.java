import java.util.Arrays;

public class CommonAlpha {
	
	int Sum1(char []a,char []b)
	{	int sum=0;
		Arrays.sort(a);
		Arrays.sort(b);
		int[] c= new int[a.length];
		int min=Math.min(a.length,b.length);//System.out.println(min);
		for(int i=0;i<min;i++)
		{
			if(a[i]==b[i])
				c[i]=Integer.parseInt(String.valueOf(a[i]));
				System.out.println(c[i]);
		}
		for(int n:c)
			{sum=sum+n;}//System.out.println(n);}
		int tsum=0;
		while(sum>10)
			{tsum=tsum+sum%10;
			sum=sum/10;}
		return tsum;
	}
	public static void main(String[] args) {
		CommonAlpha c= new CommonAlpha();
		char[] z= {'a','b','c'};
		char[] d= {'b','c'};
		System.out.println(c.Sum1(z,d));
	}
}
