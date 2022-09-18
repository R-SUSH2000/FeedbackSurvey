
public class tweeqe {
	
	int largest (int a) {
		int max=0, t=0;
		while(a>0)
			t=a%10;
			if (max<t)
				max=t;
			a=a/10;
		return max;	
	}
	int smallest(int a)
	{
		int min=0, t=0;
		while(a>0)
			t=a%10;
			if (min>t)
				min=t;
			a=a/10;
		return min;	
	}
	int num(int a,int b,int c)
	{
		
		int key = (largest(a)+largest(b)+largest(c))+(smallest(a)+smallest(b)+smallest(c));
		return key;
	}
	

	public static void main(String[] args) {
		tweeqe t= new tweeqe();
		System.out.println(t.num(234, 124, 421));

	}

}
