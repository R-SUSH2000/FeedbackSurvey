package arrayP;

public class PreFixSum {

	static int PreFixSumAr(int ar[],int l){
		int sum =0,i=0;
		for(int a:ar)
			{sum+=a;}
		while(i<l)
		{sum -=ar[i];
		i++;}
		return sum;
	}
	public static void main(String[] args) {
		int ar[]= {2,8,3,9,6,5,4};
		int sum =0,l=1,r=3;
		for(int i=0;i<=r;i++)
		{
			sum+=ar[i];
		}
		System.out.println(sum);
		int x=0;
		while(x<l)
		{
			sum-=ar[x];
			x++;
		}
		System.out.println(sum);
		System.out.println(PreFixSumAr(ar,3));
	}
}
