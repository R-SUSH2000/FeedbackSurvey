import java.util.Scanner;

public class FibonacciNoL {
	
	static void fib(int n) {
		int n1=0 ,n2=1,c=0;
		while (c<n) {
			System.out.println(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			c++;
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("till -");
		int n=sc.nextInt();
		//0 1 1 2 3 
		fib(n);
		sc.close();
		
	}


}
