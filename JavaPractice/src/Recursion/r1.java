package Recursion;

public class r1 {
	
	static void func(int n)
	{
		if(n==0)
			return;
		func(n/2);
		System.out.println(n%2);
	}
	
	static int fact(int n) {
		if (n==0)
			return 1;
		return n*fact(n-1);
		
	}
	static void mNum(int n){
		if(n==0)
			return;
		System.out.println(n+",");
		mNum(n-1);
		
	}  
	
	public void upNum(int n)
	{
		if(n==0)
			return;
		upNum(n-1);
		System.out.print(n+",");
	}
//	public int fibo(int n,int k)
//	{
//		if(n== 0)
//			return 0;
//		return fib(n-1)+fib(n-2)  
//		
//	}
	public static void main(String args[])
	{
//		func(7); 
//		mNum(9);
//		r1 r=new r1();
//		r.upNum(9);
//		System.out.println(sum(3));
		System.out.println(fact(4));
	}
	
	static int sum(int n) {
		if(n==0)
			return 0;
		return n+sum(n-1);
	}

}
 