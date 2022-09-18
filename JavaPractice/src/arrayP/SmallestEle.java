package arrayP;

public class SmallestEle {

	public static void main(String[] args) {
		int a[]= {9,7,3,2,8,1,0,-1,2,3};
		int s=a[0];
		for(int i=0;i<a.length;i++)
		{
			if (a[i]<s)
			{
				s=a[i];
			}
			
		}System.out.println(s);

	}

}
