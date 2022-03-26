import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("number-");
		int n=123;//sc.nextInt();
		int newn=0;
		while(n>0)
		{
			int rem=n%10;
			n/=10;
			newn=newn*10+rem;
		}
	}
}
