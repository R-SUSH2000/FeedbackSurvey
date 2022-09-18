import java.io.*;
public class MaximumSumCir {
	
	int FibRecc(int n) {
		if(n==0)
			return 0;
		else if (n==1)
			return 1;
		else {
			return FibRecc(n-2)+FibRecc(n-2);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));
		String rs= rd.readLine();
		int n =Integer.parseInt(rs);
		int a=0,b=1;
		System.out.print(a+" ");
		for(int i=0;i<=n;i++)
		{
			System.out.print(b+" ");
			int f=a+b;
			a=b;
			b=f;
		}
		
	}

}
