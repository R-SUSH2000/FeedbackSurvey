import java.util.Scanner;

public class FibonacciNo 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("first number- ");
		int a= sc.nextInt();
		System.out.println("second number- ");
		int b=sc.nextInt();
		System.out.println("nth num");
		int n=sc.nextInt();	
		for (int i=2;i<=n;i++)
		{
			int temp= b;
			b=a+b;
			a=temp;	
		}
		System.out.println(a);
		sc.close();
	}
		
}
