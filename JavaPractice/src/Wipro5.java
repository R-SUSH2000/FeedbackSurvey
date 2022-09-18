
public class Wipro5 {
	
	int SumOFPrime(int ar[],int n)
	{
		int minp=0,minnp=0,sump=0,sumnp=0;
		for(int i=0;i<n;i++)
		{
			if(isPrime(ar[i]))
			{	
				sump = sump+ar[i]; 
				if(ar[i]<ar[minp])
					minp=i;
			}
			else {
				sumnp = sumnp + ar[i];}
		}
		if (sump>0) {
			return sump-ar[min];
		}
		else {
			
		}
	}
	
	boolean isPrime(int n)
    {
		if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		Wipro5 w= new Wipro5();
		int ar[]= {3,5,6,7};
		System.out.println(w.SumOFPrime(ar,4));
	}

}
