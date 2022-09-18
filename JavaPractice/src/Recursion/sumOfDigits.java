package Recursion;

public class sumOfDigits {
	
	public int sum(int n )
	{
		if (n<10)
			return n;
		return (sum (n/10)+n%10);
	}
}
