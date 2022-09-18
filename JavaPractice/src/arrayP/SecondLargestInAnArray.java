package arrayP;

public class SecondLargestInAnArray {
	
	static int Largest(int ar[])
	{
		int num=0;
		for(int a:ar)
		{
			if(num<a)
				num=a;
		}return num;
	}
	
	static int SecondLargest(int ar[]) {
		int secLar=0;
		int lar=Largest(ar);
		for(int i=0;i<ar.length;i++)
		{
			if(secLar<ar[i]&&ar[i]!=lar)
				secLar=ar[i];
			else continue;
		}
		return secLar;
		 
	}
	
	public static void main(String[] args) {
		int ar[]= {100,100,100};
		//SecondLargestInAnArray s= new SecondLargestInAnArray();
		System.out.println(SecondLargest(ar));
	}

}
