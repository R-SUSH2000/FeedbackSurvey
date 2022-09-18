
public class primeFactorCal {
	
	boolean isPrime(int n) {
		
		if (n <= 1)
            return false;
		
		for(int i=2;i<n;i++)
		{
			if(n%i!=0)
			{
				return false;
			}
		} 
		return true;
	}
	
	void primeFactors(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(isPrime(n))
			{
				System.out.println("the number is prime number");
				break;
			}
			else {
				
				
			}
			
		}
	}

	public static void main(String[] args) {
		
	}

}
